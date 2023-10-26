package com.kiddo.Stepdef;

import java.net.MalformedURLException;

import com.kiddo.Driver.DesiredCapability;
import com.kiddo.Pages.AddChildPages;
import com.kiddo.Pages.CreateAccountPages;
import com.kiddo.Pages.iOS.AddChildPagesiOS;
import com.kiddo.Pages.iOS.CreateAccountPagesiOS;
import com.kiddo.Util.Log;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddChildStepsiOS extends DesiredCapability {
	CreateAccountPagesiOS Create = new CreateAccountPagesiOS();
	AddChildPagesiOS AddChild = new AddChildPagesiOS();

	@Then("^Verify the given iOS \"([^\"]*)\"$")
	public void verify(String options) throws InterruptedException, MalformedURLException {
		if (options.equals("Child Name")) {
			Log.info("Validate the given child name is correct");
			AddChild.validAddedChild();
		} else if (options.equals("Gender")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validGender();
		} else if (options.equals("DOB")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validDOB();
		} else if (options.equals("Weight")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validWeight();
		} else if (options.equals("Height")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validHeight();
		} else if (options.equals("Weight")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validWeight();
		} else if (options.equals("Height")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.validHeight();
		} 
	}

	@And("^User clicks on DropDown iOS \"([^\"]*)\"$")
	public void clicks_Dropdown(String pages) throws InterruptedException {
		if (pages.equals("ChildName")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenChildName();
		}else if (pages.equals("Gender")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenGender();
		} else if (pages.equals("DOB")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenDOB();
		} else if (pages.equals("Weight")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenWeight();
		} else if (pages.equals("Height")) {
			Log.info("Validating the components of the TermsofService");
			AddChild.clickGivenHeight();
		}

	}

}
