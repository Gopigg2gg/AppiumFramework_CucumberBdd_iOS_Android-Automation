@Sanity @Regression
Feature: Add Child Details

  Background: Launch the Kiddo App
    Given Launch the App

  @addchild
  Scenario: Verifying in Adding new add child account.
 
    And User clicks on iOS "AddChild"
    And User clicks on iOS "No" Button
    And User clicks on iOS "GotIt"
    And User clicks on iOS "AddChild"
  	And User clicks on iOS "Yes" Button  	
    And User enters the iOS "Child Name"
  	And User clicks on iOS "Child Relation"
  	Then Verify iOS "Father"
  	Then Verify iOS "Guardian"
  	And User clicks on iOS "Mother"
  	And User clicks on iOS "Apply" 
    And User clicks on iOS "Next Who Will Wear" 
    And User clicks on iOS "ChildGender"
    Then Verify the iOS "Gender" Page
    And User clicks on iOS "Male"
    And User clicks on iOS "Apply"
    And User clicks on iOS "ChildDateOfBirth" 
    And User clicks on iOS "ChildWeight"
    And User clicks on iOS "ChildHeight"
    And User clicks on iOS "Next Child Details"
    
  Scenario: Enter the medical details for child and verify the given fields 
      
    When User is in iOS "Medical Insights" Page
    And User clicks on iOS "Child Medical"
    Then Verify the iOS "Medical Condition List" Page
    And User Selects iOS "Medical Condition" in list
    And User clicks on iOS "Allergies" 
    And User Selects iOS "Allergies" in list
    And User clicks on iOS "Next Medical Insights" 
    When User is in iOS "Upload Photo" Page
 		And User clicks on iOS "Plus Icon"
 		And User clicks on iOS "Choose An Avatar"
    And User Selects iOS "ChooseAnAvatar" in list  
    And User clicks on iOS "Next"
    
  Scenario: verify adding the kiddo band page.
    
    And User clicks on iOS "Pair Kiddo Band"
    Then Verify the user in iOS "Blue Flashing Light" Page
    And User clicks on iOS "Blue Pulsing Light" Button 
    And User clicks on iOS "Yes, It is" Button
    And User clicks on iOS "Back On Charger" Button
    Then Verify the user in iOS "Select Device" Page
    And User clicks on iOS "Back" Button
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

   Scenario: User verify the add child success
     
    And User clicks on iOS "Add Kiddo Band"
    And User clicks on iOS "Child Profile"
  	Then Verify the given iOS "Child Name"
  	Then Verify the given iOS "Gender"
  	Then Verify the given iOS "DOB"
  	Then Verify the given iOS "Weight"
  	Then Verify the given iOS "Height"
  	And User clicks on iOS "MedicalInf0"
    And User clicks on iOS "BasicInfo"
   
   Scenario: User edit and verify the child account details.
      
     And User clicks on iOS "Edit Child Icon"
     And User clicks on DropDown iOS "ChildName"
     And User enters the iOS "Edit Child Name"
     And User clicks on iOS "Done"
     And User clicks on DropDown iOS "Gender"
     And User clicks on iOS "Female"
     And User clicks on iOS "Apply"
     And User clicks on DropDown iOS "DOB"
     And User Selects "Feb" in list  
     And User clicks on iOS "Apply"
     And User clicks on DropDown iOS "Weight"
     And User clicks on iOS "Apply"
     And User clicks on DropDown iOS "Height"
     And User clicks on iOS "Apply"
     And User clicks on iOS "Save Changes"
     Then Verify the iOS "Child Edit Fields" Page
		 And User clicks on iOS "Delete Account"
		 Then Verify the given iOS "Yes, delete account"
		 And User clicks on iOS "Back Band" Button
		 
		 
    
    
   
      
    
    
    
    
    
    