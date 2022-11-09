package POM;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePom {
	
	private WebDriver driver;

	
	public BasePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebDriver DriverConection(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
	public void Type(String txt, WebElement locator) {
		locator.sendKeys(txt);
	}
	
	public void Clic(WebElement locator) {
		locator.click();
	}
	
	public boolean isDisplayed (WebElement locator) {
		try {
			locator.isDisplayed();
			return true;
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}		
	}
	
	public void visit(String url,WebDriver driver) {
		if(url != null && url.length() >0) {
			driver.get(url);
			driver.manage().window().maximize();
		}else {
			System.out.println("Favor suministrar una URL");
		}
	}
	
	public String  ObtenerTexto(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOf(locator));
		String valor = Category_Body.getText();
		return valor;
	}
	
	public String  ObtenerTexto() {
		String valor = driver.switchTo().alert().getText();
		return valor;
	}

}
