package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_test {
	
	private WebDriver driver;
	Login login;
	
  @Test
  public void f() throws InterruptedException {
	  Login login = new Login(driver);
	  login.RegistroLogin("Admin","admin123");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  login = new Login(driver);
	  driver=login.DriverConection(driver);
	  login.visit("https://opensource-demo.orangehrmlive.com/",driver);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  

}
