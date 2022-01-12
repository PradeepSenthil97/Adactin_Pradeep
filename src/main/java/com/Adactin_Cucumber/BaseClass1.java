package com.Adactin_Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass1 {
	
	public static WebDriver driver;
	
	//browserlaunch
	
	public static WebDriver browserlaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pradeep\\eclipse-workspace\\Maven-Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("wedriver.gecko.driver", "C:\\Users\\Pradeep\\eclipse-workspace\\Maven-Project\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else {
			System.out.println("invalid browser");
		}
			return driver;
		}

	//get
	public static void getThePage(String url) {
		driver.get(url);
	}
	
	//getTitle
	public static void getTheTitle() {
		System.out.println(driver.getTitle());
	}
	
	//getCurrentUrl
	public static void getTheUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	//close
	public static void closeThePage() {
		driver.close();
	}
	
	//quit
	public static void quitTheBrowser( ) {
		driver.quit();
	}
	
	//navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	//navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	//navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	//navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	//implict wait
	public static void waitImplicitly(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//explicit wait - visiblity
	public static void waitExplicitlyVisiblity(WebElement we,int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(we));	
	}
	
	//explicit wait - invisiblity
	public static void waitExplicitlyInVisiblity(WebElement we,int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(we));
	}
	
	//explicit wait - alert
		public static void waitExplicitlyAlert(WebElement we,int time) {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.alertIsPresent());
		}
	
	//fluent wait
	public static void waitFluently(WebElement we, int time, int polling, String waitFor) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(time, TimeUnit.SECONDS).pollingEvery(polling, TimeUnit.SECONDS).ignoring(Exception.class);
	}
	
	//checkbox
	public static void tickTheBox(WebElement we) {
		we.click();
	}
	
	//TakeScreenShot
	public static void screenShot(String storage_location) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(storage_location);
		FileUtils.copyFile(src, dest);
	}
	
	//actions
	public static void actions(WebElement we) {
		Actions act = new Actions(driver);
		act.contextClick(we).build().perform();
	}
	
	//robot class
	public static void robot() throws AWTException {
		Robot r = new Robot();
	}
	
	//alert - simple
	public static void simpleAlert() {
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}
	
	//alert - confirm
	public static void confirmAlert() {
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();
	}
	
	//alert - prompt
	public static void promptAlert() {
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.accept();
	}
	
	//dropDown
	public static void dropDownSelection(WebElement we, String option, String i) {
		Select s = new Select(we);
		if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(i);
			s.selectByIndex(parseInt);
		}
		else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(i);
		}
		else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(i);
			
		}
	}
	
	//isMultiple
	public static void multiple(WebElement we) {
		Select s = new Select(we);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	
	//getFirstSelected
	public static void getTheFirstSelected(WebElement we) {
		Select s = new Select(we);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String option = firstSelectedOption.getText();
		System.out.println(option);
	}
	
	//getOptions
	public static void getTheOption(WebElement we) {
		Select s = new Select(we);
		List<WebElement> options = s.getOptions();
		for (WebElement printoptions : options) {
			String opt = printoptions.getText();
			System.out.println(opt);
		}
	}
	
	//getAllSelected
	public static void getTheAllSelected(WebElement we) {
		Select s = new Select(we);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement printoptions : allSelectedOptions) {
			String opt = printoptions.getText();
			System.out.println(opt);
		}
	}
		
	//drag and drop
	public static void drag_drop(WebElement drag,WebElement drop) {
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();	
	}
	
	//scroll up and down
	public static void scrollup(WebElement we) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", we);
	}
	
	//windowHandles
	public static void windowHandling(int tabindex) {
		Set<String> window = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(tabindex));
	}
	
	//frames
	public static void frames(WebElement iframe) {
		driver.switchTo().frame(iframe);	
	}
		
	//sendKeys
	public static void passValue(WebElement we, String st) {
		we.sendKeys(st);
	}
	
	//click
	public static void clickOn(WebElement we) {
		we.click();
	}
	
	//getAttribute
	public static void getValue(WebElement we) {
		System.out.println(we.getAttribute("value"));
	}
	
	//getText
	public static void getTheText(WebElement we) {
		System.out.println(we.getText());
	}
	
	//clear
	public static void clearValue(WebElement we) {
		we.clear();
	}
	
	//getSize
	public static void getTheSize(WebElement we) {
		System.out.println(we.getSize());
	}
	
	//isDisplayed
	public static void displayed(WebElement we){
		System.out.println(we.isDisplayed());
	}
	
	//isEnabled
	public static void enabled(WebElement we) {
		System.out.println(we.isEnabled());
	}
	
	//isSelected
	public static void selected(WebElement we) {
		System.out.println(we.isSelected());
	}
	
	
}
