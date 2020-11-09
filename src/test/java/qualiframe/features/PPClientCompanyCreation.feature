Feature: Primo payroll Regression


  Scenario:Validate the Client company creation by valid details
    When I search the client company in search text box
    Then I verify whether the company is already registered

    When click on icon near to company list
    Then verify the SetUp Your Company Title
    Then Enter the Contact Information Details
    Then I enter the company information Details
    Then I click on Continue Button
    Then Verify the Period Settings tab

    Then Enter the HMRC settings Info
    Then I Agree Terms & Conditions
    Then click on Done