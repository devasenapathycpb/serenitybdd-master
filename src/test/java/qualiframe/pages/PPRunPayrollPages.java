package qualiframe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PPRunPayrollPages extends BrowserSetUp {
    Map<String, WebElement> keys = new HashMap<>();

    public WebElement EmployeeChkBox(String key) {
        keys.put("EmployeeChkBox", driver.findElement(By.id("cpPopUpEmployeeList_grdEmployeeList_DXSelAllBtn0_D")));
        return keys.get(key);
    }

    public WebElement btnRunPayroll(String key) {
        keys.put("btnRunPayroll", driver.findElement(By.id("cpPopUpEmployeeList_btnRunPayroll")));
        return keys.get(key);
    }

    public WebElement btnProceed(String key) {
        keys.put("btnProceed", driver.findElement(By.id("ContinueRunPayroll")));
        return keys.get(key);
    }
    public WebElement btnokSetPeriod(String key) {
        keys.put("btnokSetPeriod", driver.findElement(By.cssSelector("a#cbpDynamicEmpUserControl_UC_popChangeProcessDate_cpChangeProcessDate_btnOK")));
        return keys.get(key);
    }

    public WebElement PayslipToastMessage(String key) {
        keys.put("PayslipToastMessage", driver.findElement(By.cssSelector(".toast-message")));
        return keys.get(key);
    }

    public WebElement EmpchkBoxPayslip(String key) {
        keys.put("EmpchkBoxPayslip", driver.findElement(By.id("grdPAYEList_DXSelAllBtn0_D")));
        return keys.get(key);
    }

    public WebElement PayEmployeesTab(String key) {
        keys.put("PayEmployeesTab", driver.findElement(By.id("idPayEmployees")));
        return keys.get(key);
    }

    public WebElement GeneratePayFile(String key) {
        keys.put("GeneratePayFile", driver.findElement(By.cssSelector("#mnuActions_DXI0i1_T")));
        return keys.get(key);
    }

    public WebElement ConfirmALERT(String key) {
        keys.put("ConfirmALERT", driver.findElement(By.id("UclAdmin_DxConfirm_btnYes")));
        return keys.get(key);
    }

    public WebElement btnGenPayFile(String key) {
        keys.put("btnGenPayFile", driver.findElement(By.id("popPaymentGenerated_cpBACSGeneration_btnGenerateBACS")));
        return keys.get(key);
    }

    public WebElement ConfirmPayment(String key) {
        keys.put("ConfirmPayment", driver.findElement(By.cssSelector("#mnuActions_DXI0i2_T")));
        return keys.get(key);
    }

    public WebElement Confirmbtn(String key) {
        keys.put("Confirmbtn", driver.findElement(By.id("popConfirmPayment_cppopConfirmPayment_btnpopConfirmPaymentOk")));
        return keys.get(key);
    }

    public WebElement RTItab(String key) {
        keys.put("RTItab", driver.findElement(By.xpath("//span[text()='RTI']")));
        return keys.get(key);
    }

    public WebElement FPS(String key) {
        keys.put("FPS", driver.findElement(By.cssSelector("#mnuRTI_DXI0i0_T")));
        return keys.get(key);
    }

    public WebElement LateSubmission(String key) {
        keys.put("LateSubmission", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popFPSubmission_cppopFPSubmission_cboLatefillingReason_I")));
        return keys.get(key);
    }

    public WebElement ReasonableExcuse(String key) {
        keys.put("ReasonableExcuse", driver.findElement(By.cssSelector("td#cbpDynamicSettingsUserControl_UC_popFPSubmission_cppopFPSubmission_cboLatefillingReason_DDD_L_LBI6T0")));
        return keys.get(key);
    }

    public WebElement btnTestSubmit(String key) {
        keys.put("btnTestSubmit", driver.findElement(By.cssSelector("a#cbpDynamicSettingsUserControl_UC_popFPSubmission_cppopFPSubmission_btnFPSTestSubmit")));
        return keys.get(key);
    }

    public WebElement btnTreatLIVE(String key) {
        keys.put("btnTreatLIVE", driver.findElement(By.cssSelector("a#cbpDynamicSettingsUserControl_UC_popErrorList_cpFPSErrorList_btnFPSTreatAsLive")));
        return keys.get(key);
    }

    public WebElement btnClose(String key) {
        keys.put("btnClose", driver.findElement(By.id("cbpDynamicSettingsUserControl_UC_popErrorList_cpFPSErrorList_btnClose_CD")));
        return keys.get(key);
    }

    public WebElement EPS(String key) {
        keys.put("EPS", driver.findElement(By.xpath("//span[text()='Employer Payment Summary (EPS)']")));
        return keys.get(key);
    }

    public WebElement IconTestSubmit(String key) {
        keys.put("IconTestSubmit", driver.findElement(By.xpath("//img[@title='Test Submit EPS']")));
        return keys.get(key);
    }

    public WebElement IconClose(String key) {
        keys.put("IconClose", driver.findElement(By.xpath("//div[@id='cbpDynamicSettingsUserControl_UC_popEPSErrorList_cpErrorList']//span[@class='sprite-icons popup-close']")));
        return keys.get(key);
    }

    public WebElement IconCloseEPS(String key) {
        keys.put("IconCloseEPS", driver.findElement(By.xpath("//div[@id='cbpDynamicSettingsUserControl_UC_popEPSubmission_PW-1']//following-sibling::span[@class='sprite-icons popup-close'][1]")));
        return keys.get(key);
    }

    public WebElement btnClosePeriod(String key) {
        keys.put("btnClosePeriod", driver.findElement(By.cssSelector("a#btnClosePeriod")));
        return keys.get(key);
    }

    public WebElement chkboxTaxDeducted(String key) {
        keys.put("chkboxTaxDeducted", driver.findElement(By.cssSelector("span#cbpDynamicSettingsUserControl_UC_popClosePeriod_cpClosePeriod_chkTaxDeducted_S_D")));
        return keys.get(key);
    }

    public WebElement chkboxNIEmployee(String key) {
        keys.put("chkboxNIEmployee", driver.findElement(By.cssSelector("span#cbpDynamicSettingsUserControl_UC_popClosePeriod_cpClosePeriod_chkNIEmployee_S_D")));
        return keys.get(key);
    }

    public WebElement chkboxNIEmployer(String key) {
        keys.put("chkboxNIEmployer", driver.findElement(By.cssSelector("span#cbpDynamicSettingsUserControl_UC_popClosePeriod_cpClosePeriod_chkNIEmployer_S_D")));
        return keys.get(key);
    }

    public WebElement chkboxNetPay(String key) {
        keys.put("chkboxNetPay", driver.findElement(By.cssSelector("span#cbpDynamicSettingsUserControl_UC_popClosePeriod_cpClosePeriod_chkNetPay_S_D")));
        return keys.get(key);
    }

    public WebElement btnClosePeriodscreen(String key) {
        keys.put("btnClosePeriodscreen", driver.findElement(By.cssSelector("a#cbpDynamicSettingsUserControl_UC_popClosePeriod_btnpopClosePeriodOk")));
        return keys.get(key);
    }

    public void Click(String ElementName) {
        waitABit(8);
        EmployeeChkBox(ElementName).click();
        waitABit(8);
    }

    public void ClickbtnRunPayroll(String ElementName) {
        waitABit(8);
        btnRunPayroll(ElementName).click();
        waitABit(8);
    }

    public void ClickbtnProceed(String ElementName) {
        waitABit(8);
        btnProceed(ElementName).click();
        waitABit(8);
    }

    public void ClickPayslipToastMessage(String ElementName) {
        waitABit(8);
        PayslipToastMessage(ElementName).click();
        waitABit(8);
    }

    public void ClickEmpchkBoxPayslip(String ElementName) {
        waitABit(8);
        EmpchkBoxPayslip(ElementName).click();
        waitABit(8);
    }
}
