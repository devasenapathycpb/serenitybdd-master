package qualiframe.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qualiframe.excel.ExcelHandler;
import qualiframe.pages.PPEmployeeCreationPages;

import java.util.Map;

public class PPEmployeeCreationStepDef {
    Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx", "TESTDATA", "TC0001");
    private PPEmployeeCreationPages PPEmployeeCreation;

    public PPEmployeeCreationStepDef() throws Exception {
        PPEmployeeCreation = new PPEmployeeCreationPages();
    }

    @When("^I search the client company in search text box$")
    public void i_search_the_client_company_in_search_text_box() {
        PPEmployeeCreation.getWebElement("Search TextBox").sendKeys(TestDataInMap.get("Company"));
        PPEmployeeCreation.waitForSec(5);
    }

    @Then("^Open the client company$")
    public void openTheClientCompany() {
        PPEmployeeCreation.Click("Open Company");
        PPEmployeeCreation.waitForSec(5);
    }

    @Then("^Click on \\+ icon near Employees Title$")
    public void clickOnIconNearEmployeesTitle() {
        PPEmployeeCreation.waitForSec(5);
        PPEmployeeCreation.ClickIcon("+ icon");
    }

    @Then("^I Enter a Personal Information$")
    public void iEnterAPersonalInformation() {
        PPEmployeeCreation.PersonalInfo("Select Mr").sendKeys(TestDataInMap.get("Title"));
        PPEmployeeCreation.PersonalInfo("Forename").sendKeys(TestDataInMap.get("Forename"));
        PPEmployeeCreation.PersonalInfo("Surname").sendKeys(TestDataInMap.get("Surname"));
        PPEmployeeCreation.PersonalInfo("DOB").sendKeys(TestDataInMap.get("DOB"));
        PPEmployeeCreation.waitForSec(5);
        PPEmployeeCreation.PersonalInfo("Gender").click();
    }

    @Then("^I select the Gender$")
    public void iSelectTheGender() {
        PPEmployeeCreation.ClickGender("Title");
    }

    @Then("^I Enter the contact Details$")
    public void iEnterTheContactDetails() {
        PPEmployeeCreation.ContactDetails("Address Line1").sendKeys(TestDataInMap.get("Address Line1"));
        PPEmployeeCreation.ContactDetails("City").sendKeys(TestDataInMap.get("City"));
        PPEmployeeCreation.ContactDetails("County").sendKeys(TestDataInMap.get("County"));
        PPEmployeeCreation.ContactDetails("PostCode").sendKeys(TestDataInMap.get("Postal Code"));
        PPEmployeeCreation.ContactDetails("Country").sendKeys(TestDataInMap.get("Country"));
        PPEmployeeCreation.ContactDetails("CommunicationMethod").clear();
        PPEmployeeCreation.ContactDetails("CommunicationMethod").sendKeys(TestDataInMap.get("CommunicationMethod"));
        PPEmployeeCreation.ContactDetails("EmployeeEmail").sendKeys(TestDataInMap.get("EmployeeEmail"));
    }

    @Then("^I click on Communication Details$")
    public void iClickOnCommunicationDetails() {
        PPEmployeeCreation.ContactDetails("CommunicationMethod").click();
        PPEmployeeCreation.waitForSec(3);
        PPEmployeeCreation.ClickEmail("Email");
    }

    @Then("^I Enter the Employment Details$")
    public void iEnterTheEmploymentDetails() {
        PPEmployeeCreation.Employment("WorkPattern").sendKeys(TestDataInMap.get("WorkPattern"));
        PPEmployeeCreation.Employment("AnnualBasic").clear();
        PPEmployeeCreation.Employment("AnnualBasic").sendKeys(TestDataInMap.get("AnnualBasic"));
        PPEmployeeCreation.Employment("Hours").sendKeys(TestDataInMap.get("Hours"));
        PPEmployeeCreation.Employment("DateJoined").sendKeys(TestDataInMap.get("DateJoined"));
    }

    @Then("^I click on the Next Button$")
    public void iClickOnTheNextButton() {
        PPEmployeeCreation.ClickNext("Next");
    }

    @Then("^I Enter the Starter Declaration Details$")
    public void iEnterTheStarterDeclarationDetails() {
        PPEmployeeCreation.StarterDeclaration("TAX code").sendKeys(TestDataInMap.get("TAX code"));
        PPEmployeeCreation.StarterDeclaration("Total PAY").sendKeys(TestDataInMap.get("Total PAY"));
        PPEmployeeCreation.StarterDeclaration("Total TAX").sendKeys(TestDataInMap.get("Total TAX"));
        PPEmployeeCreation.StarterDeclaration("TAX Basis").click();
    }

