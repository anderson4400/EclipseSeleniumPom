package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class AddEmployee_Test {
	
	
	private WebDriver driver;
	AddEmployee addEmployee;
	Login login;
	Logout logout;
	
  @Test
  public void f() throws InterruptedException {
	  AddEmployee addEmployee = new AddEmployee(driver);
	  Login login = new Login(driver);
	  Logout logout = new Logout(driver);
	  
	  
	  login.RegistroLogin("Admin","admin123");
	  addEmployee.AgregarAddEmploee("dasdas", "dasdas", "dasdas");
	  logout.RealizarLogout();
  }
  
  @BeforeTest
  public void beforeTest() {
	  addEmployee = new AddEmployee(driver);
	  driver=addEmployee.DriverConection(driver);
	  addEmployee.visit("https://opensource-demo.orangehrmlive.com/",driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
