package qualiframe.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import qualiframe.excel.ExcelHandler;
import qualiframe.pages.PPCompanyCreationPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;


public class PPCompanyCreationStepDef {
    Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx", "TESTDATA", "TC0001");
    private PPCompanyCreationPages PPCompanyCreation;

    public PPCompanyCreationStepDef() throws Exception {
        PPCompanyCreation = new PPCompanyCreationPages();
    }

    @When("^click on icon near to company list$")
    public void clickOnIconNearToCompanyList() {
        PPCompanyCreation.Click("Add New Company");
    }

    @Then("^verify the SetUp Your Company Title$")
    public void verifyTheSetUpYourCompanyTitlw() {
        PPCompanyCreation.SetUpYourCompanyTitle("Setup Your Company").isDisplayed();
    }

    @Then("^Enter the Contact Information Details$")
    public void enterTheContactInformationDetails() {
        PPCompanyCreation.ContactInformation("Forename").sendKeys(TestDataInMap.get("Forename"));
        PPCompanyCreation.ContactInformation("Surname").sendKeys(TestDataInMap.get("Surname"));
        PPCompanyCreation.ContactInformation("Email").sendKeys(TestDataInMap.get("Email"));
        PPCompanyCreation.ContactInformation("Phone No").sendKeys(TestDataInMap.get("Phone No"));
    }

    @Then("^I Enter the Company Name$")
    public void iEnterTheCompanyName() throws IOException {
        FileInputStream file = new FileInputStream(new File("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFCell val = workbook.getSheetAt(1).getRow(1).getCell(3);
        System.out.println(val);
        PPCompanyCreation.CompanyDetails("Company").sendKeys(val.getRawValue());
    }

    @Then("^I enter the company information Details$")
    public void iEnterTheCompanyInformationDetails() {
        //PPCompanyCreation.CompanyDetails("Company").sendKeys(TestDataInMap.get("Company"));
        PPCompanyCreation.CompanyDetails("Postal Code").sendKeys(TestDataInMap.get("Postal Code"));
        PPCompanyCreation.CompanyDetails("Address Line 1").sendKeys(TestDataInMap.get("Address Line 1"));
        PPCompanyCreation.CompanyDetails("City").sendKeys(TestDataInMap.get("City"));
        PPCompanyCreation.CompanyDetails("County").sendKeys(TestDataInMap.get("County"));
        PPCompanyCreation.CompanyDetails("Mobile").sendKeys(TestDataInMap.get("Mobile"));
        PPCompanyCreation.CompanyDetails("Website").sendKeys(TestDataInMap.get("Website"));
    }

    @Then("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        PPCompanyCreation.ClickContinue("Continue");
    }

    @Then("^Verify the Period Settings tab$")
    public void verifyThePeriodSettingsTab() {
        PPCompanyCreation.Periodsettingsverify("Period Settings").isDisplayed();
        PPCompanyCreation.tickCheckBox("Monthly");
        PPCompanyCreation.waitForSec(5);
    }

    @Then("^Enter the HMRC settings Info$")
    public void enterTheHMRCSettingsInfo() {
        PPCompanyCreation.HMRCSettings("Tax Office No").sendKeys(TestDataInMap.get("Tax Office No"));
        PPCompanyCreation.HMRCSettings("PAYE Reference").sendKeys(TestDataInMap.get("PAYE Reference"));
        PPCompanyCreation.HMRCSettings("Accounts Office Reference").sendKeys(TestDataInMap.get("Accounts Office Reference"));
        PPCompanyCreation.HMRCSettings("Gateway ID").sendKeys(TestDataInMap.get("Gateway ID"));
        PPCompanyCreation.HMRCSettings("HMRC Gateway Password").sendKeys(TestDataInMap.get("HMRC Gateway Password"));
    }

    @Then("^I Agree Terms & Conditions$")
    public void iAgreeTermsConditions() {
        PPCompanyCreation.ClickTerms("Terms&Conditions");
        PPCompanyCreation.waitForSec(5);
    }

    @Then("^click on Done$")
    public void clickOnDone() {
        PPCompanyCreation.ClickDone("Done");
        PPCompanyCreation.waitForSec(5);
    }

    @Then("^I verify whether the company is already registered$")
    public void iVerifyWhetherTheCompanyIsAlreadyRegistered() throws SQLException, IOException {
        try {
            FileInputStream file = new FileInputStream(new File("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(1);
            Cell cell = null;

            //Update the value of cell
            cell = sheet.getRow(1).getCell(3);
            cell.setCellValue(cell.getNumericCellValue() + 1);
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File("src/test/resources/TestDataExcelSheet/PrimoLogin.xlsx"));
            workbook.write(outFile);
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




