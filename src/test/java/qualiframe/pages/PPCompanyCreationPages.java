package qualiframe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PPCompanyCreationPages extends BrowserSetUp {
    Map<String, WebElement> keys = new HashMap<>();

    public WebElement getWebElement(String key) {
        keys.put("Add New Company", driver.findElement(By.id("cpPopUpCompanyListMenu_imgCompanyAddNew")));
        return keys.get(key);
    }

    public WebElement SetUpYourCompanyTitle(String key) {
        keys.put("Setup Your Company", driver.findElement(By.id("lblStartProjectHeader")));
        return keys.get(key);

    }

    public WebElement ContactInformation(String key) {
        keys.put("Forename", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtForeName_I")));
        keys.put("Surname", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtSurName_I")));
        keys.put("Email", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtEmail_I")));
        keys.put("Phone No", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtPhoneNo_I")));
        return keys.get(key);

    }

    public WebElement CompanyDetails(String key) {
        keys.put("Company", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtCompany_I")));
        keys.put("Postal Code", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtPostCode_I")));
        keys.put("Address Line 1", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtAddressLine1_I")));
        keys.put("City", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtCity_I")));
        keys.put("County", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtCounty_I")));
        keys.put("Mobile", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtMobile_I")));
        keys.put("Website", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtWebsite_I")));
        return keys.get(key);
    }

    public WebElement Continue(String key) {
        keys.put("Continue", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_btnContinue")));
        return keys.get(key);
    }

    public WebElement Periodsettingsverify(String key) {
        keys.put("Period Settings", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_lblPeriodSettingseHeader")));
        keys.put("Monthly", driver.findElement(By.xpath("//span[@id='cpPopUpCompanySetUp_pgcCompanySetup_chkMonthly']")));
        return keys.get(key);
    }

    public WebElement HMRCSettings(String key) {
        keys.put("Tax Office No", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtTaxOfficeNo_I")));
        keys.put("PAYE Reference", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtPAYEReference_I")));
        keys.put("Accounts Office Reference", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtAccountsOfficeReference_I")));
        keys.put("Gateway ID", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtHMRCGateWayID_I")));
        keys.put("HMRC Gateway Password", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_txtHMRCGatewayPassword_I")));
        return keys.get(key);
    }

    public WebElement TermsandConditons(String key) {
        keys.put("Terms&Conditions", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_chkTermsandConditions_S_D")));
        return keys.get(key);
    }

    public WebElement Done(String key) {
        keys.put("Done", driver.findElement(By.id("cpPopUpCompanySetUp_pgcCompanySetup_btnDone")));
        return keys.get(key);
    }
    public WebElement CompanyGrid(String key) {
        keys.put("CompanyGrid", driver.findElement(By.id("cpPopUpCompanyListMenu_grdCompanyList_DXDataRow0")));
        return keys.get(key);
    }

    public void Click(String ElementName) {
        waitABit(8);
        getWebElement(ElementName).click();
        waitABit(8);
    }

    public void ClickContinue(String ElementName) {
        waitABit(8);
        Continue(ElementName).click();
        waitABit(8);
    }

    public void tickCheckBox(String ElementName) {
        waitABit(8);
        Periodsettingsverify(ElementName).click();
        waitABit(8);
    }

    public void ClickTerms(String ElementName) {
        waitABit(8);
        TermsandConditons(ElementName).click();
        waitABit(8);
    }

    public void ClickDone(String ElementName) {
        waitABit(8);
        Done(ElementName).click();
        waitABit(8);
    }
}
