const axios=require('axios').default; // to get intellisense working we have to inport with default options
const expect=require('assert');
describe('axios example for API operation',function(){

    it.skip('axios example for Api',function(){
        axios.('https://chercher.tech/sample/api/product/read')
             .then(res=>{
                 expect.equal(res.status,200,"statuscode is not right");
                 console.log(res.data)
                })
             .catch(err)
             done();
    })

   
})