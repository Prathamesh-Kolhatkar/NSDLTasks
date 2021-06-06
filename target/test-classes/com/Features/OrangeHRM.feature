Feature: Orange HRM

Scenario: Add details of Employee

Given User is on login page "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
When User enters username as "Admin" 
And user enters password as "admin123"
Then login should be successful and home page should be displayed

Scenario: Search Employee Details
Given User is on home page
When User click on Performance tab and Manage Reviews button
Then User can search the employee