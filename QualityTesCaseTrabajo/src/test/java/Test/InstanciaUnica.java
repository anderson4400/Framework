package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanciaUnica {
	
	private WebDriver Driver;
	static private InstanciaUnica instaciaUnica = new InstanciaUnica();
	
	static public InstanciaUnica getInstanciaUnica() {
		if(instaciaUnica == null) {
			instaciaUnica = new InstanciaUnica();
		}
	
		return instaciaUnica;
	}
	
	public void  driver(){
		System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
		Driver = new ChromeDriver();
	}
	
}
