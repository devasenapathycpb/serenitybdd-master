package qualiframe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PPEmployeeCreationPages extends BrowserSetUp {
    Map<String, WebElement> keys = new HashMap<>();

    public WebElement getWebElement(String key) {
        keys.put("Search TextBox", driver.findElement(By.id("cpPopUpCompanyListMenu_btnCompanyListSearchID_I")));
        return keys.get(key);
    }

    public WebElement OpenCompany(String key) {
        keys.put("Open Company", driver.findElement(By.id("cpPopUpCompanyListMenu_grdCompanyList_cell0_1_btnOpen_0")));
        return keys.get(key);
    }

    public WebElement EmployeeCreation(String key) {
        keys.put("+ icon", driver.findElement(By.id("cpPopUpEmployeeList_imgEmployeeAddNew")));
        return keys.get(key);
    }

    public WebElement PersonalInfo(String key) {
        keys.put("Select Mr", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpTitle_I")));
        keys.put("Forename", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpForeNames_I")));
        keys.put("Surname", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpSurname_I")));
        keys.put("DOB", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_datEmpDateOfBirth_I")));
        keys.put("Gender", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpSex_I")));
        return keys.get(key);
    }

    public WebElement Gender(String key) {
        keys.put("Title", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpSex_DDD_L_LBI2T0")));
        return keys.get(key);
    }

    public WebElement ContactDetails(String key) {
        keys.put("Address Line1", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpAddress1_I")));
        keys.put("City", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpAddress3_I")));
        keys.put("County", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpCounty_I")));
        keys.put("PostCode", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpPostCode_I")));
        keys.put("Country", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboCountry_I")));
        keys.put("CommunicationMethod", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpMethodOfCommunication_I")));
        keys.put("EmployeeEmail", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtEmpEmail_I")));
        return keys.get(key);
    }

    public WebElement CommunicationDetails(String key) {
        keys.put("Email", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpMethodOfCommunication_DDD_L_LBI1T0")));
        return keys.get(key);
    }

    public WebElement Employment(String key) {
        keys.put("WorkPattern", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboWorkingPattern_I")));
        keys.put("AnnualBasic", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_spnAnnualBasic_I")));
        keys.put("Hours", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_spnStandradHours_I")));
        keys.put("DateJoined", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_datEmpDateJoined_I")));
        keys.put("Country", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboCountry_I")));
        keys.put("CommunicationMethod", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboEmpMethodOfCommunication_I")));
        return keys.get(key);
    }

    public WebElement MainNextButton(String key) {
        keys.put("Next", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_btnContinue")));
        return keys.get(key);
    }

    public WebElement StarterDeclaration(String key) {
        keys.put("TAX code", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtP45TaxCodeatLeavingDate_I")));
        keys.put("TAX Basis", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboP45TaxBasisPreviousEmployment_I")));
        keys.put("Total PAY", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtP45GrossForTax_I")));
        keys.put("Total TAX", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtP45TaxDeducted_I")));
        return keys.get(key);
    }

    public WebElement TaxBasis(String key) {
        keys.put("TAX Basis", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_cboP45TaxBasisPreviousEmployment_DDD_L_LBI1T0")));
        return keys.get(key);
    }

    public WebElement StarterNextButton(String key) {
        keys.put("Next", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_btnStarterDeclarationContinue")));
        return keys.get(key);
    }

    public WebElement HMRCSettings(String key) {
        keys.put("NI Number", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtNINumber_I")));
        keys.put("Previous Payroll Number", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtPreviousPayrollNumber_I")));
        keys.put("SurnameHMRC", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtRTIPartnerSurName_I")));
        keys.put("ForenameHMRC", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtRTIPartnerForenames_I")));
        keys.put("NI NumberPartnerDetails", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtRTIPartnerNINumber_I")));
        return keys.get(key);
    }

    public WebElement CarBenefitHMRC(String key) {
        keys.put("Car Make", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtCarMake_I")));
        keys.put("CO2", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtCO2_I")));
        keys.put("Car Reg NO", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtCarRegistrationNo_I")));
        keys.put("Value", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtValue_I")));
        keys.put("Benefit Cash Equivalent", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBenefitCashEquivalent_I")));
        keys.put("Benefit Available From", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_datBenefitAvailableFrom_I")));
        keys.put("Benefit Available Till", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_datBenefitAvailableTill_I")));
        keys.put("Free Fuel Cash Equivalent", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtFreeFuelCashEquivalent_I")));
        keys.put("Free Fuel Benefit From", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_datFreeFuelBenefitAvailableFrom_I")));
        keys.put("Free Fuel Benefit Till", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_datFreeFuelBenefitAvailableTill_I")));
        keys.put("Fuel Type", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_cboFuelType_I")));
        return keys.get(key);
    }

    public WebElement BankDetails(String key) {
        keys.put("Bank Name", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBankName_I")));
        keys.put("Account Name", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBankAccName_I")));
        keys.put("Account Number", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBankAccountNumber_I")));
        keys.put("Sort Code", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBankSortCode_I")));
        keys.put("Building Society", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_txtBulidingSocNumber_I")));
        return keys.get(key);
    }

    public WebElement FuelTypeofCar(String key) {
        keys.put("FuelType", driver.findElement(By.cssSelector("#cpPopupEmployeeRecord_pgecntrlEmpRecord_cboFuelType_DDD_L_LBI1T0")));
        return keys.get(key);
    }

    public WebElement NextButtonHMRC(String key) {
        keys.put("NextHMRC", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_btnContinueHMRC")));
        return keys.get(key);
    }

    public WebElement SaveButton(String key) {
        keys.put("SaveButton", driver.findElement(By.id("cpPopupEmployeeRecord_pgecntrlEmpRecord_btnEmployeeSave")));
        return keys.get(key);
    }
    public WebElement IconHome(String key) {
        keys.put("IconHome", driver.findElement(By.cssSelector("img#UcHeaderControl_imgHeaderHome")));
        return keys.get(key);
    }

    public void Click(String ElementName) {
        waitABit(8);
        OpenCompany(ElementName).click();
        waitABit(8);
    }

    public void ClickIcon(String ElementName) {
        waitABit(8);
        EmployeeCreation(ElementName).click();
        waitABit(8);
    }

    public void ClickNext(String ElementName) {
        waitABit(8);
        MainNextButton(ElementName).click();
        waitABit(8);
    }

    public void ClickGender(String ElementName) {
        waitABit(8);
        Gender(ElementName).click();
        waitABit(8);
    }

    public void ClickTaxbasis(String ElementName) {
        waitABit(8);
        TaxBasis(ElementName).click();
        waitABit(8);
    }

    public void ClickStarterNext(String ElementName) {
        waitABit(8);
        StarterNextButton(ElementName).click();
        waitABit(8);
    }

    public void ClickFuelTypeofcar(String ElementName) {
        waitABit(8);
        FuelTypeofCar(ElementName).click();
        waitABit(8);
    }

    public void ClickNextHMRC(String ElementName) {
        waitABit(8);
        NextButtonHMRC(ElementName).click();
        waitABit(8);
    }

    public void ClickSave(String ElementName) {
        waitABit(8);
        SaveButton(ElementName).click();
        waitABit(8);
    }

    public void ClickEmail(String ElementName) {
        waitABit(8);
        CommunicationDetails(ElementName).click();
        waitABit(8);
    }
}
