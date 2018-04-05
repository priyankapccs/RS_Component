package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Product_Connectors {

WebDriver driver;
	
	@Given("^User is already on Home Page$")
	public void Giver_User_is_already_on_Home_Page()
	{
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
	     Assert.assertTrue(title.contains("RS Components | Electronic and Electrical Components"));
	}
	
	@When("^User search for Connectors from Search tab$")
	public void User_search_for_Battery_from_Search_tab()
	{
		driver.findElement(By.xpath(".//*[@id='searchTerm']")).sendKeys("Connectors");
	}
	
	@Then("^User click on Search Icon$")
	public void User_click_on_Search_Icon()
	{
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
	}
	
	@Then("^User is on Search Page Result$")
	public void User_is_on_Search_Page_Result()
	{
		String title = driver.getTitle();
		 System.out.println("Search Page title ::"+ title);
	     Assert.assertTrue(title.contains("Buy connector online from RS Components"));
	}
	
	@Then("^User click on PCB Connector Contacts$")
	public void User_click_on_PCB_Connector_Contacts()
	{
		driver.findElement(By.id(".//*[@id='galleryPopularCategory']/li[10]/a")).click();
	}
	
	@Then("^User is on Shopping Page$")
	public void User_is_on_Shopping_Page()
	{
		String title = driver.getTitle();
		 System.out.println("Search Page title ::"+ title);
	     Assert.assertTrue(title.contains(" PCB Connector Contacts | RS Components"));
	}
	
	@Then("^User click on ADD button$")
	public void User_click_on_ADD_button()
	{
		driver.findElement(By.xpath(".//*[@id='atbBtn-1']")).click();
	}
	
	@Then("^User click on Cart button$")
	public void User_click_on_Cart_button()
	{
		driver.findElement(By.xpath(".//*[@id='pageHeader']/div/div[3]/a/i")).click();
	}
	
	@Then("^User is on Cart Page$")
	public void User_is_on_Cart_Page()
	{
		String title = driver.getTitle();
		 System.out.println("Search Page title ::"+ title);
	     Assert.assertTrue(title.contains("basketsummary"));
	}
	
	@Then("^User click on Checkout securely$")
	public void User_click_on_Checkout_securely()
	{
		driver.findElement(By.xpath(".//*[@id='checkoutSecurelyAndPuchBtn']")).click();
	}
	
	
	@Then("^Brower is closed$")
	public void Brower_is_closed() 
	
	{
	driver.quit();
	}
}
