var homepage=function(){
this.entertext=element(by.model('person.name'));
this.clickcontinue=element(by.buttonText('CONTINUE'));
this.dynamicText=element(by.binding('person.name'));

};

module.exports=new homepage();
