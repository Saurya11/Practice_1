package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage
{
	//step-1 declaration
	@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logout;
	
	//step-2 initialization
	
	public SwagLabMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step-3 usage
	
	public void clicklogout()
	{
		logout.click();
	}

}
