var homepage=function(){
this.entertext=function(value){
	element(by.model('person.name')).sendKeys(value);
};
this.clickcontinue=function(){
	element(by.buttonText('CONTINUE')).click();
};
this.dynamicText=function(){
	return element(by.binding('person.name')).getText();
};
};

module.exports=new homepage();
