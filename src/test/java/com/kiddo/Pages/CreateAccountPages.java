package com.kiddo.Pages;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.kiddo.Driver.DesiredCapability;
import com.kiddo.PageObjects.CommonActionsConditions;
import com.kiddo.Driver.TestData;


public class CreateAccountPages extends DesiredCapability {

	public static String getParentName;
	public static String getSureName;
	public static String getParentEmail;
	public static String getHome;
	public static String getReady;
	public static String getAddKidPage;
	public static String getDetailsPage;
	public static String getMedicalInsightsPage;
	public static String getImageUploadPage;
	public static String getLoginName;
	public static String getChildName;
	public static String getGender;
	public static String getChildRelation;
	public static String getDOB;
	public static String getHeight;
	public static String getWeight;
	public static String getMedicalCon;
	public static String getAllergies;
	public static String getCreateParentEmail;
	public static String getOkayPopUp;
	public static String getPleaseContact;
	public static String getAllergy;
	public static String getKidsGoals;

	CommonActionsConditions common = new CommonActionsConditions();

	@FindBy(xpath = "//android.widget.TextView[@text='Log in']")
	public static WebElement Login;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Gopinath Angusamy gopinathangusamy2@gmail.com\"]/android.widget.TextView[2]")
	public static WebElement LoginAccount;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"userName\"]")
	public static WebElement LoginVerify;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"HeaderTitleLbl\"]")
	public static WebElement MedicalInsightsPage;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"TitleLbl\"]")
	public static WebElement ImageUploadPage;

	@FindBy(xpath = "//android.widget.TextView[@text='Female']")
	public static WebElement Female;

	@FindBy(xpath = "//android.widget.TextView[@text='Other']")
	public static WebElement Other;

	@FindBy(xpath = "//android.widget.TextView[@text='Let's add a few more details for QAGopinath']")
	public static WebElement ChildDetailsPage;

	@FindBy(xpath = "//android.widget.TextView[@text='Guardian']")
	public static WebElement Guardian;

	@FindBy(xpath = "//android.widget.TextView[@text='Father']")
	public static WebElement Father;

	@FindBy(xpath = "//android.widget.TextView[@text='Great, let's create their profile.']")
	public static WebElement AddKidPage;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"SplashScreenLbl\"]")
	public static WebElement Home;

	@FindBy(xpath = "//android.widget.TextView[@text='Create Account']")
	public static WebElement CreateAccount;

	@FindBy(xpath = "//android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")
