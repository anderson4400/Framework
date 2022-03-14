package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Driver {
	private WebDriver usar;
	
	@BeforeClass
	public void driver(){
		System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
		usar = new ChromeDriver();
		usar.navigate().to("https://www.google.com/?hl=es");
	}
	

}
