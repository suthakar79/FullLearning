// An example configuration file.
exports.config = {
  directConnect: true,

  // Capabilities to be passed to the webdriver instance.
  //Single browser
//  capabilities: {
//    'browserName': 'chrome'
//  },
  //Run test in parall in mutltiBrowser
  multiCapabilities: [{
	  'browserName': 'firefox'
	}, {
	  'browserName': 'chrome'
	}],
  // Framework to use. Jasmine is recommended.
  framework: 'jasmine',

  // Spec patterns are relative to the current working directory when
  // protractor is called.
  specs: ['ravi.js'],

  // Options to be passed to Jasmine.
  jasmineNodeOpts: {
    defaultTimeoutInterval: 20000,
	showColors: true  }
};
