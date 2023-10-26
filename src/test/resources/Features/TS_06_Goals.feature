#Author:  Gopinath Angusamy

@Sanity @Regression
Feature: Verify the App functions

  Background: Launch the Kiddo App
    Given Launch the App

  @Goals
  Scenario: User edit the parenet name 
  
   When User is in "Welcome" Page
   And User clicks on "Goals" 
   And User clicks on "Wed"
   When User is in "Goals" Page
   And User clicks on "Tue"
   When User is in "Goals" Page
   And User clicks on "Mon"
   When User is in "Goals" Page
   And User clicks on "Sun"
   When User is in "Goals" Page
   And User clicks on "Thu"
   When User is in "Goals" Page
   And User clicks on "Sat"
   When User is in "Goals" Page
   And User clicks on "Fri"
   When User is in "Goals" Page
   
