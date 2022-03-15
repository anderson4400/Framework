package Test;

import org.openqa.selenium.By;
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
	
	
	
	public  WebDriver driver() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");
		Driver = new ChromeDriver();
		return Driver;
	}
	
	//Metodo que abre el navegador, recibe un parametro en este caso la Url del Portal
	public void navegarUrl(String Url) {
		if(!Url.equalsIgnoreCase("") || Url != null) {
			Driver = driver();
			Driver.get(Url);
			Driver.manage().window().maximize();
		}else {
			System.out.print("Favor de Suministrar la Url");
		}
	}
	
	//Metodo para realizar click por el Id del Objecto
	public void  hacerClick(String Obj) {
		if(!Obj.equalsIgnoreCase("") || Obj != null) {
			Driver.findElement(By.id(Obj)).click();
		}else {
			System.out.print("Favor de Suministrar el Id del objecto a interacturar");
		}
	}
	
	public void poblarCampo(String Obj, String text) {
		if(!Obj.equalsIgnoreCase("") || Obj != null) {
			if(!text.equalsIgnoreCase("") || text != null) {
				Driver.findElement(By.id(Obj)).sendKeys(text);
			}else {
				System.out.print("Favor Suministrar el Texto a suministrar en el campo");
			}
		}else {
			System.out.print("Favor de Suministrar el Id del objecto a interacturar");
		}
	}
	
	
	
}
