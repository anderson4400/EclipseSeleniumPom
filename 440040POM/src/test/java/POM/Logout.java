 package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePom{

	public Logout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//Se cambiaron los By por los FindBy(PageFactory para inicializar los elementos Web para optimizar)
	
	//Boton del ferfil del usuario
	@FindBy (xpath = "//img[@class='oxd-userdropdown-img']") WebElement BtnPefil;
	
	//Boton Logout
	@FindBy (xpath = "//a[normalize-space()='Logout']") WebElement BtnLogout;


	
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
