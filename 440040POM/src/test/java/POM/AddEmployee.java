package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddEmployee extends BasePom{

	public AddEmployee(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Se cambiaron los By por los FindBy(PageFactory para inicializar los elementos Web para optimizar)
	
	//Campo de la ventana de AddEmployee
	//Boton add Employee
	@FindBy (xpath = "//a[normalize-space()='Add Employee']") WebElement BtnAddEmployee;
	
	//Boton Pim
	@FindBy (xpath = "//span[normalize-space()='PIM']") WebElement BtnPim;
	
	//Campo fist Name
	@FindBy (xpath = "//input[@placeholder='First Name']") WebElement CampoFistName;
	
	//Campo Middle Name
	@FindBy (xpath = "//input[@placeholder='Middle Name']") WebElement CampoMiddleName;
	
	//Campo Last Name
	@FindBy (xpath = "//input[@placeholder='Last Name']") WebElement CampoLastName;
	
	//Boton Save
	@FindBy (xpath = "//button[@type='submit']") WebElement BtnSave;
	
	//Mensaje de confirmacion
	@FindBy (xpath = "//div[@class='oxd-toast-content oxd-toast-content--success']") WebElement AlerMensaje;
	
	//Employee Id
	@FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input") WebElement InputEmployeeId;
	
	  //Se Agrego otro parametro para para le Id del Employee
	public void AgregarAddEmploee(String FistName, String MiddleName, String LastName,String NumeroId) throws InterruptedException {
		 Thread.sleep(5000);
		if(isDisplayed(BtnPim)) {
			Clic(BtnPim);
			 Thread.sleep(5000);
			if(isDisplayed(BtnAddEmployee)) {
			Clic(BtnAddEmployee);
			 Thread.sleep(5000);
			if(isDisplayed(CampoFistName)) {
			Type(NumeroId,InputEmployeeId );
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
			}else {
				System.out.println("El elemento no esta disponible para interactuar");
			}
		}else {
			System.out.println("El elemento no esta disponible para interactuar");
		}
	}
	
}
