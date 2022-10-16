package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePom{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String Username = "Admin";
	String Password = "admin123";
	
	//los campos del login del portal de orageHRM
	
	//campo username
	By CampoUserName = By.xpath("//input[@placeholder='Username']");

	//campo password
	By CampoPassword = By.xpath("//input[@placeholder='Password']");
	
	//Boton de login
	By BtnLogin = By.xpath("//button[@type='submit']");
	
	//imagen de la plataforma 
	By img = By.xpath("//img[@alt='company-branding']");
	
	
	public void RegistroLogin() throws InterruptedException {
		 Thread.sleep(5000);
		if(isDisplayed(img)) {
			Type(Username, CampoUserName);
			Type(Password, CampoPassword);
			Clic(BtnLogin);
		}else {
			System.out.println("El elemento no esta disponible para interactuar");
		}
	}
	
	
}
