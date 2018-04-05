package util;


	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

	

	public class TestBase {
		
		public static WebDriver driver;
		public static Properties prop;
		
		public TestBase(){
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(System.getProperty("/Users/test/Desktop/RSComponent/RSComp"
						+ "+/src/main/java/config/config.properties"));
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myprofile = profile.getProfile("default");
			
			new DesiredCapabilities();
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setCapability(FirefoxDriver.PROFILE,myprofile);
			dc.setCapability("marionette",true);
			
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://uk.rs-online.com/web/authHome.html");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			driver.get(prop.getProperty("url"));
			
			
			
			
		}
			
		
		
		
}
