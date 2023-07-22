package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage_1
{
	@FindBy(xpath="//input[@name='email']") private WebElement UN;
	@FindBy(xpath="//input[@name='pass']") private WebElement PWD;
    @FindBy(xpath="//button[@name='login']") private WebElement login;
    
    public facebookloginpage_1(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void inpfacebookloginpage_1username()
    {
    	UN.sendKeys("Saurabhban96@gmail.com");
    }
    public void inpfacebookloginpage_1password()
    {
    	PWD.sendKeys("Saurabh@11");
    }
    
    public void clickfacebookloginpage_1loginbtn()
    {
    	login.click();
    }

}
