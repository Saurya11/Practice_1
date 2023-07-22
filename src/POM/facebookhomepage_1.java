package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookhomepage_1
{
	@FindBy(xpath="//span[text()='Welcome to Facebook, Saurabh']") private WebElement text;
	@FindBy(id="//html[@id='facebook']") private WebElement account;
	
	public facebookhomepage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getfacebookhomepage_1text()
	{
		String result = text.getText();
		
		System.out.println(result);
	}
	
	public void clickfacebookhomepage_1account()
	
	{
		
		account.click();
	}

}
