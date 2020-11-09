package qualiframe.steps;

import cucumber.api.java.en.When;
import qualiframe.excel.ExcelHandler;
import qualiframe.pages.PrimopayrollcredentialsPageFactory;

import java.util.Map;

public class PrimoLoginStepDef {
    Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx", "CREDENTIALS", "TC0001");
    private PrimopayrollcredentialsPageFactory primopayrollcredentials;

    public PrimoLoginStepDef() throws Exception {
        primopayrollcredentials = new PrimopayrollcredentialsPageFactory();
    }

    @When("^user login with userID$")
    public void userLoginWithUserID() {
        System.out.println(TestDataInMap.get("UserID"));
        boolean username = primopayrollcredentials.getWebElement("Username").isDisplayed();
        primopayrollcredentials.getWebElement("Username").sendKeys(TestDataInMap.get("UserID"));
        primopayrollcredentials.Click("Next");
    }

    @When("^user enter the password and PIN$")
    public void userEnterThePasswordAndPIN() {
        boolean Password = primopayrollcredentials.getWebElementPwd("Password").isDisplayed();
        primopayrollcredentials.getWebElementPwd("Password").sendKeys(TestDataInMap.get("Password"));
        primopayrollcredentials.getWebElementPwd("PIN").sendKeys(TestDataInMap.get("PIN"));
    }

    @When("^click on log in button$")
    public void clickOnLogInButton() {
        primopayrollcredentials.ClickLogin("Log in");
    }

}