    @Then("^I select the Tax basis$")
    public void iSelectTheTaxBasis() {
        PPEmployeeCreation.ClickTaxbasis("TAX Basis");
    }

    @Then("^i click on next button in starter Declaration$")
    public void iClickOnNextButtonInStarterDeclaration() {
        PPEmployeeCreation.ClickStarterNext("Next");
    }

    @Then("^I Enter the HMRC settings by valid details$")
    public void iEnterTheHMRCSettingsByValidDetails() {
        PPEmployeeCreation.HMRCSettings("NI Number").sendKeys(TestDataInMap.get("NI Number"));
        PPEmployeeCreation.HMRCSettings("Previous Payroll Number").sendKeys(TestDataInMap.get("Previous Payroll Number"));
        PPEmployeeCreation.HMRCSettings("SurnameHMRC").sendKeys(TestDataInMap.get("SurnameHMRC"));
        PPEmployeeCreation.HMRCSettings("ForenameHMRC").sendKeys(TestDataInMap.get("ForenameHMRC"));
        PPEmployeeCreation.HMRCSettings("NI NumberPartnerDetails").sendKeys(TestDataInMap.get("NI NumberPartnerDetails"));
    }

    @Then("^I Enter the Car Benefit details used by RTI$")
    public void iEnterTheCarBenefitDetailsUsedByRTI() {
        PPEmployeeCreation.CarBenefitHMRC("Car Make").sendKeys(TestDataInMap.get("Car Make"));
        PPEmployeeCreation.CarBenefitHMRC("CO2").sendKeys(TestDataInMap.get("CO2"));
        PPEmployeeCreation.CarBenefitHMRC("Car Reg NO").sendKeys(TestDataInMap.get("Car Reg NO"));
        PPEmployeeCreation.CarBenefitHMRC("Value").sendKeys(TestDataInMap.get("Value"));
        PPEmployeeCreation.CarBenefitHMRC("Benefit Cash Equivalent").sendKeys(TestDataInMap.get("Benefit Cash Equivalent"));
        PPEmployeeCreation.CarBenefitHMRC("Benefit Available From").sendKeys(TestDataInMap.get("Benefit Available From"));
        PPEmployeeCreation.CarBenefitHMRC("Benefit Available Till").sendKeys(TestDataInMap.get("Benefit Available Till"));
        PPEmployeeCreation.CarBenefitHMRC("Free Fuel Cash Equivalent").sendKeys(TestDataInMap.get("Free Fuel Cash Equivalent"));
        PPEmployeeCreation.CarBenefitHMRC("Benefit Available From").click();
        PPEmployeeCreation.CarBenefitHMRC("Free Fuel Benefit From").sendKeys(TestDataInMap.get("Free Fuel Benefit From"));
        PPEmployeeCreation.CarBenefitHMRC("Free Fuel Benefit Till").sendKeys(TestDataInMap.get("Free Fuel Benefit Till"));
    }

    @Then("^I select the fuel Type of the car$")
    public void iSelectTheFuelTypeOfTheCar() {
        PPEmployeeCreation.CarBenefitHMRC("Fuel Type").click();
        PPEmployeeCreation.waitForSec(3);
        PPEmployeeCreation.ClickFuelTypeofcar("FuelType");
    }

    @Then("^I Click on the Next button in HMRC settings$")
    public void iClickOnTheNextButtonInHMRCSettings() {
        PPEmployeeCreation.ClickNextHMRC("NextHMRC");
    }

    @Then("^I Enter the Bank Details of the employee$")
    public void iEnterTheBankDetailsOfTheEmployee() {
        PPEmployeeCreation.BankDetails("Bank Name").sendKeys(TestDataInMap.get("Bank Name"));
        PPEmployeeCreation.BankDetails("Account Name").sendKeys(TestDataInMap.get("Account Name"));
        PPEmployeeCreation.BankDetails("Account Number").sendKeys(TestDataInMap.get("Account Number"));
        PPEmployeeCreation.BankDetails("Sort Code").sendKeys(TestDataInMap.get("Sort Code"));
    }

    @Then("^I click on Save Button$")
    public void iClickOnSaveButton() {
        PPEmployeeCreation.ClickSave("SaveButton");
        PPEmployeeCreation.waitForSec(3);
    }

    @Then("^I Click on Home Icon in Employee Settings$")
    public void iClickOnHomeIconInEmployeeSettings() {
        PPEmployeeCreation.IconHome("IconHome").click();
        PPEmployeeCreation.waitForSec(3);

    }
}
