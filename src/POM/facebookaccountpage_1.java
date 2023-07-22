package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookaccountpage_1 
{

	@FindBy(xpath="//span[text()='Log Out']") private WebElement logout;
	
	public facebookaccountpage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickfacebookaccountpage_1logoutbtn()
	{
		logout.click();
	}
}
