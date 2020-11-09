package qualiframe.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qualiframe.excel.ExcelHandler;
import qualiframe.pages.PPCompanySettingsPages;

import java.util.Map;

public class PPCompanySettingsStepDef {
    Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx", "TESTDATA", "TC0001");
    private PPCompanySettingsPages PPCompanySettings;

    public PPCompanySettingsStepDef() throws Exception {
        PPCompanySettings = new PPCompanySettingsPages();
    }

    @When("^I Click on Settings icon$")
    public void i_Click_on_Settings_icon() {
        PPCompanySettings.Click("CompanySettings");

    }

    @When("^I Click on Processing Rules$")
    public void iClickOnProcessingRules() {
        PPCompanySettings.ClickProcessingRules("ProcessingRules");
        PPCompanySettings.waitForSec(3);
    }


    @When("^I Click on Client Rules Tab$")
    public void iClickOnClientRulesTab() {
        PPCompanySettings.waitForSec(5);
        PPCompanySettings.ClickClientRules("ClientRules");
        PPCompanySettings.waitForSec(5);
    }

    @Then("^I Enable the Send Payment File to Employer$")
    public void iEnableTheSendPaymentFileToEmployer() {
        PPCompanySettings.ClickSendPaymentFile("SendPaymentFile_Unchecked");
    }

    @Then("^I Enable the Make Salary Payments to Employer$")
    public void iEnableTheMakeSalaryPaymentsToEmployer() {
        PPCompanySettings.ClickMakeSalaryPayments_Unchecked("MakeSalaryPayments_Unchecked");
    }

    @Then("^I click on Save Button in Processing Rules$")
    public void iClickOnSaveButtonInProcessingRules() {
        PPCompanySettings.ClickSaveButtonproceRules("SaveButtonprocRules");
    }

    @When("^I click on Classification Settings$")
    public void iClickOnClassificationSettings() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.ClickClassificationSettings("ClassificationSettings");
    }

    @Then("^I click on \\+ icon in classication$")
    public void iClickOnIconInClassication() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.ClickiconClassification("iconClassification");
    }

    @Then("^I click on Type$")
    public void iClickOnType() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.ClickSelectType("SelectType");
    }

    @Then("^I select Department in dropdown$")
    public void iSelectDepartmentInDropdown() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.ClickSelectDepartment("SelectDepartment");
    }

    @Then("^I Enter the Name$")
    public void iEnterTheName() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.NameClassification("NameClassification").sendKeys(TestDataInMap.get("NameClassification"));
    }


    @Then("^I click on Save Button in classification$")
    public void iClickOnSaveButtonInClassification() {
        PPCompanySettings.ClickSaveClassification("SaveClassification");
        PPCompanySettings.waitForSec(3);
    }

    @Then("^I close the Classification Window$")
    public void iCloseTheClassificationWindow() {
        PPCompanySettings.ClickCloseClassification("CloseClassification");
        PPCompanySettings.waitForSec(3);
    }

    @When("^I Enter the Company Bank Details$")
    public void iEnterTheCompanyBankDetails() {
        PPCompanySettings.ClickCompanyBankDetails("CompanyBankDetails");
        PPCompanySettings.waitForSec(3);

    }

    @Then("^I Enter the Account number$")
    public void iEnterTheAccountNumber() {
        PPCompanySettings.waitForSec(3);
        PPCompanySettings.CompanyAccountNum("CompanyAccountNum").sendKeys(TestDataInMap.get("CompanyAccountNum"));
        PPCompanySettings.waitForSec(3);

    }

    @Then("^I Enter the sort code$")
    public void iEnterTheSortCode() {
        PPCompanySettings.CompanySortCode("CompanySortCode").sendKeys(TestDataInMap.get("CompanySortCode"));
        PPCompanySettings.waitForSec(3);

    }

    @Then("^I Select the Payment Method$")
    public void iSelectThePaymentMethod() {
        PPCompanySettings.ClickPaymentMethod("PaymentMethod");
        PPCompanySettings.waitForSec(3);

    }

    @Then("^I Select BACS$")
    public void iSelectBACS() {
        PPCompanySettings.ClickBACS("BACS");
        PPCompanySettings.waitForSec(3);

    }

    @Then("^I Select Payment File Format$")
    public void iSelectPaymentFileFormat() {
        PPCompanySettings.ClickPaymentFileFormat("PaymentFileFormat");
        PPCompanySettings.waitForSec(3);
    }

    @Then("^I Select the Standard BACS Bureau$")
    public void iSelectTheStandardBACSBureau() {
        PPCompanySettings.ClickPaymentStandardBACS("PaymentStandardBACS");
        PPCompanySettings.waitForSec(3);
    }

    @Then("^I Click on SAVE button in BANK Details$")
    public void iClickOnSAVEButtonInBANKDetails() {
        PPCompanySettings.ClickbtnSAVEbank("btnSAVEbank");
        PPCompanySettings.waitForSec(3);
    }

    @Then("^I Click on Home Icon in Company Settings$")
    public void iClickOnHomeIconInCompanySettings() {
        PPCompanySettings.ClickHomeCompSettings("HomeCompSettings");
        PPCompanySettings.waitForSec(3);

    }
}

