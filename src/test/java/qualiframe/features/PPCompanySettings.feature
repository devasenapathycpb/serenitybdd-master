Feature: Primo payroll Regression

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