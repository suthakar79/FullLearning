package utility;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class ChromHeadLess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	   	ChromeDriver driver = new ChromeDriver(capabilities);	
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page Title: " +title);
		
		 Select oSelection = new Select(driver.findElement(By.id("continents")));
		 
         // Step 4:) Select option 'Europe' (Use selectByIndex)
         //oSelection.selectByValue("Europe");
		 
         // Using sleep command so that changes can be notice
         try {
			Thread.sleep(2000);
			 // Step 5: Select option 'Africa' now (Use selectByVisibleText)
	         oSelection.selectByIndex(2);
	         Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

         // Step 6: Print all the options for the selected drop down and select one option of your choice
         // Get the size of the Select element
         List<WebElement> oSize = oSelection.getOptions();

         int iListSize = oSize.size();
         // Setting up the loop to print all the options
         for (int i = 0; i < iListSize; i++)
         {
             // Storing the value of the option 
             String sValue = oSize.get(i).getText();
             // Printing the stored value
             System.out.println("Value of the Select item is : " + sValue);

             // Putting a check on each option that if any of the option is equal to 'Africa" then select it 
             if (sValue.equals("Africa"))
             {
                 oSelection.selectByIndex(i);
                 break;
             }

         }
   
		
		
		driver.quit();
		}


}