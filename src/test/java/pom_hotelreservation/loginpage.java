package pom_hotelreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	@FindBy(id="username")
	private static WebElement username;
	
	@FindBy(id="password")
	private static WebElement password;
	
	@FindBy(id="login")
	private static WebElement login;
	
	public loginpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);	
	}
	
	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogin() {
		return login;
	}	

}
