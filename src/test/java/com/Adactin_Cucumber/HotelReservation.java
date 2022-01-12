package com.Adactin_Cucumber;

import org.openqa.selenium.WebDriver;

import pom_hotelreservation.bookingpage;
import pom_hotelreservation.loginpage;
import pom_hotelreservation.searchhotelpage;
import pom_hotelreservation.selecthotelpage;

public class HotelReservation extends BaseClass1 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = browserlaunch("chrome");
		
		getThePage("http://adactinhotelapp.com/");
		
		maximize();
		
		loginpage lp = new loginpage(driver);
		
		passValue(lp.getUsername(), "pradeepsenthil");
		
		passValue(lp.getPassword(), "zxcvbnm");
		
		clickOn(lp.getLogin());
		
		searchhotelpage shp = new searchhotelpage(driver);
		
		waitExplicitlyVisiblity(shp.getUsername_show(), 3);
		
		dropDownSelection(shp.getLocation(), "index", "8");
		
		dropDownSelection(shp.getHotel(), "value", "Hotel Cornice");
		
		dropDownSelection(shp.getRoom_Type(), "value", "Super Deluxe");
		
		dropDownSelection(shp.getRoom_nos(), "index", "1");
		
		dropDownSelection(shp.getAdult_room(), "index", "2");
		
		clickOn(shp.getSubmit());
		
		selecthotelpage slhp = new selecthotelpage(driver);
		
		waitExplicitlyInVisiblity(slhp.getSelect_form(), 3);
		
		clickOn(slhp.getSelecthotel_btn());
		
		clickOn(slhp.getSubmit());
		
		bookingpage bp = new bookingpage(driver);
		
		waitExplicitlyVisiblity(bp.getBook_form(), 3);
		
		passValue(bp.getFirst_name(), "pradeep");
		
		passValue(bp.getLast_name(), "senthil");
		
		passValue(bp.getAddress(), "Chennai");
		
		passValue(bp.getCc_num(), "1234567890123456");
		
		dropDownSelection(bp.getCc_type(), "index", "1");
		
		dropDownSelection(bp.getCc_exp_month(), "index", "5");
		
		dropDownSelection(bp.getCc_exp_year(), "index", "5");
		
		passValue(bp.getCc_cvv(), "123");
		
		clickOn(bp.getBook_now_btn());
		
		waitExplicitlyVisiblity(bp.getSearch_hotel(), 5);
		
		clickOn(bp.getMy_itinerary());
		
		waitExplicitlyVisiblity(bp.getSearch_hotel(), 5);
		
		clickOn(bp.getLogout());
		
				
		
			
		
//		quitTheBrowser();
		
	}
	

}
