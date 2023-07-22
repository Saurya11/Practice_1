package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class 1
public class SwagLabLoginPage 
{
	//step-1 declaration
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
	
	//step-2 initialization
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //classname.methodname(webdriverobject,this)
		
	}
	
	//step-3
	public void enterUN()
	{
		UN.sendKeys("standard_user");
	}
	public void EnterPWD()
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	
	


}
