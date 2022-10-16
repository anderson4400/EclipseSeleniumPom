package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {
	
	private WebDriver driver;
	Login login;
	
  @Test
  public void f() throws InterruptedException {
	  Login login = new Login(driver);
	  login.RegistroLogin();
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
