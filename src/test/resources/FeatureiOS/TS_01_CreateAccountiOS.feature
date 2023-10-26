#Author:  Gopinath Angusamy

@Sanity @Regression
Feature: Create Account

  Background: Launch the Kiddo App
    Given Launch the iOS App

  @CreateAccount @Sanity @Regression
  Scenario: User create new account in kiddo.
    
    When User is in iOS "Home" Page
    And User clicks on iOS "CreateAccount"
    And User clicks on iOS "ContinueWithGoogle"
    
  Scenario: Verify selected gmail account details of parents.
  
    Then Verify iOS "Parent Name"
    Then Verify iOS "Sure Name" 
    And User enters the invalid iOS "Zip Code"
     And User clicks on iOS "Create Done"
    And User clicks on iOS "Confirm Continue"
  	And User enters the iOS "Zip Code"
    And User clicks on iOS "Create Done"
   	And User clicks on iOS "Confirm Continue"
   	
  Scenario: Verify in entering no kiddo band for parents.   	
   	
    When User is in iOS "Kiddo Ready Set Up" Page
    And User clicks on iOS "No" Button
    Then Verify the user in iOS "Please Contact" Page  
    And User clicks on iOS "SignOut"
    When User is in iOS "Home" Page
    And User clicks on iOS "CreateAccount"
    And User clicks on iOS "ContinueWithGoogle"
    And User clicks on iOS "GoToDashboard"
        
  Scenario: Verify in clicking yes kiddo band for parents. 
  
  	And User clicks on iOS "Yes" Button
  	When User is in iOS "Add Your Kid" Page
  	And User enters the invalid iOS "ChildName"
  	And User clicks on iOS "Child Relation"
  	And User clicks on iOS "Mother"
  	And User clicks on iOS "Apply"
  	And User clicks on iOS "Next" 
  	
  Scenario: Enter the child details to create account.  
  
  	And User enters the iOS "Child Name"
  	And User clicks on iOS "Child Relation"
  	Then Verify iOS "Father"
  	Then Verify iOS "Guardian"
  	And User clicks on iOS "Mother"
  	And User clicks on iOS "Mother"
  	And User clicks on iOS "Apply"
    And User clicks on iOS "Next" 
    When User is in iOS "Child Details" Page
    And User clicks on iOS "ChildGender"
    Then Verify the iOS "Gender" Page
    And User clicks on iOS "Male"
    And User clicks on iOS "Apply"
    And User clicks on iOS "ChildDateOfBirth" 
    And User clicks on iOS "ChildWeight"
    And User clicks on iOS "ChildHeight"
    And User clicks on iOS "Next"
    
  Scenario: Enter the medical details for child and verify the given fields 
  
    When User is in iOS "Medical Insights" Page
    And User clicks on iOS "Child Medical"
    Then Verify the iOS "Medical Condition List" Page
    And User clicks on iOS "Other"
    And User enters the iOS "Other Input"
    And User clicks on iOS "Apply"
    And User clicks on iOS "Apply"
    Then Verify the iOS "Entered Input" Page
    And User clicks on iOS "Child Medical"   
    And User Selects iOS "Medical Condition" in list
    And User clicks on iOS "Allergies" 
    And User clicks on iOS "Other Allergies"
    And User enters the iOS "Other Input Allergies"
    And User clicks on iOS "Apply"
    And User clicks on iOS "Apply"
    Then Verify the iOS "Entered Input Allergies" Page
    And User clicks on iOS "Allergies" 
    And User Selects iOS "Allergies" in list
    And User clicks on iOS "Next"
    
  Scenario: Upload the photo of the child.
    
    When User is in iOS "Upload Photo" Page
 		And User clicks on iOS "Plus Icon"
 		And User clicks on iOS "Choose An Avatar"
    And User Selects iOS "ChooseAnAvatar" in list  
    And User clicks on iOS "Next" 
    And User clicks on iOS "Pair Kiddo Band"
    Then Verify the user in iOS "Blue Flashing Light" Page
    And User clicks on iOS "Blue Pulsing Light" Button 
    And User clicks on iOS "Yes, It is" Button
    And User clicks on iOS "Back On Charger" Button
    Then Verify the user in iOS "Select Device" Page
    And User clicks on iOS "Back" Button
    
  Scenario: verify adding the kiddo band page. 
    
    And User clicks on iOS "Blue Pulsing Light" Button 
    And User clicks on iOS "Oops Not" Button
    Then Verify the user in iOS "Battery Low" Page
    And User clicks on iOS "Next" Button
    Then Verify the user in iOS "Kiddo Band Charge" Page
    And User clicks on iOS "Next" Button
    Then Verify the user in iOS "Reset Kiddo Band" Page
		And User clicks on iOS "Reset" Button
    And User clicks on iOS "Back" Button
    And User clicks on iOS "Back" Button
    And User clicks on iOS "Blue Pulsing Light" Button 
    And User clicks on iOS "Yes, It is" Button
    And User clicks on iOS "Back On Charger" Button        
    And User clicks on iOS "Visit Our Support" Button
    And User clicks on iOS "Back Blue" Button    
    And User clicks on iOS "Start from the beginning" Button
    And User clicks on iOS "How To Turn On Bluetooth" Button
    Then Verify the user in iOS "How To Turn On Bluetooth" Page  
    And User clicks on iOS "Back Blue" Button        
    And User clicks on iOS "It's Turned On" Button
    And User clicks on iOS "Kiddo Band Removed" Button     
    And User clicks on iOS "Blue Pulsing Light" Button 
    And User clicks on iOS "Yes, It is" Button
    And User clicks on iOS "Back On Charger" Button   
    And User clicks on iOS "Start from the beginning" Button  
    And User clicks on iOS "Back Band" Button    
    And User clicks on iOS "Cancel" Button
    And User clicks on iOS "Back Band" Button
    And User clicks on iOS "Exit" Button
               
    
  Scenario: Verify parents and child create successfully. 
  
  	And User clicks on iOS "Setting" Button
    And User clicks on iOS "Signout" Button
    Then Verify iOS "ConfirmSignout"
    And User clicks on iOS "Confirm Signout" Button
