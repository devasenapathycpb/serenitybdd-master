package qualiframe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PPCompanySettingsPages extends BrowserSetUp {
    Map<String, WebElement> keys = new HashMap<>();

    public WebElement getWebElement(String key) {
        keys.put("CompanySettings", driver.findElement(By.id("UclAdmin_imgHeaderSettings")));
        return keys.get(key);
    }

    public WebElement ProcessingRules(String key) {
        keys.put("ProcessingRules", driver.findElement(By.xpath("//div[text()='Processing Rules']")));
        return keys.get(key);
    }

    public WebElement ClientRules(String key) {
        keys.put("ClientRules", driver.findElement(By.xpath("//li[@id='cbpDynamicSettingsUserControl_UC_popPayrollRules_cpPopUpPayrollRules_pgecntrlPayrollRules_T3']//span[text()='Client Rules']")));
        return keys.get(key);
    }

    public WebElement SendPaymentFile(String key) {
        keys.put("SendPaymentFile", driver.findElement(By.xpath("//span[@id='cbpDynamicSettingsUserControl_UC_popPayrollRules_cpPopUpPayrollRules_pgecntrlPayrollRules_chklSendPaymentFiletoEmployer']//span[@class='dxICheckBox dxichSys dx-not-acc dxcbCI ']")));
        return keys.get(key);
    }

    public WebElement SendPaymentFile_Unchecked(String key) {
        keys.put("SendPaymentFile_Unchecked", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popPayrollRules_cpPopUpPayrollRules_pgecntrlPayrollRules_chklSendPaymentFiletoEmployer")));
        return keys.get(key);
    }

    public WebElement MakeSalaryPayments_Unchecked(String key) {
        keys.put("MakeSalaryPayments_Unchecked", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popPayrollRules_cpPopUpPayrollRules_pgecntrlPayrollRules_chkProcessSalaryPayments")));
        return keys.get(key);
    }

    public WebElement SaveButtonprocRules(String key) {
        keys.put("SaveButtonprocRules", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popPayrollRules_cpPopUpPayrollRules_btnSave")));
        return keys.get(key);
    }

    public WebElement ClassificationSettings(String key) {
        keys.put("ClassificationSettings", driver.findElement(By.xpath("//div[text()='Classification']")));
        return keys.get(key);
    }

    public WebElement iconClassification(String key) {
        keys.put("iconClassification", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popClassification_cpPopUpClassification_imgAnalysisAddNew")));
        return keys.get(key);
    }

    public WebElement SelectType(String key) {
        keys.put("SelectType", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popAddNewClassification_cpAddNewPopUpClassification_cboAnalysisType_I")));
        return keys.get(key);
    }

    public WebElement SelectDepartment(String key) {
        keys.put("SelectDepartment", driver.findElement(By.cssSelector("#cbpDynamicSettingsUserControl_UC_popAddNewClassification_cpAddNewPopUpClassification_cboAnalysisType_DDD_L_LBI2T0")));
        return keys.get(key);
    }

    public WebElement NameClassification(String key) {
        keys.put("NameClassification", driver.findElement(By.cssSelector("input#cbpDynamicSettingsUserControl_UC_popAddNewClassification_cpAddNewPopUpClassification_txtAnalysisName_I")));
        return keys.get(key);
    }

    public WebElement SaveClassification(String key) {
        keys.put("SaveClassification", driver.findElement(By.cssSelector("#cbpDynamicSettingsUserControl_UC_popAddNewClassification_cpAddNewPopUpClassification_btnAddNewClassSave")));
        return keys.get(key);
    }

    public WebElement CloseClassification(String key) {
        keys.put("CloseClassification", driver.findElement(By.xpath("//span[@onclick='popClassification.Hide();']")));
        return keys.get(key);
    }

    public WebElement CompanyBankDetails(String key) {
        keys.put("CompanyBankDetails", driver.findElement(By.xpath("//div[text()='Bank']")));
        return keys.get(key);
    }

    public WebElement CompanyAccountNum(String key) {
        keys.put("CompanyAccountNum", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_txtBankAccountNumber_I")));
        return keys.get(key);
    }

    public WebElement CompanySortCode(String key) {
        keys.put("CompanySortCode", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_txtSortCode_I")));
        return keys.get(key);
    }

    public WebElement PaymentMethod(String key) {
        keys.put("PaymentMethod", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_cboPaymentMethod_I")));
        return keys.get(key);
    }

    public WebElement BACS(String key) {
        keys.put("BACS", driver.findElement(By.cssSelector("#cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_cboPaymentMethod_DDD_L_LBI2T0")));
        return keys.get(key);
    }

    public WebElement PaymentFileFormat(String key) {
        keys.put("PaymentFileFormat", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_cboPaymentProvider_I")));
        return keys.get(key);
    }

    public WebElement PaymentStandardBACS(String key) {
        keys.put("PaymentStandardBACS", driver.findElement(By.cssSelector("#cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_cboPaymentProvider_DDD_L_LBI1T0")));
        return keys.get(key);
    }

    public WebElement btnSAVEbank(String key) {
        keys.put("btnSAVEbank", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popBankDetails_cpPopUpBankDetails_btnSave")));
        return keys.get(key);
    }
    public WebElement HomeCompSettings(String key) {
        keys.put("HomeCompSettings", driver.findElement(By.id("UclAdmin_imgHeaderHome")));
        return keys.get(key);
    }


    public void Click(String ElementName) {
        waitABit(8);
        getWebElement(ElementName).click();
        waitABit(8);
    }

    public void ClickProcessingRules(String ElementName) {
        waitABit(8);
        ProcessingRules(ElementName).click();
        waitABit(8);
    }

    public void ClickClientRules(String ElementName) {
        waitABit(8);
        ClientRules(ElementName).click();
        waitABit(8);
    }

    public void ClickSendPaymentFile(String ElementName) {
        waitABit(8);
        SendPaymentFile_Unchecked(ElementName).click();
        waitABit(8);
    }

    public void ClickMakeSalaryPayments_Unchecked(String ElementName) {
        waitABit(8);
        MakeSalaryPayments_Unchecked(ElementName).click();
        waitABit(8);
    }

    public void ClickSaveButtonproceRules(String ElementName) {
        waitABit(8);
        SaveButtonprocRules(ElementName).click();
        waitABit(8);
    }

    public void ClickClassificationSettings(String ElementName) {
        waitABit(8);
        ClassificationSettings(ElementName).click();
        waitABit(8);
    }

    public void ClickiconClassification(String ElementName) {
        waitABit(8);
        iconClassification(ElementName).click();
        waitABit(8);
    }

    public void ClickSelectType(String ElementName) {
        waitABit(8);
        SelectType(ElementName).click();
        waitABit(8);
    }

    public void ClickSelectDepartment(String ElementName) {
        waitABit(8);
        SelectDepartment(ElementName).click();
        waitABit(8);
    }

    public void ClickSaveClassification(String ElementName) {
        waitABit(8);
        SaveClassification(ElementName).click();
        waitABit(8);
    }

    public void ClickCloseClassification(String ElementName) {
        waitABit(8);
        CloseClassification(ElementName).click();
        waitABit(8);
    }

    public void ClickCompanyBankDetails(String ElementName) {
        waitABit(8);
        CompanyBankDetails(ElementName).click();
        waitABit(8);
    }

    public void ClickPaymentMethod(String ElementName) {
        waitABit(8);
        PaymentMethod(ElementName).click();
        waitABit(8);
    }

    public void ClickBACS(String ElementName) {
        waitABit(8);
        BACS(ElementName).click();
        waitABit(8);
    }

    public void ClickPaymentFileFormat(String ElementName) {
        waitABit(8);
        PaymentFileFormat(ElementName).click();
        waitABit(8);
    }

    public void ClickPaymentStandardBACS(String ElementName) {
        waitABit(8);
        PaymentStandardBACS(ElementName).click();
        waitABit(8);
    }

    public void ClickbtnSAVEbank(String ElementName) {
        waitABit(8);
        btnSAVEbank(ElementName).click();
        waitABit(8);
    }
    public void ClickHomeCompSettings(String ElementName) {
        waitABit(8);
        HomeCompSettings(ElementName).click();
        waitABit(8);
    }
}
