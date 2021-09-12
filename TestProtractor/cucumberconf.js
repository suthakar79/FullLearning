exports.config = {
    directConnect:true,
    SELENIUM_PROMISE_MANAGER: false,
    capabilities: {
        browserName:'chrome',
        args: ['no-sandbox']
    },
    framework: 'custom',  // set to "custom" instead of cucumber.
    frameworkPath: require.resolve('protractor-cucumber-framework'),  // path relative to the current config file
    specs: [
        './test/feature/*.feature'     // Specs here are the cucumber feature files
    ],
    // cucumber command line options
    cucumberOpts: {
        'no-colors': true,
        require: ['./test/stepdefinitions/*.js'],  // require step definition files before executing features
        tags: '@tag1',                      // <string[]> (expression) only execute the features or scenarios with tags matching the expression
        strict: true,                  // <boolean> fail if there are any undefined or pending steps
//        format: ['pretty'],            // <string[]> (type[:path]) specify the output format, optionally supply PATH to redirect formatter output (repeatable)
        dryRun: false,                 // <boolean> invoke formatters without executing steps
        compiler: [],                   // <string[]> ("extension:module") require files with the given EXTENSION after requiring MODULE (repeatable)
        failFast: true
    },
    onPrepare: function () {
        browser.manage().window().maximize(); // maximize the browser before executing the feature files
        const {Given, Then, When} = require('cucumber');
            global.Given = Given;
            global.When = When;
            global.Then = Then;
        
    },
    getPageTimeout: 50000,
    allScriptsTimeout: 50000,
    plugins: []
    
};