package pom_hotelreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotelpage {
	
	WebDriver driver;
	
	@FindBy(id="username_show")
	private static WebElement Username_show;
	
	@FindBy(id="location")
	private static WebElement location;

	@FindBy(id="hotels")
	private static WebElement Hotel ;
	
	@FindBy(id="room_type")
	private static WebElement Room_Type ;
	
	@FindBy(id="room_nos")
	private static WebElement Room_nos ;
	
	@FindBy(id="adult_room")
	private static WebElement Adult_room ;
	
	@FindBy(id="Submit")
	private static WebElement Submit ;
	
	public searchhotelpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);	
	}
	

	public static WebElement getUsername_show() {
		return Username_show;
	}
	
	public static WebElement getLocation() {
		return location;
	}

	public static WebElement getHotel() {
		return Hotel;
	}

	public static WebElement getRoom_Type() {
		return Room_Type;
	}

	public static WebElement getRoom_nos() {
		return Room_nos;
	}

	public static WebElement getAdult_room() {
		return Adult_room;
	}

	public static WebElement getSubmit() {
		return Submit;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
