Feature: Paytm Metro card recharge
  
  Scenario: Get Balance of Mumbai Metro Card
    Given User navigate to "https://paytm.com/"
    When User clicks on "Metro" tab
    Then User Should be able to select "Mumbai" in Metro, "Smart Card Recharge" in Ticket Type and enter "1234567890" card number
    Then User click on Get Card balance button
    And Paytm Login popup is displayed