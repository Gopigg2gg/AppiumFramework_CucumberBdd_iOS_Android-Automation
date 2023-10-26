package com.kiddo.Stepdef;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.NoSuchElementException;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.kiddo.Driver.DesiredCapability;
import com.kiddo.Pages.AddChildPages;
import com.kiddo.Pages.CreateAccountPages;
import com.kiddo.Util.Log;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountSteps extends DesiredCapability {

	CreateAccountPages Create = new CreateAccountPages();

	AddChildPages AddChild = new AddChildPages();
	

	@Given("^Launch the App$")
	public void Launch_the_app() throws Throwable {
		System.out.println("App launched");

		Log.info("App launched");
	}

	@And("^User enters the invalid \"([^\"]*)\"$")
	public void enter_the_invalid(String Page) throws InterruptedException {

		if (Page.equals("Zip Code")) {

			Log.info("Enters the invalid zip code");
			Create.EnterInvalidZipCode();
		} else if (Page.equals("ChildName")) {

			Log.info("Clicks on the continue with google");
			Create.EnterInvalidChildName();
		} 
	}

	@And("^User clicks on \"([^\"]*)\"$")
	public void user_is_in_page(String Page) throws InterruptedException {

		if (Page.equals("CreateAccount")) {

			Log.info("Clicks on the create account");
			Create.ClickCreateAccount();
		} else if (Page.equals("ContinueWithGoogle")) {

			Log.info("Clicks on the continue with google");
			Create.ClickContinueWithGoogle();
		} else if (Page.equals("ContinueWithGoogle1")) {

			Log.info("Clicks on the continue with google");
			Create.ClickContinueWithGoogle1();
		}  else if (Page.equals("Add Kiddo")) {

			Log.info("Clicks on the continue with google");
			AddChild.clickAddKiddo();
		}
		 else if (Page.equals("LoginButton")) {

			Log.info("Clicks on the No button in the Deactivate popup");
			Create.ClickLoginButton();
		}  
		 else if (Page.equals("SelectAccount")) {

			Log.info("Clicks on select account in the login page.");
			Create.ClickSelectAccount();
		} else if (Page.equals("Confirm Continue")) {
			Log.info("Clicks on the confirm continue.");

			Create.ClickConfirmContinue();
		} else if (Page.equals("Yes")) {
			Log.info("Clicks on the yes button.");
			Thread.sleep(10000);
			Create.ClickYes();
		} else if (Page.equals("Confirm Continue")) {
			Log.info("Clicks on the confirm continue.");
			Create.SelectChildRelation();
		} else if (Page.equals("Child Relation")) {
			Log.info("Clicks on the child relation.");
			Create.SelectChildRelation();
		} else if (Page.equals("Mother")) {
			Log.info("user selects the mother.");
			Create.SelectMother();
		} else if (Page.equals("Mother")) {
			Log.info("user selects the mother.");
			Create.SelectMother();
		} else if (Page.equals("Father")) {
			Log.info("user selects the father from the dropdown.");
			Create.SelectFather();
		} else if (Page.equals("Apply")) {
			Log.info("user click on the apply button");

			Create.ClickApply();
		} else if (Page.equals("Next Who Will Wear")) {
			Log.info("click on next who will wear.");
			Thread.sleep(2000);
			Create.ClickNextWhoWear();
		} else if (Page.equals("Next Child Details")) {
			Log.info("Clicks on the next child details.");
			Thread.sleep(5000);
			Create.ClickNextChildDetails();
		
		} else if (Page.equals("ChildGender")) {
			Log.info("Click on childgender in the child settings page.");

			Create.ClickChildGender();
	
		} else if (Page.equals("Male")) {
			Log.info("user selects the male in the gender page");

			Create.ClickMale();
		} else if (Page.equals("Female")) {
			Log.info("user selects the female in the gender page");
			AddChild.clickEditGenderFemale();
		} else if (Page.equals("Apply")) {
			Log.info("Clicks on the Apply Button.");

			Create.ClickApply();
		} else if (Page.equals("ChildDateOfBirth")) {
			Log.info("User selects the childdate of birth.");

			Create.ClickChildDateOfBirth();
			Create.ClickApply();
		} else if (Page.equals("ChildWeight")) {
			Log.info("User selects the Child weight.");

			Create.ClickChildWeight();
			Create.ClickApply();
		} else if (Page.equals("ChildHeight")) {
			Log.info("Clicks on the Child Heigth.");

			Create.ClickChildHeight();
			Create.ClickApply();
		} else if (Page.equals("Next")) {
			Log.info("Clicks on the next button.");
			Create.ClickNext();
		} else if (Page.equals("Child Medical")) {
			Log.info("Clicks on the Child Medical.");
			Create.ClickChildMedical();
		} else if (Page.equals("Plus Icon")) {
			Log.info("Clicks on the Plus Icon in child profile page.");

			Create.ClickPlusIcon();
		} else if (Page.equals("Choose An Avatar")) {
			Log.info("User selects the choose an avatar.");

			Create.ClickAvatar();
		} else if (Page.equals("LoginAccount")) {
			Log.info("Clicks on the Login account button.");

			Create.ClickLoginAccount();
		}  

	else if (Page.equals("Okie")) {
			Log.info("Clicks on the okie button.");

		} else if (Page.equals("Contact")) {
			Log.info("Clicks on the contact button.");
		} else if (Page.equals("AddChild")) {
			Log.info("Clicks on the Add child from the child page.");
			AddChild.clickAddChilds();
		} else if (Page.equals("No")) {
			Log.info("Clicks on the No button whild adding child.");
			AddChild.clickNo();
		} else if (Page.equals("GotIt")) {
			Log.info("Clicks on the Got it.");
			AddChild.clickGotIt();
		} else if (Page.equals("Add Kiddo Band")) {
			Log.info("Clicks on the Add kiddo band.");
			AddChild.clickAddKiddoBand();
		} else if (Page.equals("Add New Kiddo")) {
			Log.info("Clicks on the add new kiddo band.");
			AddChild.clickAddNewKiddo();
		} else if (Page.equals("Kiddo Band Drop Down")) {
			Log.info("Clicks on the kiddon band drop down.");
			AddChild.clickKiddoBandDropDown();
		} else if (Page.equals("Child Profile")) {
			Log.info("Clicks on the child profile in the child settings page.");
			AddChild.clickChildprofile();
		} else if (Page.equals("Child Profile")) {
			Log.info("Clicks on the child profile in the child settings page.");
			AddChild.clickChildprofile();
		}
		else if (Page.equals("Child")) {
			Log.info("Clicks on the child profile in the child settings page.");
			AddChild.clickAddedChild();
		} else if (Page.equals("Child1")) {
			Log.info("Clicks on the child profile in the child settings page.");
			AddChild.clickAddedChild1();
		}
		else if (Page.equals("Save Changes")) {
			Log.info("Clicks on the save button.");
			AddChild.clickSaveChildChanges();
		} else if (Page.equals("Save")) {
			Log.info("Clicks on the save button.");
			AddChild.clickSave();
		}else if (Page.equals("Okay")) {
			Log.info("user clicks on Okay button.");
			Create.ClickOkay();
		} else if (Page.equals("Okay1")) {
			Log.info("user clicks on Okay button.");
			Create.ClickOkay1();
		} else if (Page.equals("SignOut")) {
			Log.info("user click on the signout in the create account");
			Create.ClickSignOut();
		} else if (Page.equals("GoToDashboard")) {
			Log.info("user click on the go to dashboard.");
			Create.ClickGoToDashboard();
		} else if (Page.equals("Other")) {
			Log.info("click on the other button in the medical condition.");
			Create.ClickOtherOption();
		} else if (Page.equals("Other Allergies")) {
			Log.info("click on the other button in the allergies.");
			Create.ClickOtherOptionAllergies();
		} else if (Page.equals("Pair Kiddo Band")) {
			Thread.sleep(5000);
			Log.info("User clicks on the kiddo band to your account");
			Create.ClickPairKiddoBand();
		}  else if (Page.equals("Add Child")) {
			Log.info("Clicks on the Add child from the child page.");
			AddChild.clickAddChild();
		} else if (Page.equals("Autism")) {
			Log.info("Clicks on the Add child from the child page.");
			AddChild.clickGivenAutism();
		} 
	
	}	

	@When("^User is in \"([^\"]*)\" Page$")
	public void user_in_current_page(String Page) throws InterruptedException {

		if (Page.equals("Home")) {
			Log.info("verify user in the home page.");
			Create.GetHome();
		} else if (Page.equals("Kiddo Ready Set Up")) {
			Log.info("verify user in the kiddo ready set page.");
			Create.GetKiddoReady();

		} else if (Page.equals("Add Your Kid")) {

			Log.info("verify user navifate to the add your kid page");
			Create.GetAddKidPage();

		} else if (Page.equals("Child Details")) {
			Thread.sleep(5000);
			Log.info("verify on the Child details eneter field is correct.");
			Create.GetChildDetailsPage();

		} else if (Page.equals("Medical Insights")) {
			//Don remove sleep
			Thread.sleep(3000);
			Log.info("verify the given medical insights is correct.");
			Create.GetMedicalInsightsPage();
		}  else if (Page.equals("Delete POP")) {
			Log.info("Verify if the text of Welcome page is correct");
			AddChild.checkDeletePOP();
		}
	}

	@Then("^user closes the App$")
	public void user_closes_app() throws InterruptedException {
		Log.info("Close of kill the app");
		driver.closeApp();
		Thread.sleep(1000);
		driver.quit();
	}

	@Then("^Verify \"([^\"]*)\"$")
	public void verify(String options) throws InterruptedException, MalformedURLException {
		if (options.equals("Parent Name")) {
			Log.info("verify the enter parent name is correct");
			Create.GetParentName();
		} else if (options.equals("Sure Name")) {
			Log.info("verify the enter Sur name is correct");
			Create.GetSureName();
		} else if (options.equals("Create Parent Email")) {
			Log.info("verify the create parent email is correct");
			Create.GetCreateParentEmail();
		} else if (options.equals("Parent Email")) {
			Log.info("Verify the parent email is coming according to select gmail email address");
			Create.GetParentEmail();
		} else if (options.equals("Gender")) {
			Log.info("Verify the gender list");
			Create.VerifyGenderList();
		} else if (options.equals("Successful Login")) {
			Log.info("Verify the once made the successfull login");
			Create.VerifyLoginAccount();
		}  else if (options.equals("Okay")) {
			Log.info("Users verify the okay is present on the page. ");
			Create.GetOkay();
		}
	}

	@Then("^User enters the \"([^\"]*)\"$")
	public void user_enters_mobile(String Number) throws InterruptedException {
		if (Number.equals("Zip Code")) {

			Log.info("Enter the valid ZipCode in the parent settings page");
			Create.EnterParentZipCode();
		} else if (Number.equals("Child Name")) {
			Log.info("Enter the valid child name");
			Create.EnterChildName();
		}  else if (Number.equals("ChildName")) {
			Log.info("Enter the valid child name");
			AddChild.enterChildName();
		} else if (Number.equals("Edit Child Name")) {
			Log.info("Enter the valid child name");
			AddChild.enterEditChildName();
		}  else if (Number.equals("Other Input")) {
			Log.info("enter the medical condition in the other field.");
			Create.EnterOtherInput();
		} else if (Number.equals("Other Input Allergies")) {
			Log.info("enter the medical condition in the other field.");
			Create.EnterOtherInputAlergies();
		}
	}

	@Then("^Verify the \"([^\"]*)\" Page$")
	public void verify_the_given_page(String Page) throws InterruptedException, IOException, NoSuchElementException {

		if (Page.equals("Gender")) {
			Log.info("verify the gender fields is present");
			Create.VerifyGenderList();
		} else if (Page.equals("Medical Condition List")) {
			Log.info("verify the medical condition list");
			Create.VerifyMedicalConditionlist();
		} else if (Page.equals("Child Edit Fields")) {
			Log.info("verify the child edit fields in present");
			Thread.sleep(15000);
			AddChild.verifyEditChildPages();
		}  else if (Page.equals("Entered Input")) {
			Log.info("verify the entered input medical condition. ");
			Create.VerifyEnteredOther();
		} 
	}

	@And("^User Selects \"([^\"]*)\" in list$")
	public void user_selects_in_list(String Option) throws InterruptedException {
		if (Option.equals("Medical Condition")) {
			Log.info("user selects the Medical condition form the child settings");
			Create.ClickMedicalCondition();
			Create.ClickApply();

		} else if (Option.equals("Allergies")) {
			Log.info("user selects the Allergies form the child settings");
			Create.ClickAllergies();
			Create.ClickApply();

		} else if (Option.equals("Avatar")) {
			Log.info("user selects the Avatar form the chils profile page.");
			Create.ClickAllergies();
			Create.ClickApply();
			Create.ClickNext();
		} else if (Option.equals("ChooseAnAvatar")) {
			Log.info("selects the avatar from the list.");
			Create.SelectChooseAnAvatar();
			Create.ClickApply();
		} 
		
	}

	@And("^User Navigates to \"([^\\\"]*)\"$")
	public void user_navigation_to_section(String section) throws InterruptedException {
		if (section.equals("Articles section")) {
			Log.info("User navigates to Articles section");
	
		}
	}
}