//	public static WebElement ContinueWithGoogle;
	public List<WebElement> ContinueWithGoogle = new ArrayList<>();

	@FindBy(xpath = "//android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
	public static WebElement ContinueWithGoogle1;

	@FindBy(xpath = "//android.widget.Button[@text='Continue with Google']")
	public static WebElement ContinueWithGoogle2;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Sign in as a different user?\"]")
	private static WebElement SignInDifferentUser;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Gopinath Angusamy angusamygopinath@gmail.com\"]/android.widget.TextView[2]")
	private static WebElement SelectAccount;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ParentName\"]")
	private static WebElement ParentName;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ParentSurname\"]")
	private static WebElement SureName;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ParentEmail\"]")
	private static WebElement ParentEmail;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
	private static WebElement CreateParentEmail;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ParentZipcode\"]")
	private static WebElement ZipCode;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Confirm & ContinueLbl\"]")
	private static WebElement ConfirmContinue;

	@FindBy(xpath = "//android.widget.TextView[@text='Before adding kids to your account']")
	private static WebElement KiddoReady;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"YesLbl\"]")
	private static WebElement Yes;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildName\"]")
	private static WebElement ChildName;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")
	private static WebElement ChildRelation;

	@FindBy(xpath = "//android.widget.TextView[@text='Mother']")
	private static WebElement Mother;

	@FindBy(xpath = "//android.widget.TextView[@text='Apply']")
	private static WebElement Apply;

	@FindBy(xpath = "//android.widget.TextView[@text='Next']")
	private static WebElement Next;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")
	private static WebElement ChildGender;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
	private static WebElement ChildGender1;

	@FindBy(xpath = "//android.widget.TextView[@text='Male']")
	private static WebElement Male;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ImageView")
	private static WebElement ChildDateOfBirth;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView")
	private static WebElement ChildWeight;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
	private static WebElement ChildWeight1;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.ImageView")
	private static WebElement ChildHeight;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView")
	private static WebElement ChildHeight1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"PrimaryOptionundefined\"])[1]")
	private static WebElement Autism;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"PrimaryOptionundefined\"])[2]")
	private static WebElement Asthma;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"PrimaryOptionundefined\"])[3]")
	private static WebElement Diabetes;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"PrimaryOptionundefined\"])[4]")
	private static WebElement ConditionOther;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"PrimaryOptionundefined\"])[5]")
	private static WebElement None;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
	private static WebElement Cancel;

	@FindBy(xpath = "//android.widget.TextView[@text='Yes, Exit']")
	private static WebElement YesExit;
	
	public void VerifyMedicalConditionlist() {
		wait.until(ExpectedConditions.visibilityOf(Autism));
		wait.until(ExpectedConditions.visibilityOf(Asthma));
		wait.until(ExpectedConditions.visibilityOf(Diabetes));
		wait.until(ExpectedConditions.visibilityOf(ConditionOther));
		wait.until(ExpectedConditions.visibilityOf(None));
	}

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.ImageView")
	private static WebElement ChildMedical;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.TextView")
	private static WebElement ChildMedical1;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"AllergyOptionDairy\"]")
	private static WebElement Dairy;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"PlusIcon\"]")
	private static WebElement PlusIcon;

	@FindBy(xpath = "//android.widget.TextView[@text='Choose an avatar']")
	private static WebElement Avatar;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SelectAvatar2\"]/android.view.ViewGroup/android.widget.ImageView")
	private static WebElement ChooseAnAvatar;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Upload a photoLbl\"]")
	private static WebElement UploadAPhoto;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Take a photoLbl\"]")
	private static WebElement TakeAPhoto;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Choose from libraryLbl\"]")
	private static WebElement library;

	@FindBy(xpath = "//android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	public static WebElement Okay;
	
	@FindBy(xpath = "//android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	public static WebElement Okay1;

	@FindBy(xpath = "//android.widget.TextView[@text='Go To Dashboard']")
	public static WebElement GoToDashboard;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"DescriptionLbl\"]")
	public static WebElement PleaseContact;

	@FindBy(xpath = "//android.widget.TextView[@text='Sign Out']")
	public static WebElement Signout;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"PrimaryOptionOther\"]")
	public static WebElement OtherOption;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"OtherTextInput\"]")
	public static WebElement OtherInput;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"AllergyOptionOther\"]")
	public static WebElement OtherOptionAllergies;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"OtherTextInput\"]")
	public static WebElement OtherInputAllergies;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	public static WebElement PairKiddoBand;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Goals']")
	private static WebElement KidsGoals;
	
	
	public void ClickPairKiddoBand() {
		wait.until(ExpectedConditions.elementToBeClickable(PairKiddoBand));
		common.ClickElement(PairKiddoBand);
	}

	public void ClickOtherOptionAllergies() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherOptionAllergies));
		common.ClickElement(OtherOptionAllergies);
	}

	public void ClickCancel() {
		wait.until(ExpectedConditions.elementToBeClickable(Cancel));
		common.ClickElement(Cancel);
	}
	public void ClickYesExit() {
		wait.until(ExpectedConditions.elementToBeClickable(YesExit));
		common.ClickElement(YesExit);
	}
	public void EnterOtherInputAlergies() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherInputAllergies));
		common.SendText(OtherInputAllergies, TestData.Allergies);
	}


	public void ClickOtherOption() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherOption));
		common.ClickElement(OtherOption);
	}

	public void EnterOtherInput() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherInput));
		common.SendText(OtherInput, TestData.MedicalCondition);
	}

	public void VerifyEnteredOther() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildMedical));
		getMedicalCon = ChildMedical.getText();
		Assert.assertEquals(getMedicalCon, TestData.MedicalCondition);
	}

	public void EnterInvalidChildName() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildName));
		common.SendText(ChildName, TestData.InvalidChildName);

	}

	public void GetPleaseContact() {
		wait.until(ExpectedConditions.elementToBeClickable(PleaseContact));
		getPleaseContact = PleaseContact.getText();
		Assert.assertEquals(getPleaseContact, TestData.PleaseContact);
	}

	public void EnterInvalidZipCode() {
		wait.until(ExpectedConditions.elementToBeClickable(ZipCode));
		common.SendText(ZipCode, TestData.InvalidZipCode);
	}

	public void ClickOkay() {
		wait.until(ExpectedConditions.elementToBeClickable(Okay));
		common.ClickElement(Okay);
	}
	
	public void ClickOkay1() {
		wait.until(ExpectedConditions.elementToBeClickable(Okay1));
		common.ClickElement(Okay1);
	}

	public void ClickSignOut() {
		wait.until(ExpectedConditions.elementToBeClickable(Signout));
		common.ClickElement(Signout);
	}

	public void GetOkay() {
		wait.until(ExpectedConditions.visibilityOf(Okay));
		getOkayPopUp = Okay.getText();
		Assert.assertEquals(getOkayPopUp, TestData.Okay);
	}

	public void ClickGoToDashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(GoToDashboard));
		common.ClickElement(GoToDashboard);
	}

	public void GetMedicalInsightsPage() {
		wait.until(ExpectedConditions.visibilityOf(MedicalInsightsPage));
		getMedicalInsightsPage = MedicalInsightsPage.getText();
		Assert.assertEquals(getMedicalInsightsPage, TestData.MedicalInsights);
	}

	public void ClickLoginButton() {
		wait.until(ExpectedConditions.elementToBeClickable(Login));
		common.ClickElement(Login);
	}

	public void ClickLoginAccount() {
		wait.until(ExpectedConditions.visibilityOf(LoginAccount));
		common.ClickElement(LoginAccount);
	}

	public void VerifyLoginAccount() {
		wait.until(ExpectedConditions.visibilityOf(LoginVerify));
		getLoginName = LoginVerify.getText();
		Assert.assertEquals(getLoginName, "Hi Gopinath");

	}

	public void SelectChooseAnAvatar() {
		wait.until(ExpectedConditions.elementToBeClickable(ChooseAnAvatar));
		common.ClickElement(ChooseAnAvatar);
	}

	public void ClickAvatar() {
		wait.until(ExpectedConditions.elementToBeClickable(Avatar));
		common.ClickElement(Avatar);
	}

	public void ClickPlusIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(PlusIcon));
		common.ClickElement(PlusIcon);
	}

	public void ClickMedicalCondition() {
		wait.until(ExpectedConditions.elementToBeClickable(Asthma));
		common.ClickElement(Asthma);
	}

	public void ClickAllergies() {
		wait.until(ExpectedConditions.elementToBeClickable(Dairy));
		common.ClickElement(Dairy);
	}

	public void GetChildDetailsPage() {
		wait.until(ExpectedConditions.visibilityOf(ChildDetailsPage));
		getDetailsPage = ChildDetailsPage.getText();
		Assert.assertEquals(getDetailsPage, TestData.LetsAdd);
	}

	public void ClickChildGender(){
		wait.until(ExpectedConditions.elementToBeClickable(ChildGender));
		common.ClickElement(ChildGender);
	

	}

	public void VerifyGenderList() {
		wait.until(ExpectedConditions.visibilityOf(Female));
		wait.until(ExpectedConditions.visibilityOf(Other));
	}

	public void ClickMale() {
		wait.until(ExpectedConditions.elementToBeClickable(Male));
		common.ClickElement(Male);
	}

	public void ClickChildDateOfBirth() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildDateOfBirth));
		common.ClickElement(ChildDateOfBirth);
	}

	public void ClickChildWeight() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildWeight));
		common.ClickElement(ChildWeight);
	}

	public void ClickChildHeight() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildHeight));
		common.ClickElement(ChildHeight);
	}

	public void ClickChildMedical() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildMedical));
		common.ClickElement(ChildMedical);
	}

	public void GetHome() {
		wait.until(ExpectedConditions.elementToBeClickable(Home));
		getHome = Home.getText();
		Assert.assertEquals(getHome, "Keep an eye on your kid’s health,\n" + "even when they’re out of sight.");

	}

	public void ClickCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateAccount));
		common.ClickElement(CreateAccount);
	}
	
	public void ClickContinueWithGoogle1() {
		wait.until(ExpectedConditions.elementToBeClickable(ContinueWithGoogle2));
		common.ClickElement(ContinueWithGoogle2);
	}

	public void ClickContinueWithGoogle() throws InterruptedException {

		Thread.sleep(2000);
		List<WebElement> ldriver = driver
				.findElements(By.xpath("//android.widget.TextView[@text='Sign in as a different user?']"));
		if (ldriver.size() == 1) {

			wait.until(ExpectedConditions.elementToBeClickable(SignInDifferentUser));
			common.ClickElement(SignInDifferentUser);
			wait.until(ExpectedConditions.elementToBeClickable(ContinueWithGoogle1));
			common.ClickElement(ContinueWithGoogle1);

		} else {

			wait.until(ExpectedConditions.elementToBeClickable(ContinueWithGoogle1));
			common.ClickElement(ContinueWithGoogle1);
		}
	}

	public void ClickSelectAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(SelectAccount));
		common.ClickElement(SelectAccount);
	}

	public void GetKiddoReady() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(KiddoReady));
		getReady = KiddoReady.getText();
		Assert.assertEquals(getReady, "Before adding kids to your account");
	}

	public void ClickYes() {
		wait.until(ExpectedConditions.elementToBeClickable(Yes));
		common.ClickElement(Yes);
	}

	public void GetParentName() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> ldriver = driver
				.findElements(By.xpath("//android.widget.TextView[@content-desc=\"Go To DashboardLbl\"]"));
		if (ldriver.size() == 1) {

			wait.until(ExpectedConditions.elementToBeClickable(GoToDashboard));
			common.ClickElement(GoToDashboard);
			Thread.sleep(5000);
			ClickCreateAccount();
			ClickContinueWithGoogle();
			ClickSelectAccount();
			wait.until(ExpectedConditions.elementToBeClickable(ParentName));
			getParentName = ParentName.getText();
			Assert.assertEquals(getParentName, TestData.Parent_Name);
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(ParentName));
			getParentName = ParentName.getText();
			Assert.assertEquals(getParentName, TestData.Parent_Name);

		}
	}

	public void GetSureName() {
		wait.until(ExpectedConditions.elementToBeClickable(SureName));
		getSureName = SureName.getText();
		Assert.assertEquals(getSureName, TestData.Sur_Name);
	}

	public void GetParentEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(ParentEmail));
		getParentEmail = ParentEmail.getText();
		Assert.assertEquals(getParentEmail, TestData.Email);
	}

	public void GetCreateParentEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateParentEmail));
		getCreateParentEmail = CreateParentEmail.getText();
		Assert.assertEquals(getCreateParentEmail, TestData.Email);
	}

	public void EnterParentZipCode() {
		wait.until(ExpectedConditions.elementToBeClickable(ZipCode));
		common.SendText(ZipCode, TestData.ZipCode);
	}

	public void ClickConfirmContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmContinue));
		common.ClickElement(ConfirmContinue);
	}

	public void GetAddKidPage() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(AddKidPage));
		getAddKidPage = AddKidPage.getText();
		Assert.assertEquals(getAddKidPage, "Great, let's create their profile");
	}

	public void EnterChildName() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildName));
		common.SendText(ChildName, TestData.ChildName);

	}

	public void SelectChildRelation() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildRelation));
		common.ClickElement(ChildRelation);
	}

	public void VerifyFather() {
		wait.until(ExpectedConditions.visibilityOf(Father));
		common.ClickElement(Father);
	}

	public void VerifyGuradian() {
		wait.until(ExpectedConditions.visibilityOf(Guardian));

	}

	public void SelectMother() {
		wait.until(ExpectedConditions.elementToBeClickable(Mother));
		common.ClickElement(Mother);
	}

	public void SelectFather() {
		wait.until(ExpectedConditions.elementToBeClickable(Father));
		common.ClickElement(Father);
	}

	public void ClickApply() {
		wait.until(ExpectedConditions.elementToBeClickable(Apply));
		common.ClickElement(Apply);
	}

	public void ClickNext() {
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
	}

	public void ClickNextWhoWear() {

		GetWhoWear();
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
	}

	public void GetWhoWear() {
		getChildName = ChildName.getText();
		getChildRelation = ChildRelation.getText();
		
		System.out.println(getChildName);
		System.out.println(getChildRelation);
	}

	public void ClickNextChildDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		getGender = ChildGender1.getText();
		getDOB = ChildDateOfBirth.getText();
		getWeight = ChildWeight1.getText();
		getHeight = ChildHeight1.getText();
		getMedicalCon = ChildMedical1.getText();
		System.out.println(getGender);
		System.out.println(getDOB);
		System.out.println(getWeight);
		System.out.println(getHeight);
		System.out.println(getMedicalCon);
		
		common.ClickElement(Next);
	}

	}


