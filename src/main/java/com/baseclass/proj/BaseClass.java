package com.baseclass.proj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "Driver//geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;

	}

	public static void clickonelement(WebElement elements) {

		elements.click();

	}

	public static void inputvaluemethod(WebElement elements, String value) {
		elements.sendKeys(value);
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();

	}

	public static void gettitle() {
		driver.getTitle();
	}

	public static void getcurrenturl() {
		driver.getCurrentUrl();
	}

	public static void TakesScreenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	public void sleep(long time) throws Throwable {

		Thread.sleep(time);
		
	}
	public static void dropdownselect(WebElement elements, String type, String value) {

		Select s = new Select(elements);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		}

	}

	public static void navigate_to(String url) {

		driver.navigate().to(url);

	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigate_back() {

		driver.navigate().back();

	}

	public static void navigate_forward() {

		driver.navigate().forward();

	}

	public static void robot(String type) throws AWTException {

		Robot r = new Robot();
		if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		} else if (type.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);

		} else if (type.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);

		} else if (type.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

	}

	public static void check_function(WebElement elements) {
		boolean enabled = elements.isEnabled();
		System.out.println(enabled);

		boolean displayed = elements.isDisplayed();
		System.out.println(displayed);

		boolean selected = elements.isSelected();
		System.out.println(selected);

	}

	public static void Get_function(WebElement elements) {
		String text = elements.getText();
		System.out.println(text);

	}

	public static void getUrl(String url) {

		driver.get(url);
	}

	public static void alerts(String condition) {

		if (condition.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();

		} else if (condition.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}

	}

	public static void frameexit() {
		driver.switchTo().defaultContent();

	}

	public static void waitimplicit(int time, TimeUnit timeunits) {
		driver.manage().timeouts().implicitlyWait(time, timeunits);
	}

	public static void waitExplicit(WebElement element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public static void frame(String type, String value) {

		if (type.equalsIgnoreCase("index")) {
			driver.switchTo().frame(Integer.parseInt(value));

		} else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);

		} else if (type.equalsIgnoreCase("partiallinktext")) {
			driver.switchTo().frame(driver.findElement(By.partialLinkText(value)));

		} else if (type.equalsIgnoreCase("xpath")) {
			driver.switchTo().frame(driver.findElement(By.xpath(value)));

		}

	}

	public static void select(WebElement element, String type) {
		Select s = new Select(element);

		if (type.equalsIgnoreCase("Ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);

		} else if (type.equalsIgnoreCase("getoption")) {
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				System.out.println(text);
			}

		} else if (type.equalsIgnoreCase("getfirstselected")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());

		} else if (type.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				String text = webElement.getText();
				System.out.println(text);

			}
		}

	}

}
