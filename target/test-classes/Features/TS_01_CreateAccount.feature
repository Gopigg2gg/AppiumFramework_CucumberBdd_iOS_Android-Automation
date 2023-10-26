#Author:  Gopinath Angusamy

@Sanity @Regression
Feature: Verify the App functions

  Background: Launch the Kiddo App
    Given Launch the App

  @CreateAccount
  Scenario: User create new account in kiddo.
    When User is in "Home" Page
    And User clicks on "CreateAccount"
    And User clicks on "ContinueWithGoogle"
    #And User clicks on "SelectAccount"
    Then Verify "Parent Name"
    Then Verify "Sure Name"
    
    #Then Verify "Create Parent Email" Done uncomment this
    #
    And User enters the invalid "Zip Code"
    And User clicks on "Confirm Continue"
    Then Verify "Okay"
    And User clicks on "Okay"	 
    And User enters the "Zip Code"
    And User clicks on "Confirm Continue"
    When User is in "Kiddo Ready Set Up" Page
    And User clicks on "No"
 	  Then Verify the user in "Please Contact" Page  
    And User clicks on "SignOut"
    When User is in "Home" Page
    And User clicks on "CreateAccount"
    And User clicks on "ContinueWithGoogle"
    #And User clicks on "SelectAccount"
    And User clicks on "GoToDashboard"
    When User is in "Kiddo Ready Set Up" Page
    And User clicks on "Yes"
  
    #When User is in "Add Your Kid" Page dne enable
  
    And User enters the invalid "ChildName"
    And User clicks on "Child Relation"
    And User clicks on "Mother"
    And User clicks on "Next" 
    Then Verify "Okay"
    And User clicks on "Okay"
    And User enters the "Child Name"
    And User clicks on "Child Relation"
    Then Verify "Father"
    Then Verify "Guardian"
    And User clicks on "Father"  
    And User clicks on "Next" 
   
    #When User is in "Child Details" Page done enable
    
    And User clicks on "ChildGender"
    Then Verify the "Gender" Page
    And User clicks on "Male"
    And User clicks on "ChildDateOfBirth" 
    And User clicks on "ChildWeight"
    And User clicks on "ChildHeight"
    And User clicks on "Child Medical"
    Then Verify the "Medical Condition List" Page
    And User Selects "Medical Condition" in list
    And User clicks on "Next"
 	  And User clicks on "Plus Icon"
 	  And User clicks on "Choose An Avatar"
    And User Selects "ChooseAnAvatar" in list  
    And User clicks on "Next" 
    And User clicks on "Pair Kiddo Band"
    Then Verify the user in "Blue Flashing Light" Page
    And User clicks on "Blue Pulsing Light" Button 
    And User clicks on "Yes, It is" Button
    And User clicks on "Back" Button
    And User clicks on "Cancel" Button
    And User clicks on "Back"
    And User clicks on "YesExit" Button
    And User clicks on "GotIt"

    Scenario: Verify Signout in Account page

    And User clicks on "Account"
    And User clicks on "Signout" Button
    And User clicks on "CancelSignout" Button
    Then Verify the user in "Account" Page
    And User clicks on "Signout" Button
    And User clicks on "Yes, signout" Button
    Then Verify the user in "Home" Page


