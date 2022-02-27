describe('my first protractor test',function(){
	beforeEach(function(){
		browser.get('http://www.thetestroom.com/jswebapp/index.html');
		browser.waitForAngular(); // this method will wait for all the angular releated obj
	});
	afterEach(function(){
		console.log('after each method');
		
	});
	//xit means that the below it block will not executed meaning the entire block has been commented
 it('zoohomepage',function() {
	element(by.model('person.name')).sendKeys('sample Data');
	var animaltext=element(by.binding('person.name'));
	expect(animaltext.getText()).toEqual('sample Data');
	element(by.buttonText('CONTINUE')).click();
	element(by.model('animal')).$("[value='2']").click();
	element(by.partialButtonText('CONTINUE')).click();
	});
it('check the number of item in the dropdown',function() {
		element(by.buttonText('CONTINUE')).click();
		//css class denoted by . (dot)
		element.all(by.css(".ng-pristine option")).then(function(items) {
		expect(items.length).toBe(4);
		expect(items[1].getText()).toContain("Turtle");	
		console.log(items[1].getText());
		});
		element(by.buttonText('CONTINUE')).click();
	});
	var home=require('./pageobject.js');// importing the page 
it('check the page object ',function(){
		home.entertext("page object test");
		var dText=home.dynamicText();
		expect(dText).toBe("page object test");
		home.clickcontinue();
	});
	//another page object which contains only object name and identification not functions associated with it.
	var homepage=require('./pageobject1.js');// importing the page 
	it('using another page objects',function(){
	homepage.entertext.sendKeys("value to passed");
	var text=homepage.dynamicText.getText();
	expect(text).toBe("value to passed");
	homepage.clickcontinue.click();
		
	});
});