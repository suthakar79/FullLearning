const { chromium }=require('playwright');
(async()=>{
    const browser=await chromium.launch({headless:false,slowMo :200});
    const page=await browser.newPage();
    await page.goto("http://google.com");
    //type test
    await page.type('input[@name=q]','sample',{delay:200});
   // searchText.type("sample",{delay:200});
    await browser.close();

})();