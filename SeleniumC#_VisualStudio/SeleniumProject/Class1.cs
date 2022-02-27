using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;


namespace SeleniumProject
{
    class NUnitExample
    {
        private IWebDriver driver;
        [SetUp]
        public void setup()
        {
            driver=new ChromeDriver();
            driver.Manage().Window.Maximize();
            driver.Url = "https://www.facebook.com/";
        }

        [Test]
        public void test()
        {
            IWebElement ele = driver.FindElement(By.Id("email"));
            //enter the username value  
            ele.SendKeys("xyz11@gmail.com");
            Thread.Sleep(2000);
            Console.Write("username value is entered \n");
            //identify the password text box  
            IWebElement ele1 = driver.FindElement(By.Name("pass"));
            //enter the password value  
            ele1.SendKeys("########");
            Console.Write("password is entered \n");
            //click on the Login button  
            IWebElement ele2 = driver.FindElement(By.Id("u_0_b"));
            ele2.Click();
            Thread.Sleep(3000);
            Console.Write("login button is clicked \n");
        }

        [TearDown]
        public void EndTest()
        {
            //close the browser  
            driver.Close();
        }
    }
}
