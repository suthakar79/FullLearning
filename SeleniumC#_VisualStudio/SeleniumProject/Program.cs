using System;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.DevTools.V85.HeapProfiler;
using OpenQA.Selenium.DevTools.V85.Page;

namespace SeleniumProject
{
    class Program
    {
        public  string name { set; get;} //Encapsulation

        private string grade //C# properites which is equal to encapsulation
        {
            get
            {
                return grade;
            }
            set
            {
                grade = value;
            }
        }


        static void Main(string[] args)
        {
            Console.Write("test case started ");
            int val1=0, val2=0;
         ////create the reference for the browser  
         //   IWebDriver driver = new ChromeDriver();
         //   // navigate to URL  
         //   driver.Navigate().GoToUrl("https://www.google.com/");
         //   Thread.Sleep(2000);
         //   // identify the Google search text box  
         //   IWebElement ele = driver.FindElement(By.Name("q"));
         //   //enter the value in the google search text box  
         //   ele.SendKeys("javatpoint tutorials");
         //   Thread.Sleep(2000);
         //   //identify the google search button  
         //   IWebElement ele1 = driver.FindElement(By.Name("btnK"));
         //   // click on the Google search button  
         //   ele1.Click();
         //   Thread.Sleep(3000);
            Program program = new Program(); // Creating Object  
            Console.WriteLine("Value before passing \n val1 = " + val1 + " \n val2 = " + val2);
            program.Show(out val1, out val2); // Passing out argument  
            Console.WriteLine("Value after passing \n val1 = " + val1 + " \n val2 = " + val2);
            program.name = "sample";
            Console.WriteLine(program.name);
        }
        public void Show(out int a, out int b) // Out parameter  
        {
            int square = 5;
            a = square;
            b = square;
            // Manipulating value  
            a *= a;
            b *= b;
        }
    }
}
