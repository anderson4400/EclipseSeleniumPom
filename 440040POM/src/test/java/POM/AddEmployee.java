package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddEmployee extends BasePom{

	public AddEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Campo de la ventana de AddEmployee
	
	//Boton add Employee
	By BtnAddEmployee= By.xpath("//a[normalize-space()='Add Employee']");
	
	//Campo fist Name
	By CampoFistName= By.xpath("//input[@placeholder='First Name']");
	
	//Campo Middle Name
	By CampoMiddleName= By.xpath("//input[@placeholder='Middle Name']");
	
	//Campo Last Name
	By CampoLastName= By.xpath("//input[@placeholder='Last Name']");

	//Boton Save
	By BtnSave= By.xpath("//button[@type='submit']");
	
	//Mensaje de confirmacion
	By AlerMensaje= By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']");
	
	public void AgregarAddEmploee(String FistName, String MiddleName, String LastName) throws InterruptedException {
		 Thread.sleep(5000);
		if(isDisplayed(BtnAddEmployee)) {
			Clic(BtnAddEmployee);
			Type(FistName,CampoFistName );
			Type(MiddleName,CampoMiddleName );
			Type(LastName,CampoLastName );
			Thread.sleep(11000);
			Clic(BtnSave);
			
					String mensaje = ObtenerTexto(AlerMensaje);
					Assert.assertEquals(mensaje,"Success\n" +
		                     "Successfully Saved");	
				

		}else {
			System.out.println("El elemento no esta disponible para interactuar");
		}
	}
	
}
