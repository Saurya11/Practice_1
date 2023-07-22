package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage_3 
{
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[text()='Add to cart']") private WebElement cart;
	@FindBy(xpath="//button[text()='Remove']") private WebElement remove;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	
	public SwagLabHomePage_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean getSwagLabHomePagelogo()
	{
		boolean result = logo.isDisplayed();
		return result;
	}
	
	public void clickSwagLabHomePagecart()
	{
		cart.click();
	}
	public String getSwagLabHomePageremovetext()
	{
		String acttext = remove.getText();
		return acttext;
	}
	public void clickSwagLabHomePagemenubtn()
	{
		menu.click();
	}

}
