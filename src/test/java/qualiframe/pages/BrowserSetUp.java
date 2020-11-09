package qualiframe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.pages.PageObject;

public class BrowserSetUp extends PageObject {
	public static WebDriver driver;
	public static String windowId;

	public void openBrowserWithURL(String URL) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito--");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
		windowId = driver.getWindowHandle();
		setDriver(driver);
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void ActionsClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click(element).perform();
	}

	public void waitForSec(int seconds) {
		long milli = seconds * 2000;
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
