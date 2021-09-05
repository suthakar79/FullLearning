package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePages {

	WebDriver driver;
	public GooglePages(){}
	public GooglePages(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getInputBox() {
		return inputBox;
	}

	public void setInputBox(WebElement inputBox) {
		this.inputBox = inputBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	@FindBy(id="lst-ib")
	public WebElement inputBox;
	
	@FindBy(name="btnK")
	public WebElement searchButton;
	
	public void launchApplication(String url)
	{
		driver.get(url);
	}
	
	public void clearandEnterValue(WebElement e,String value ){
		e.click();
		e.clear();
		e.sendKeys(value);
	}
	
	public void clickObject(WebElement e ){
		waitForElements(e);
		e.click();
		
	}
	
	public void waitForElements(WebElement e)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}
}
