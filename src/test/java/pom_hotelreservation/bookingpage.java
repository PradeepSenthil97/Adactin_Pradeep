package pom_hotelreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingpage {
	
	WebDriver driver;
	
	@FindBy(id="book_hotel_form")
	private static WebElement Book_form;

	@FindBy(id="first_name")
	private static WebElement First_name;
	
	@FindBy(id="last_name")
	private static WebElement Last_name;
	
	@FindBy(id="address")
	private static WebElement Address;
	
	@FindBy(id="cc_num")
	private static WebElement Cc_num ;
	
	@FindBy(id="cc_type")
	private static WebElement Cc_type ;
	
	@FindBy(id="cc_exp_month")
	private static WebElement Cc_exp_month ;
	
	@FindBy(id="cc_exp_year")
	private static WebElement  Cc_exp_year;
	
	@FindBy(id="cc_cvv")
	private static WebElement Cc_cvv;
	
	@FindBy(id="book_now")
	private static WebElement Book_now_btn ;
	
	@FindBy(id="search_hotel")
	private static WebElement Search_hotel;
	
	@FindBy(id="my_itinerary")
	private static WebElement My_itinerary;
	
	@FindBy(id="booked_form")
	private static WebElement Booked_form;
	
	@FindBy(id="logout")
	private static WebElement Logout;


	public bookingpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	public static WebElement getBook_form() {
		return Book_form;
	}

	public static WebElement getFirst_name() {
		return First_name;
	}

	public static WebElement getLast_name() {
		return Last_name;
	}

	public static WebElement getAddress() {
		return Address;
	}

	public static WebElement getCc_num() {
		return Cc_num;
	}

	public static WebElement getCc_type() {
		return Cc_type;
	}

	public static WebElement getCc_exp_month() {
		return Cc_exp_month;
	}

	public static WebElement getCc_exp_year() {
		return Cc_exp_year;
	}

	public static WebElement getCc_cvv() {
		return Cc_cvv;
	}

	public static WebElement getBook_now_btn() {
		return Book_now_btn;
	}
	
	public static WebElement getSearch_hotel() {
		return Search_hotel;
	}

	public static WebElement getMy_itinerary() {
		return My_itinerary;
	}

	public static WebElement getBooked_form() {
		return Booked_form;
	}
	
	public static WebElement getLogout() {
		return Logout;
	}

	
	
	
	

}
