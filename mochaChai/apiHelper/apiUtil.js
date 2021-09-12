var apiUtil=function(){
    const axios = require('axios');
    const Header={
        "content-type":"application/json",
        "Accept":"application/json"
		//"Authorization": "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjExMDIwYTczIn0.eyJhdWQiOiJ0ZXN0X2F1ZGllbmNlIiwiY3VzdG9tZXJfaWQiOiJmODk5ZDIwMC0yMzkzLTQwOGYtYjA3Yy1kYzY0N2QzMmVlMjgiLCJleHAiOjE2MTM2Njg2NjUsImlhdCI6MTU4MjE0NjE1NSwiaXNzIjoiaHR0cHM6Ly9kZXYtY29tbWVyY2UueXVtLXBvYy5jb20iLCJzY29wZSI6ImZ1bGxfc2NvcGUifQ.IMAhK4CfZ-w20vAq4W-vaEdtD1BVUKjPutuaWsM9o08297ULkKdAnNp2U3TELwd-EhNt2Ak4KvgUTqOZJ9w7ncAhDYAp9yb0ClNcYWxcBHzoUDh8jnywc7kdzFbeeh6TEdr_euOot1botxOIUY-WPQB9B06jEwt7WU9_sKRqVKBZk-DV2O_5V4s7yKDyziGMnq0zuLRFIRYJiixICkoWD5UJUSwEll5TvIZKaNP4gd8KlMucG_snymuwYK5XYfXaPansKKL_mkFPKWB-83wwphN7qGjFB8TSjihk15fa2XRFR2Iay4E_z3oO2OJz15zmFJ5det9gNgIm8Kt7LJXLZQ"
			};
    this.get=async function(sUrl){
    try{    
        const res=await axios({
            method:'get',
            url:sUrl,
            header:Header,
        });
        
        return await res;
        }catch(Err){console.log("failed to get response for the url :"+sUrl+" Error :"+Err)}
    } //end of function

}
module.exports=new apiUtil();

/*it("Publish Full Menu", async()=>{
				const url= baseUrl+"stores/KFC0001/menu";
				const MenuResponseJsonObj=apiUtilPage.get('https://reqres.in/api/users?page=2');
				console.log("status code :",await MenuResponseJsonObj.status);
				//console.log("Data :",await MenuResponseJsonObj.data);
		
				}); */   