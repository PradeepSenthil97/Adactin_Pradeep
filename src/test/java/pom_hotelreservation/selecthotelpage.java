package pom_hotelreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotelpage {

	WebDriver driver;
	
	@FindBy(id="select_form")
	private static WebElement select_form;

	@FindBy(id="radiobutton_0")
	private static WebElement Selecthotel_btn;
	
	@FindBy(id="continue")
	private static WebElement Submit;
	
	public selecthotelpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}
		
	public static WebElement getSelect_form() {
		return select_form;
	}

	public static WebElement getSelecthotel_btn() {
		return Selecthotel_btn;
	}

	public static WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	
	
}
