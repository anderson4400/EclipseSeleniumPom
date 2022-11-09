package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePom{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//los campos del login del portal de orageHRM

	//campo username
	@FindBy (xpath = "//input[@placeholder='Username']") WebElement CampoUserName;

	//campo password
	@FindBy (xpath = "//input[@placeholder='Password']") WebElement CampoPassword;

	//Boton de login	
	@FindBy (xpath = "//button[@type='submit']") WebElement BtnLogin;

	//imagen de la plataforma 
	@FindBy (xpath = "//img[@alt='company-branding']") WebElement img;

	
	public void RegistroLogin(String UserName, String Password) throws InterruptedException {
		 Thread.sleep(5000);
		if(isDisplayed(img)) {
			Type(UserName, CampoUserName);
			Type(Password, CampoPassword);
			Clic(BtnLogin);
		}else {
			System.out.println("El elemento no esta disponible para interactuar");
		}
	}
	
	
}
