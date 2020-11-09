package qualiframe.pages;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;

public class Hooks extends BrowserSetUp {
    @After(order = 0)
    public static void snapshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot_with_scenario_name,
                        new File("./target/Screenshot/" + scenario.getName() + ".png"));
                System.out.println(scenario.getName());
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException | IOException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
            driver.close();
        }
    }
}

