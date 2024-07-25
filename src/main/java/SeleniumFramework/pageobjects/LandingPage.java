package SeleniumFramework.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import SeleniumFramework.AbstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	
	
	WebDriver driver;
	
	

	public LandingPage(WebDriver driver) {
		
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement login;
	
	@Test(groups= {"Regression"}, retryAnalyzer=Retry.class)
	
	public void loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		login.click();
		
	}
	
	@DataProvider
	public Object[][] getData(){
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("pavan@gmail.com", "ABC@123");
		map.put("kumar@gmail.com", "XYZ@123");
	}
	
	
	

}
