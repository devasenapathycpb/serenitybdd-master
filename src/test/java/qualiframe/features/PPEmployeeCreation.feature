Feature: Primo payroll Regression


  Scenario:Validate the Employee creation by valid details
    When I search the client company in search text box
    Then Open the client company
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
    Then I Enter the Car Benefit details used by RTI
    Then I select the fuel Type of the car
    Then I Click on the Next button in HMRC settings

    Then I Enter the Bank Details of the employee
    Then I click on Save Button
    Then I Click on Home Icon in Employee Settings