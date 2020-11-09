package qualiframe.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qualiframe.pages.PPRunPayrollPages;

public class PPRunPayrollStepDef {
    private PPRunPayrollPages PPRunPayroll;

    public PPRunPayrollStepDef() {
        PPRunPayroll = new PPRunPayrollPages();
    }

    @When("^I Click on Total Employees Check Box$")
    public void iClickOnTotalEmployeesCheckBox() {
        PPRunPayroll.Click("EmployeeChkBox");
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Run Payroll Button$")
    public void iClickOnRunPayrollButton() {
        PPRunPayroll.ClickbtnRunPayroll("btnRunPayroll");
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Proceed Button$")
    public void iClickOnProceedButton() {
        PPRunPayroll.ClickbtnProceed("btnProceed");
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Set Period End Date Ok Button$")
    public void iClickOnSetPeriodEndDateOkButton() {
        if (PPRunPayroll.btnokSetPeriod("btnokSetPeriod").isDisplayed()) {
            PPRunPayroll.btnokSetPeriod("btnokSetPeriod").click();
            PPRunPayroll.waitForSec(3);
        }
    }


    @Then("^I click on Toast Message$")
    public void iClickOnToastMessage() {
        PPRunPayroll.ClickPayslipToastMessage("PayslipToastMessage");
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I Click on Total Employees Check Box in Payslip section$")
    public void iClickOnTotalEmployeesCheckBoxInPayslipSection() {
        PPRunPayroll.ClickEmpchkBoxPayslip("EmpchkBoxPayslip");
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I mouseover the Pay Employees Tab$")
    public void iMouseoverThePayEmployeesTab() {
        PPRunPayroll.PayEmployeesTab("PayEmployeesTab").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I Click on Generate Payment File$")
    public void iClickOnGeneratePaymentFile() {
        PPRunPayroll.GeneratePayFile("GeneratePayFile").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Confirm payment file$")
    public void iClickOnConfirmPaymentFile() {
        if (PPRunPayroll.ConfirmALERT("ConfirmALERT").isDisplayed()) {
            PPRunPayroll.ConfirmALERT("ConfirmALERT").click();
            PPRunPayroll.waitForSec(3);
        }
    }

    @Then("^I Click on Generate Payment File button$")
    public void iClickOnGeneratePaymentFileButton() {
        PPRunPayroll.btnGenPayFile("btnGenPayFile").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Confirm payment file in Pay Employees Tab$")
    public void iClickOnConfirmPaymentFileInPayEmployeesTab() {
        PPRunPayroll.ConfirmPayment("ConfirmPayment").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Confirm button$")
    public void iClickOnConfirmButton() {
        PPRunPayroll.waitForSec(3);
        PPRunPayroll.Confirmbtn("Confirmbtn").click();
        PPRunPayroll.waitForSec(6);

    }

    @Then("^I Click on RTI Tab$")
    public void iClickOnRTITab() {
        PPRunPayroll.RTItab("RTItab").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Full Payment Submission\\(FPS\\)$")
    public void iClickOnFullPaymentSubmissionFPS() {
        PPRunPayroll.FPS("FPS").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I select the Reason for Late Submission$")
    public void iSelectTheReasonForLateSubmission() {
        if (PPRunPayroll.LateSubmission("LateSubmission").isDisplayed()) {
            PPRunPayroll.LateSubmission("LateSubmission").click();
            PPRunPayroll.waitForSec(3);
            PPRunPayroll.ReasonableExcuse("ReasonableExcuse").click();
        }
    }

    @Then("^I click on Test Submit Button$")
    public void iClickOnTestSubmitButton() {
        PPRunPayroll.btnTestSubmit("btnTestSubmit").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Treat As Live Button$")
    public void iClickOnTreatAsLiveButton() {
        PPRunPayroll.waitForSec(3);
        PPRunPayroll.btnTreatLIVE("btnTreatLIVE").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Close Button$")
    public void iClickOnCloseButton() {
        PPRunPayroll.btnClose("btnClose").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Employment Payment Summary\\(EPS\\)$")
    public void iClickOnEmploymentPaymentSummaryEPS() {
        PPRunPayroll.waitForSec(3);
        PPRunPayroll.EPS("EPS").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Test Submit Icon$")
    public void iClickOnTestSubmitIcon() {
        PPRunPayroll.IconTestSubmit("IconTestSubmit").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on close icon$")
    public void iClickOnCloseIcon() {
        PPRunPayroll.waitForSec(3);
        PPRunPayroll.IconClose("IconClose").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I click on Close button in EPS Screen$")
    public void iClickOnCloseButtonInEPSScreen() {
        PPRunPayroll.IconCloseEPS("IconCloseEPS").click();
        PPRunPayroll.waitForSec(3);

    }

    @Then("^I Click on Close Period$")
    public void iClickOnClosePeriod() {
        PPRunPayroll.btnClosePeriod("btnClosePeriod").click();
        PPRunPayroll.waitForSec(3);
    }

    @Then("^I Enable Tax Deducted$")
    public void iEnableTaxDeducted() {
        PPRunPayroll.chkboxTaxDeducted("chkboxTaxDeducted").click();
    }

    @Then("^I Enable NI Employee$")
    public void iEnableNIEmployee() {
        PPRunPayroll.chkboxNIEmployee("chkboxNIEmployee").click();
    }

    @Then("^I enable NI Employer$")
    public void iEnableNIEmployer() {
        PPRunPayroll.chkboxNIEmployer("chkboxNIEmployer").click();
    }

    @Then("^I enable NetPay$")
    public void iEnableNetPay() {
        PPRunPayroll.chkboxNetPay("chkboxNetPay").click();
    }

    @Then("^I click on Close Button in Close Period$")
    public void iClickOnCloseButtonInClosePeriod() {
        PPRunPayroll.btnClosePeriodscreen("btnClosePeriodscreen").click();
        PPRunPayroll.waitForSec(3);
    }


}
