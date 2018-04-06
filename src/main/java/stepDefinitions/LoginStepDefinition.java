package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("^User open browser$")
	public void User_open_browser() 
	{
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("default");
		
		new DesiredCapabilities();
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE,myprofile);
		dc.setCapability("marionette",true);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://uk.rs-online.com/web/authHome.html");
		
	}
	
	
	@When("^User enter user name and password$")
	public void User_enter_User_name_and_password()
	{
		driver.findElement(By.name("username")).sendKeys("priyanka.pccs");
		driver.findElement(By.name("j_password")).sendKeys("Mar.2018");
		
		
	}
	
	@Then("^user click on Log In button$")
	public void user_click_on_Log_In_button()
	{
    driver.findElement(By.name("loginBtn")).click();
	}
    
	@Then("^user is on Home page$")
	public void user_is_on_Home_page()
	{
		String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
     Assert.assertTrue(title.contains("RS Components | Electronic and Electrical Components"));
	}
	
	@Then("^Browser is closed$")
	public void Brower_is_closed() 
	
	{
	driver.quit();
	}
}
