const { default: $ } = require("webdriverio/build/commands/browser/$");

describe('first webdriver io', async () => {
    it('first webdriverio test ', async () => {
        await browser.url("https://www.ebay.com")
        await  expect(browser).toHaveTitle("Electronics, Cars, Fashion, Collectibles & More | eBay")  
        let searchbox=await $('#gh-ac]')
        await browser.waitUtil(async ()=>(searchbox.isDisplayed()),{timeout:10000,timeoutMsg:'expected searchbox is not displayed after waited 10s'});
        await browser.saveScreenshot('./screenshot.png') 
        await searchbox.saveScreenshot('element.png')
        // searchbox.addValue('Computer')
        // $('//*[@id="gh-btn"]').click()
    });
    
});