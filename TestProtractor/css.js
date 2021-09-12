describe('my first protractor test',function(){
	beforeEach(function(){
		browser.get('http://www.thetestroom.com/jswebapp/index.html');
	});
	afterEach(function(){
		console.log('after each method');
		
	});
 it('check css functionalities',function() {
	//css tag
	
	element(by.css('input')).sendKeys("tagvalue");
	
	//css class . refers class
	element(by.css('.ng-binding')).getText().then(function(text){
	console.log('css class name '+text);
	});
	
	//css id # denoted id
	
	element(by.css('#continue_button')).click();
	
	//css child nodes find table tag then find td which has a tag 
	element(by.css('table td a')).getText().then(function(text){
		console.log(text);
	});
	
	//css chaining -means find the button tage which attribute value continue_button
	element(by.css('button#continue_button')).click();
	
	//css attribute
	element(by.css('[id="title"]')).getText().then(function(text){
		console.log(text);
		
	});
	
	});

});