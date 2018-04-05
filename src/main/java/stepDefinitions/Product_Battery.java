package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Product_Battery {
	
	WebDriver driver;
	
	@Given("^User is already on Home Page$")
	public void Giver_User_is_already_on_Home_Page()
	{
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
	     Assert.assertTrue(title.contains("RS Components | Electronic and Electrical Components"));
	}
	
	@When("^User search for Battery from Search tab$")
	public void User_search_for_Battery_from_Search_tab()
	{
		driver.findElement(By.xpath(".//*[@id='searchTerm']")).sendKeys("Battery");
	}
	
	@Then("^User click on Search Icon$")
	public void User_click_on_Search_Icon()
	{
		driver.findElement(By.xpath(".//*[@id='btnSearch']")).click();
	}
	
	@Then("^User is on Search Page Result$")
	public void User_is_on_Search_Page_Resultb()
	{
		String title = driver.getTitle();
		 System.out.println("Search Page title ::"+ title);
	     Assert.assertTrue(title.contains("Batteries | RS Components"));
	}
	
	@Then("^Brower is closed$")
	public void Brower_is_closed() 
	
	{
	driver.quit();
	}
	
	
}



