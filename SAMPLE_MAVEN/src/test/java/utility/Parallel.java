package utility;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Parallel {
 
 
  @Test
  public void f() {
	  System.out .println("i am F");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 1");
	  
  }
 
  @Test
  public void f1() {
	  System.out .println("i am F1");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 2");
  }
  
  @Test
  public void f2() {
	  System.out .println("i am F2");
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
      //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 3");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
