package qualiframe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PrimopayrollcredentialsPageFactory extends BrowserSetUp {
    Map<String, WebElement> keys = new HashMap<>();

    public WebElement getWebElement(String key) {
        keys.put("Username", driver.findElement(By.id("txtlogUsername")));
        keys.put("Next", driver.findElement(By.id("btnNext")));
        return keys.get(key);
    }

    public WebElement getWebElementPwd(String key) {
        keys.put("Password", driver.findElement(By.id("txtPassword")));
        keys.put("PIN", driver.findElement(By.id("txtPin")));
        return keys.get(key);
    }

    public WebElement getWebElementbtnLogin(String key) {
        keys.put("Log in", driver.findElement(By.id("btnLogin")));
        return keys.get(key);
    }

    public WebElement BureauTitle(String key) {
        keys.put("Willys", driver.findElement(By.id("UclAdmin_lblComanyNameBanner")));
        return keys.get(key);

    }

    public void Click(String ElementName) {
        waitABit(8);
        getWebElement(ElementName).click();
        waitABit(8);
    }

    public void ClickLogin(String ElementName) {
        waitABit(8);
        getWebElementbtnLogin(ElementName).click();
        waitABit(8);
    }


}
