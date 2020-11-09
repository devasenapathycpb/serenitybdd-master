@RunPP
Feature: Primo payroll Regression Suite

  @RunPP1
  Scenario:Validate the Primo Payroll Login functionality by valid details
    Given user opens primo payroll application
    When user login with userID
    When user enter the password and PIN
    When click on log in button

  @RunPP2
  Scenario:Validate the Client company creation by valid details
    When I search the client company in search text box
    Then I verify whether the company is already registered

    When click on icon near to company list
    Then verify the SetUp Your Company Title
    Then Enter the Contact Information Details
    Then I Enter the Company Name
    Then I enter the company information Details
    Then I click on Continue Button
    Then Verify the Period Settings tab

    Then Enter the HMRC settings Info
    Then I Agree Terms & Conditions
    Then click on Done

  @RunPP3
  Scenario:Validate the Company Settings by valid details
    When I search the client company in search text box
    Then Open the client company
    When I Click on Settings icon
    When I Click on Processing Rules
    When I Click on Client Rules Tab
    Then I Enable the Send Payment File to Employer
    Then I Enable the Make Salary Payments to Employer
    Then I click on Save Button in Processing Rules

    When I click on Classification Settings
    Then I click on + icon in classication
    Then I click on Type
    Then I select Department in dropdown
    Then I Enter the Name
    Then I click on Save Button in classification
    Then I close the Classification Window

    When I Enter the Company Bank Details
    Then I Enter the Account number
    Then I Enter the sort code
    Then I Select the Payment Method
    Then I Select BACS
    Then I Select Payment File Format
    Then I Select the Standard BACS Bureau
    Then I Click on SAVE button in BANK Details
    Then I Click on Home Icon in Company Settings

  @RunPP4
  Scenario:Validate the Employee creation by valid details
    Then Click on + icon near Employees Title

    Then I Enter a Personal Information
    Then I select the Gender
    Then I Enter the contact Details
    Then I click on Communication Details
    Then I Enter the Employment Details
    Then I click on the Next Button

    Then I Enter the Starter Declaration Details
    Then I select the Tax basis
    Then i click on next button in starter Declaration

    Then I Enter the HMRC settings by valid details
#    Then I Enter the Car Benefit details used by RTI
#    Then I select the fuel Type of the car
    Then I Click on the Next button in HMRC settings

    Then I Enter the Bank Details of the employee
    Then I click on Save Button
    Then I Click on Home Icon in Employee Settings

  @RunPP5
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




