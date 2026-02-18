package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	
	By userId = By.id("userName");
	By password = By.id("password");
	By loginButton = By.id("loginButton");
	By dashboardUsername = By.id("postLoginusername");
	
	
	
	//Methods
	
	public void inputUserName(String username) {
		driver.findElement(userId).sendKeys(username);	
	}
	
	public void inputPassword(String valid_password) {
		driver.findElement(password).sendKeys(valid_password);	
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();	
	}
	
	public String verifyDashboard() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardUsername));
		return driver.findElement(dashboardUsername).getText();	
	}
	

	

}
