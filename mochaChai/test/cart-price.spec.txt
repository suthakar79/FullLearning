var Request = require("request"); 
var expect = require('chai').expect;
var fs = require('fs');// Used to Read Input Jsonfile 
const process = require('process'); 
var apiUtilPage = require(process.cwd()+'/apiHelper/apiUtil');
describe("YUM Assessment testing", function() {
	var cart_idFromcartAPI;
	var productId1;
	var price_prodID1;
	var MenuResponseJsonObj;
	const header={
		"content-type":"application/json",
		"Authorization": "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjExMDIwYTczIn0.eyJhdWQiOiJ0ZXN0X2F1ZGllbmNlIiwiY3VzdG9tZXJfaWQiOiJmODk5ZDIwMC0yMzkzLTQwOGYtYjA3Yy1kYzY0N2QzMmVlMjgiLCJleHAiOjE2MTM2Njg2NjUsImlhdCI6MTU4MjE0NjE1NSwiaXNzIjoiaHR0cHM6Ly9kZXYtY29tbWVyY2UueXVtLXBvYy5jb20iLCJzY29wZSI6ImZ1bGxfc2NvcGUifQ.IMAhK4CfZ-w20vAq4W-vaEdtD1BVUKjPutuaWsM9o08297ULkKdAnNp2U3TELwd-EhNt2Ak4KvgUTqOZJ9w7ncAhDYAp9yb0ClNcYWxcBHzoUDh8jnywc7kdzFbeeh6TEdr_euOot1botxOIUY-WPQB9B06jEwt7WU9_sKRqVKBZk-DV2O_5V4s7yKDyziGMnq0zuLRFIRYJiixICkoWD5UJUSwEll5TvIZKaNP4gd8KlMucG_snymuwYK5XYfXaPansKKL_mkFPKWB-83wwphN7qGjFB8TSjihk15fa2XRFR2Iay4E_z3oO2OJz15zmFJ5det9gNgIm8Kt7LJXLZQ"
			};
	const baseUrl= "https://dev-commerce.yum-poc.com/v1/";
	// The Below it block used to publish Menu for the Stores KFC0001
	  	it("Publish Full Menu", function(done) {
            Request.get({
                    "header":header,
                    "url": baseUrl+"stores/KFC0001/menu"
                },(error, response, body) => {
                    if (error) { return console.log(error);}
				 // validating Response code 200 to proceed further validation
				   expect(response.statusCode).to.equal(200);
                    //Converting api response to JavaScript object and assign it to variable
					 MenuResponseJsonObj=JSON.parse(body);
					done();
                });
            });
            
        //The below it block used to get Cart id from Cart Api 
    	it.only("Create Cart", function(done) {
		   	try{
			  const createCartRequest = fs.readFileSync(process.cwd()+'/test/createcart.json','utf8')
			  console.log("Create Cart Request  :"+createCartRequest);
				Request.post({
					  "header":header,	
            		  "url": baseUrl+"cart",
            		  "body":createCartRequest           	           		  
            	  },(error, response, body) => {
            	    if (error) { return console.dir(error);}
            	    expect(response.statusCode).to.equal(200);
                    console.dir("Create CartID Response : ")
                    //Extracting Card_id from the response obj
                    var CartResponseJsonObj=JSON.parse(body);
                    cart_idFromcartAPI=CartResponseJsonObj.cart_id; // store CartID to variable for later validation 
                    console.log(CartResponseJsonObj);
                    done();
				}); //Request block
			}catch(err){console.log(err)}	
            });// it block 
           
            //The Below it block used to add products to Cart created by CreatCart API
        it("Add Product to Cart", function(done) {
			    	
            var CartResponseJsonObj="";
             try {
            	//ProductObj=product1;
			  for(let i=1;i<=2;i++){ // Reading two Product Request from JSON file 
				  const data = fs.readFileSync(process.cwd()+'/test/product'+i+'.json', 'utf8')
            	  console.log("ADD Product Request :"+i);//Log Request on the console
            	  console.log(data); 
            	  
          	  Request.post({
          	  	  "headers":header,
          		  "url": baseUrl+"cart/products",          		    		  
          		  "body":data //Passing input request to Post request
          		  
          	  },(error, response, body) => {
				  if (error) { return console.dir(error);}
				expect(response.statusCode).to.equal(200);
          	      console.dir("ADD Product Response for Product:"+i);
                  CartResponseJsonObj=JSON.parse(body);
				  console.log(CartResponseJsonObj);
				//assert CartId from createCartID Response
                  expect(CartResponseJsonObj.cart_id).to.equal(cart_idFromcartAPI);
                  ProductObj=JSON.parse(data);
                 // Retrieve price for ProductID  and sizeId  from MenuAPI Response for the Product added in the cart 
	             // extract productID and sizeid from AddProduct request 
	             // First args : PublishMenu response object
	             // Second args: Productid from CartRequest
	             // Third args :sizeid from CartRequest
                    getProductPriceFromMenu(MenuResponseJsonObj.pricing,ProductObj.product_id,ProductObj.size_id);
                 //Perform CartPrice validation with Menu API Response 
		           	CartPrice_Validation_WithMenuAPI1(CartResponseJsonObj,ProductObj.product_id,ProductObj.size_id); 
		          //To calculate the total price for the cart if the price value equal to Menu Price
		           	console.dir("Total Price of the Cart : "+CartResponseJsonObj.total);
		           	console.log("=======================================")
          	}); //Request block closure
          	//ProductObj=product2;	
              }// For Loop closure
            } catch (err) { console.error(err)}
              done();
        });// it block closure for ADD Product to Cart 
           
        	
			/*
			this function used to validate the base price of product against with Price from PublishMenu API for the same product
			Obj- AddproductCart API Response Object
			prodID-ProductID of the price validation
			SizeID-SizeID of the product for unique identification
			*/
			function CartPrice_Validation_WithMenuAPI1(obj,prodId,sizeID){
        		var priceDiff=false;
        		console.log("NEW CartPrice Validation with Menu API Price")
        		console.dir("========================================")
        		try{
					Found:
					for(let i=0;i<=obj.products.length-1;i++){
        			if(obj.products[i].product_id==prodId & obj.products[i].size_id==sizeID & price_prodID1==obj.products[i].base_price){
        		    				console.log("Cart Price value same from MENU for the Product : "+obj.products[i].product_id);
        		    				priceDiff=false;
        		    				break Found;}
        		    			else {
        		    				
        		    				priceDiff=true;
        		    				cartPrice=obj.products[i].base_price;
        		    			}
        		    				
        		    }
        		   		    
        		}catch(Err){console.log(Err);}
        		if(priceDiff)
        			console.log("Price value are different from MENU:  Cart Price : "+cartPrice+" MenuPrice : "+price_prodID1);	
        	}

        	/*
        	 * Retrieve price from PublishMenu Response based on the prodId and SizeID
        	 * Obj-MenuResponseJSONObj;
			 * prodId-Product id of the product to retrieve Price ;
			 * sizeID-SizeID provide unique Identification of the Product 
        	 */	
        	function getProductPriceFromMenu(obj,prodId,sizeID){
        		try{
        			var jsonObj=JSON.parse(JSON.stringify(obj));
        			 for(var k in jsonObj){
        		    	if(typeof obj[k] === 'object'){
        		    		for(let i=0;i<=obj[k].length-1;i++){
        		    			if(obj[k][i].price!=0 && obj[k][i].price!=null && obj[k][i].product_id==prodId && obj[k][i].size_id==sizeID ){
        		    				productId1=obj[k][i].product_id;
        		    				price_prodID1=obj[k][i].price;
        		    				console.log("Price Retrieved from Menu API for the Product ID --> "+obj[k][i].product_id+"  price --> "+obj[k][i].price);}
        		    		}
        		    	}
        		    }
        		}catch(Err){console.log(Err);}
        		
        	}
			   	
            });//describe block