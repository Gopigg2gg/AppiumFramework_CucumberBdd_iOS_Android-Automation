package com.kiddo.Stepdef;

import java.net.MalformedURLException;

import com.kiddo.Driver.DesiredCapability;
import com.kiddo.Pages.AddChildPages;
import com.kiddo.Pages.CreateAccountPages;
import com.kiddo.Util.Log;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddChildSteps extends DesiredCapability {
	CreateAccountPages Create = new CreateAccountPages();
	AddChildPages AddChild = new AddChildPages();

	@Then("^Verify the given \"([^\"]*)\"$")
	public void verify(String options) throws InterruptedException, MalformedURLException {
		if (options.equals("Child Name")) {
			Log.info("Validate the given child name is correct");
			Thread.sleep(2000);
			AddChild.validAddedChild();
		} else if (options.equals("Gender")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validGender();
		} else if (options.equals("DOB")) {
			Log.info("Validating the components of the TermsofService");
			Thread.sleep(2000);
			AddChild.validDOB();
		} else if (options.equals("Weight")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validWeight();
		} else if (options.equals("Height")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validHeight();
		} else if (options.equals("MedicalConditions")) {
			Log.info("Validating the components of the TermsofService");
			Thread.sleep(3000);
			AddChild.validMedicalCondition();
		} else if (options.equals("Allergies")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validAllergy();
		}
	}

	@And("^User clicks on DropDown \"([^\"]*)\"$")
	public void clicks_Dropdown(String pages) throws InterruptedException {

		if (pages.equals("ChildName")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenChildName1();
		}else if (pages.equals("Gender")) {
			Log.info("Validating the components of the TermsofService");
			Thread.sleep(2000);
			AddChild.clickGivenGender1();
		} else if (pages.equals("DOB")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenDOB1();
		} else if (pages.equals("Weight")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenWeight1();
		} else if (pages.equals("Height")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenHeight1();
		} else if (pages.equals("Medical")) {
			Log.info("Validating the components of the TermsofService");
			Thread.sleep(3000);
			AddChild.clickGivenMedical1();
		}

	}

}