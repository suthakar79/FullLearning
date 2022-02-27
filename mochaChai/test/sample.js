const jp = require('jsonpath');

describe('Javascript example ', () => {
    it.skip('javascript example ', () => {
        console.log("Welcome to jave Script ")

        function multiply(a,b){
            return a*b;
          }
          
          function currying(fn){
            return function(a){
              return function(b){
                return fn(a,b);
              }
            }
          }
          
          var curriedMultiply = currying(multiply);
          
         console.log(multiply(4, 3)); // Returns 12
          
         console.log(curriedMultiply(4)(3)); // Also returns 12

         const arr=[1,2,3,4,5,6]
         const arrfilter=arr.map(myfunction);
         console.log(arrfilter);
         function myfunction(value){
             return value*3;
         }
        
         //currying is a advance technique to transform the function with N arguments in to n number of functions with oe or less arguments
         function add(a){
             return(function(b){
                 return(a+b);
             })
         }
         console.log(add(94)(5));

        //call back functions
        console.log("callback are functionas are passed as arguments to another functions and it is executed the after function executed")
        function divideByHalf(sum){
            console.log(Math.floor(sum / 2));
          }
          
          function multiplyBy2(sum){
            console.log(sum * 2);
          }
          
          function operationOnSum(num1,num2,operation){
            var sum = num1 + num2;
            operation(sum);
          }
          
          operationOnSum(3, 3, divideByHalf); // Outputs 3   here dividByHalf function as call back function this will get executed after operationOnSum 
          operationOnSum(5, 5, multiplyBy2); // Outputs 20 
          console.log("Memoized fun is function will return results from cache if we pass the same arguments from second time onwards instead of executing full function")
          function memoizedAddTo256(){
            var cache = {};
          
            return function(num){
              if(num in cache){
                console.log("cached value");
                        
              }
              else{
                cache[num] = num + 256;
                   }
              return cache[num]
            }
          }
          
          
          var memoizedFunc = memoizedAddTo256();
          
          console.log(memoizedFunc(20)); // Normal return
          console.log(memoizedFunc(20)); // Cached return
          //Construtor func 
          function person(name,age,gender){
            this.name = name;
            this.age = age;
            this.gender = gender;

          }
         //the above constructor function  is same as below Class decclaration 
        // class person {
        //     constructor(name, age, gender) {
        //         this.name = name;
        //         this.age = age;
        //         this.gender = gender;
        //     }
        // }
              
          var person1 = new person("Vivek", 76, "male");
          console.log(person1.name);
          
          var person2 = new person("Courtney", 34, "female");
          console.log(person2);
    });

    it('rest and spread parameters', () => {
        function add(...num){  // num used as rest parameters which accepts n of values into single array
            let sum=0;
            for(let i=0;i<num.length;i++)
            {
                sum+=num[i];
            }
            console.log("Sum with rest parameters ===>"+sum);
        }
        //function call with rest parameters
        add(2,345,676,89,12,45,657,88)
        
        //Spread parameters
        function add(a,b,c,d,e,f){  // num used as rest parameters which accepts n of values into single array
            let sum=a+b+c+d+e;
            console.log("Sum with spread parameters ===>"+sum);
        }
        //function call with Spread parameters
        let arr=[2,345,676,89,12,45,657,88]
        add(...arr) // function call we are using arr as Spread parameter with ...

        // Object destructuring
        const classobj={
            name:"Ravi",
            rollno:'123',
            mark:'78',
        }
        console.log("obj destructuring")
        const {name,rollno,mark:MathMarks}=classobj  //obj destructuring in one line
        console.log(name)
        console.log(rollno)
        console.log(MathMarks)
        console.log("Array destructuring")
        //Array destructring
        var array=[1,2,3,4];
        const [first,second,third,fourth]=array; //Array destructuring in one line
        console.log(first);
        console.log(second);
        console.log(third);
        console.log(fourth)
        //closure =========================================
        //The ablitiy of function is to store the variable/functions in to variable for further reference is called closure
        function closurefn(age){
            var obj1={name:'RAVI',age:45}
            return function(){
                console.log("Name is "+obj1.name+"  Age : "+age);
            }
        }
        let saveClosureFn=closurefn(67);//Function stored into variables called saveClosureFn
        saveClosureFn();

      //detect the name of the browser
      //window.navigator.userAgent
      let x=4 ;
      x='sankar' //not possible with const if we declare const x=4 
      console.log(x);
      //   // Nullish Coalescing Operator ??  it is assigned value if it pass if not it will value after the operator ??
      // const foo = {
      //   bar: 0
      // }
      
      // const valueBar = foo.bar ?? 42;
      // const valueBaz = foo.baz ?? 42;
      
      // // Value of bar: 0
      // console.log("Value of bar: ", valueBar);
      
      // // Value of bar: 42
      // console.log("Value of baz: ", valueBaz);

      var x1 = 220;
      var y = "Hello";
      var z = undefined;
      var a=0;
              
     console.log(x1 || y )   // Returns 220 since the first value is truthy  If the first value is truthy, then the first value is returned. Otherwise, always the second value gets returned.
     console.log(z || y )      // return hello since fisrst value is falsey   
     console.log(x1 || z )     // Returns 220 since the first value is truthy
    console.log("Bpth are false using || "+z || a)        
     console.log(x1 && y )     // Returns "Hello" since both the values are truthy
              
     console.log(y && z )    // Returns undefined since the second value is falsy
              
      if( x && y ){ 
        console.log("Code runs" ); // This block runs because x && y returns "Hello" (Truthy)
      }   
              
      if( x || z ){
        console.log("Code runs");  // This block runs because x || y returns 220(Truthy)
      }

      //Call function used to pass object to the fun withour argument defined in the function
      function sayHello(){
        return "Hello " + this.name;
      }
            
      var obj = {name: "Sandy"};
              
      console.log(sayHello.call(obj));

      //apply method in 
      const array1=[1,3,5,8,2,3,4,5]
      console.log("max using MAth from array "+Math.max.apply(null,array1));

      var str = "I have a Lenovo Laptop, a Honor Phone, and a Samsung Tab.";
        var Obj = {
            Lenovo: "Dell",
            Honor: "OnePlus",
            Samsung: "Lenovo"
        };
      
        var RE = new RegExp(Object.keys(Obj).join("|"), "gi");

        console.log(str.replace(RE, function(matched) {
          return Obj[matched];
      }));
   
    });

    it('Json path example', () => {
      
      var json={
     "store": {
        "book": [ 
          { "category": "reference",
            "author": "Nigel Rees",
            "title": "Sayings of the Century",
            "price": 8.95
          },
          { "category": "fiction",
            "author": "Evelyn Waugh",
            "title": "Sword of Honour",
            "price": 12.99
          },
          { "category": "fiction",
            "author": "Herman Melville",
            "title": "Moby Dick",
            "isbn": "0-553-21311-3",
            "price": 8.99
          },
          { "category": "fiction",
            "author": "J. R. R. Tolkien",
            "title": "The Lord of the Rings",
            "isbn": "0-395-19395-8",
            "price": 22.99
          }
        ],
        "bicycle": {
          "color": "red",
          "price": 19.95
        }
      }
    }
    res1 = jp.nodes(json, "$..author").toJSONString();
    res2 = jp.paths(json, "$..author", {resultType:"PATH"}).toJSONString();
    console.log(res1);
    console.log(res2);
    
    });
    it.only('LinkedIn Javascript assesment', () => {
      //1
      const x=6%2;
      const y=x?'one':'two';
      console.log(" The out of the Question 1 : "+y);

      //2
      const foo={
        bar(){
          console.log("hello world");
        },
        name:"ravi",
      }
      //3
      var a=['one','two','three'];
      a[100]='fox';
      console.log(" The out of the Question 3 : "+a.length);
      //4
      var things;
      let func=(str=' no args')=>{
        console.log(str);
      }
      func(things);
      func(null);

      //5
      var p=['a','j','C','s'];
      p.pop();
      console.log(p.pop());
      //6
      let animal=['j','e'];
      animal.pop();
      console.log(animal.pop());
      //7
      var v=1;
      var f1=function(){
        console.log(v);
      }
      var f2=function(){
        var v=2;
        f1();
        
      }
      f2();
      //8
      let a1=5
      console.log("the anwers to Question 8 ");
      console.log(a1++);
      console.log(++a1);
      //9
      console.log("the anwers to Question 9 ");
      const obj1={
        a:1,
        b:2,
      };
      const obj2={
        ...obj1,
        a:0,
      };
      console.log(obj2.a,obj1.b);

    });
    
});