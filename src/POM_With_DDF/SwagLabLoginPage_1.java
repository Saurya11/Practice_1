package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage_1
{
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	
	public SwagLabLoginPage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void inpSwagLabLoginPageUN(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLabLoginPagePWD(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickSwagLabLoginPagelogbtn()
	{
		login.click();
	}
}
