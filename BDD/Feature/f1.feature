Feature: Test the KSRTC application
Scenario: Test the Registration page with valid details
Given Open Chrome browser and URL of the application
When Enter the email,fullName,mobileNumber and click on add button
Then Successfully Registration done
And If Registration is failed then move to login page
When Enter the userName,password and click on login button
Then Successfully Login done
When Enter the fromPlace,toPlace,JourneyDate and ReturnJournyDate and click on search button
Then Successfully Availability done

