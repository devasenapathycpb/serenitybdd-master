Feature: Primo payroll Regression

  Scenario:Validate the Run Payroll Functionality by valid details
    When I Click on Total Employees Check Box
    Then I click on Run Payroll Button
    Then I click on Proceed Button
    Then I click on Set Period End Date Ok Button
    Then I click on Toast Message

    Then I Click on Total Employees Check Box in Payslip section
    Then I mouseover the Pay Employees Tab
    Then I Click on Generate Payment File
    Then I click on Confirm payment file
    Then I Click on Generate Payment File button
    Then I click on Toast Message

    Then I Click on Total Employees Check Box in Payslip section
    Then I mouseover the Pay Employees Tab
    Then I click on Confirm payment file in Pay Employees Tab
    Then I click on Confirm button

    Then I Click on RTI Tab
    Then I click on Full Payment Submission(FPS)
    Then I select the Reason for Late Submission
    Then I click on Test Submit Button
    Then I click on Confirm payment file
    Then I click on Treat As Live Button
    Then I click on Close Button

    Then I Click on RTI Tab
    Then I click on Employment Payment Summary(EPS)
    Then I click on Test Submit Icon
    Then I click on close icon
    Then I click on Confirm payment file
    Then I click on Close button in EPS Screen

    Then I Click on Close Period
    Then I Enable Tax Deducted
    Then I Enable NI Employee
    Then I enable NI Employer
    Then I enable NetPay
    Then I click on Close Button in Close Period




