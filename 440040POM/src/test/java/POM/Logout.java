 package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BasePom{

	public Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Boton del ferfil del usuario
	By BtnPefil = By.xpath("//img[@class='oxd-userdropdown-img']");
	
	//Boton Logout
	By BtnLogout = By.xpath("//a[normalize-space()='Logout']");
	
	
	
	public void RealizarLogout() throws InterruptedException {
		 Thread.sleep(5000);
		if(isDisplayed(BtnPefil)) {
			Clic(BtnPefil);
			Clic(BtnLogout);
		}else {
			System.out.println("El elemento no esta disponible para interactuar");
		}
	}
}
