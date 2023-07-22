package POM_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage_1
{
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[text()='Add to cart']") private WebElement cart;
	@FindBy(xpath="//button[text()='Remove']") private WebElement remove;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	
	
	public SwagLabHomePage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean getverifySwagLabHomePagelogoresult()
	{
		boolean result = logo.isDisplayed();
		return result;
	}
	public void clickSwagLabHomePagecart()
	{
		cart.click();
	}
	public String getSwagLabHomePageremovebtn()
	{
		String acttext = remove.getText();
		return acttext;
	}
	public void clickSwagLabHomePagemenu()
	{
		menu.click();
	}
 
}
