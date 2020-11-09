package qualiframe.steps;

import cucumber.api.java.en.Given;
import qualiframe.excel.ExcelHandler;
import qualiframe.pages.BrowserSetUp;

import java.util.Map;

public class OpenBrowser {
    Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx", "CREDENTIALS", "TC0001");
    private BrowserSetUp browserSetUp;

    public OpenBrowser() throws Exception {
        browserSetUp = new BrowserSetUp();
    }

    @Given("^user opens primo payroll application$")
    public void user_opens_primo_payroll_application() {
        browserSetUp.openBrowserWithURL(TestDataInMap.get("EnvironmentPortalURL"));
    }
}