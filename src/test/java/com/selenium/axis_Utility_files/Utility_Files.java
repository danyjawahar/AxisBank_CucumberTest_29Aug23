package com.selenium.axis_Utility_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_Files {
	public static String value;
	public static WebDriver driver; // Driver value in null
//BROWSER LAUNCH METHODS

	public static WebDriver get_Browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);
		} else if (type.equalsIgnoreCase("firefox")) {
			// Need to add firefox details
		} else if (type.equalsIgnoreCase("edge")) {
			// Need to add edge details
		}
		return driver;
	}
//GET METHODS

//get	
	public static void get(String url) {
		driver.get(url);
	}

//getTitle
	public static String get_Title() {
		String title = driver.getTitle();
		return title;
	}

	// Close
	public static void close() {
		driver.close();
	}

	// Quit
	public static void quit() {
		driver.quit();
	}

	// WEB ELEMENT METHODS

	// sendkeys
	public static void send_keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	// Click
	public static void click_On_Element(WebElement element) {
		element.click();
	}

	// getText
	public static String get_Text(WebElement element) {
		String getText = element.getText();
		return getText;
	}

	// Clear
	public static void clear(WebElement element) {
		element.clear();
	}
	
	// ALERT
	public static void confirm_Alert(WebElement element) {
		
	}

	// BOOLEAN METHODS

	// is_Enabled
	public static boolean is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	// is_Displayed
	public static boolean is_Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// is_Selected
	public static boolean is_Selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	// WAIT
	// Explicit Wait
	public static void explicit_Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Implicit Wait
	public static void implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
	}

	// DATA DRIVEN FRAMEWORK - READ (Particular Cell Data)
	public static String particular_CellData(String path, int rowdata, int coloumdata) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(rowdata);
		Cell c = r.getCell(coloumdata);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			// doublt to int
			int a = (int) d;
			// int to string
			value = String.valueOf(a);
		}
		wb.close();
		return value;
	}
}
