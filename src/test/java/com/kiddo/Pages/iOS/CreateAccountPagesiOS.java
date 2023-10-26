package com.kiddo.Pages.iOS;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kiddo.Driver.DesiredCapability;
import com.kiddo.PageObjects.CommonActionsConditions;
import com.kiddo.Driver.TestData;

public class CreateAccountPagesiOS extends DesiredCapability {


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
	public static String getKidsGoals;
	public static String getOkayPopUp;
	public static String getHowToTurnOnBlueTooth;
	
	CommonActionsConditions common = new CommonActionsConditions();

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Log in\"]")
	public static WebElement Login;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Gopinath Angusamy gopinathangusamy2@gmail.com\"]/android.widget.TextView[2]")
	public static WebElement LoginAccount;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"currentHealthReportLbl\"]")
	public static WebElement LoginVerify;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get relevant medical insights\"]")
	public static WebElement MedicalInsightsPage;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personalize your Kiddo appLbl\"]")
	public static WebElement ImageUploadPage;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Female\"]")
	public static WebElement Female;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Other\"]")
	public static WebElement Other;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add your child’s details to get the most accurate readings from the Kiddo band\"]")
	public static WebElement ChildDetailsPage;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Guardian\"]")
	public static WebElement Guardian;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Father\"]")
	public static WebElement Father;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Now let’s add your kid\"]")
	public static WebElement AddKidPage;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Log in\"]")
	public static WebElement Home;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create AccountLbl\"]")
	public static WebElement CreateAccount;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue with Google\"]")
	private static WebElement ContinueWithGoogle;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Gopinath Angusamy angusamygopinath@gmail.com\"]/android.widget.TextView[2]")
	private static WebElement SelectAccount; 

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"NameInput\"]")
	private static WebElement ParentName;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"SurnameInput\"]")
	private static WebElement SureName;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"EmailInput\"]")
	private static WebElement ParentEmail;

	@FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
	private static WebElement CreateParentEmail;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"ZipcodeInput\"]")
	private static WebElement ZipCode;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm & ContinueLbl\"]")
	private static WebElement ConfirmContinue;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"BeforeAddingChildLbl\"]")
	private static WebElement KiddoReady;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"YesLbl\"]")
	private static WebElement Yes;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"ChildNameInput\"]")
	private static WebElement ChildName;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"RelationshipInput\"]")
	private static WebElement ChildRelation;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Mother\"]")
	private static WebElement Mother;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ApplyLbl\"]")
	private static WebElement Apply;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NextLbl\"]")
	private static WebElement Next;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"GenderInput\"]")
	private static WebElement ChildGender;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Male\"]")
	private static WebElement Male;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"DOBInput\"]")
	private static WebElement ChildDateOfBirth;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"WeightInput\"]")
	private static WebElement ChildWeight;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"HeightInput\"]")
	private static WebElement ChildHeight;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionAutismLbl\"]")
	private static WebElement Autism;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionHeartLbl\"]")
	private static WebElement Heart;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionDiabetesLbl\"]")
	private static WebElement Diabetes;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionOtherLbl\"]")
	private static WebElement ConditionOther;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionNoneLbl\"]")
	private static WebElement None;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NoLbl\"]")
	private static WebElement NoButton;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"YesLbl\"]")
	private static WebElement YesButton;
	
	
	public void VerifyMedicalConditionlist() {
		wait.until(ExpectedConditions.visibilityOf(Autism));
		wait.until(ExpectedConditions.visibilityOf(Heart));
		wait.until(ExpectedConditions.visibilityOf(Diabetes));
		wait.until(ExpectedConditions.visibilityOf(ConditionOther));
		wait.until(ExpectedConditions.visibilityOf(None));
	}

	@FindBy(xpath = "//XCUIElementTypeTextView[@name=\"MedicalConditionInput\"]")
	private static WebElement ChildMedical;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PrimaryOptionAsthmaLbl\"]")
	private static WebElement Asthma;

	@FindBy(xpath = "//XCUIElementTypeTextView[@name=\"AllergyInput\"]")
	private static WebElement ChildAllergy;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AllergyOptionDairyLbl\"]")
	private static WebElement Dairy;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"PlusIcon\"]")
	private static WebElement PlusIcon;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Choose an avatarLbl\"]")
	private static WebElement Avatar;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"SelectAvatar1\"]")
	private static WebElement ChooseAnAvatar;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Upload a photoLbl\"]")
	private static WebElement UploadAPhoto;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Take a photoLbl\"]")
	private static WebElement TakeAPhoto;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Choose from libraryLbl\"]")
	private static WebElement library;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"kidsGoalsLbl\"]")
	private static WebElement KidsGoals;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Okay\"]")
	public static WebElement Okay;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Go To DashboardBtn\"])[2]")
	public static WebElement GoToDashboard;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"DescriptionLbl\"]")
	public static WebElement PleaseContact;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign OutLbl\"]")
	public static WebElement Signout;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Other\"]")
	public static WebElement OtherOption;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"OtherTextInput\"]")
	public static WebElement OtherInput;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Other\"]")
	public static WebElement OtherOptionAllergies;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"OtherTextInput\"]")
	public static WebElement OtherInputAllergies;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Pair kiddo band\"]")
	public static WebElement PairKiddoBand;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Sign in as a different user?\"]")
	private static WebElement SignInDifferentUser;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	public static WebElement Done;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Visit our SupportLbl\"]")
	public static WebElement VisitOurSupport;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"BackBtn\"])[2]")
	public static WebElement BackButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"BackBtn\"]")
	public static WebElement BackBand;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start from the beginningLbl\"]")
	public static WebElement StartFromBeginning;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How to turn on Bluetooth?Lbl\"]")
	public static WebElement TurnOnBlueTooth;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"How to turn on Bluetooth?\"])[2]")
	public static WebElement HowToTurnOnBlueTooth;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Exit\"]")
	public static WebElement Exit;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Cancel\"]")
	public static WebElement Cancel;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"CancelBtn\"]")
	public static WebElement Cancel1;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Kiddo band is removed\"]")
	public static WebElement KiddoBandRemoved;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"It's turned onLbl\"]")
	public static WebElement ItsTurnedOn;
	
	public void GetHowToTurnOnBlueTooth() {
		wait.until(ExpectedConditions.visibilityOf(HowToTurnOnBlueTooth));
		getHowToTurnOnBlueTooth = HowToTurnOnBlueTooth.getText();
		Assert.assertEquals(getHowToTurnOnBlueTooth, TestData.TurnOn);
	} 
	public void ClickBackBand() {
		wait.until(ExpectedConditions.elementToBeClickable(BackBand));
		common.ClickElement(BackBand);
	}
	
	public void ClickItsTurnedOn() {
		wait.until(ExpectedConditions.elementToBeClickable(ItsTurnedOn));
		common.ClickElement(ItsTurnedOn);
	}
	public void ClickExit() {
		wait.until(ExpectedConditions.elementToBeClickable(Exit));
		common.ClickElement(Exit);
	}
	public void ClickNoButton() {
		wait.until(ExpectedConditions.elementToBeClickable(NoButton));
		common.ClickElement(NoButton);
	} 
	public void ClickYesButton() {
		wait.until(ExpectedConditions.elementToBeClickable(YesButton));
		common.ClickElement(YesButton);
	}
	
	public void ClickCancel() {
		wait.until(ExpectedConditions.elementToBeClickable(Cancel));
		common.ClickElement(Cancel);
	}
	public void ClickCancel1() {
		wait.until(ExpectedConditions.elementToBeClickable(Cancel1));
		common.ClickElement(Cancel1);
	}
	public void ClickKiddoBandRemoved() {
		wait.until(ExpectedConditions.elementToBeClickable(KiddoBandRemoved));
		common.ClickElement(KiddoBandRemoved);
	}
	public void ClickVisitOurSupport() {
		wait.until(ExpectedConditions.elementToBeClickable(VisitOurSupport));
		common.ClickElement(VisitOurSupport);
	}	
	public void ClickBack() {
		wait.until(ExpectedConditions.elementToBeClickable(BackButton));
		common.ClickElement(BackButton);
	}
	public void ClickTurnOnBlueTooth() {
		wait.until(ExpectedConditions.elementToBeClickable(TurnOnBlueTooth));
		common.ClickElement(TurnOnBlueTooth);
	}
	public void ClickStartFromBeginning() {
		wait.until(ExpectedConditions.elementToBeClickable(StartFromBeginning));
		common.ClickElement(StartFromBeginning);
	}
	public void ClicDone() {
		wait.until(ExpectedConditions.elementToBeClickable(Done));
		common.ClickElement(Done);
	}
	public void EnterInvalidZipCode() {
		wait.until(ExpectedConditions.elementToBeClickable(ZipCode));
		common.SendText(ZipCode, TestData.InvalidZipCode);
	}
	public void ClickOkay() {
		wait.until(ExpectedConditions.elementToBeClickable(Okay));
		common.ClickElement(Okay);
	}
	public void EnterInvalidChildName() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildName));
		common.SendText(ChildName, TestData.InvalidChildName);

	}
	public void EnterOtherInput() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherInput));
		common.SendText(OtherInput, TestData.MedicalCondition);
	}
	public void EnterOtherInputAlergies() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherInputAllergies));
		common.SendText(OtherInputAllergies, TestData.Allergies);
	}

	public void ClickSignOut() {
		wait.until(ExpectedConditions.elementToBeClickable(Signout));
		common.ClickElement(Signout);
	}

	public void GetOkay() {
		wait.until(ExpectedConditions.visibilityOf(Okay));
		getOkayPopUp = Okay.getText();
		Assert.assertEquals(getOkayPopUp, TestData.Okay1);
	}

	public void ClickGoToDashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(GoToDashboard));
		common.ClickElement(GoToDashboard);
	}
	public void ClickOtherOptionAllergies() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherOptionAllergies));
		common.ClickElement(OtherOptionAllergies);
	}
	public void ClickPairKiddoBand() {
		wait.until(ExpectedConditions.elementToBeClickable(PairKiddoBand));
		common.ClickElement(PairKiddoBand);
	}
	public void ClickOtherOption() {
		wait.until(ExpectedConditions.elementToBeClickable(OtherOption));
		common.ClickElement(OtherOption);
	}
	public void GetMedicalInsightsPage() {
		wait.until(ExpectedConditions.visibilityOf(MedicalInsightsPage));
		getMedicalInsightsPage = MedicalInsightsPage.getAttribute("name");
		Assert.assertEquals(getMedicalInsightsPage, TestData.MedicalInsights);
	}

	public void GetImageUploadPage() {
		wait.until(ExpectedConditions.visibilityOf(ImageUploadPage));
		getImageUploadPage = ImageUploadPage.getAttribute("name");
		Assert.assertEquals(getImageUploadPage, "Personalize your Kiddo appLbl");
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
		Assert.assertEquals(getLoginName, "currentHealthReport");
	}
	
	public void VerifyEnteredOther() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildMedical));
		getMedicalCon = ChildMedical.getText();
		Assert.assertEquals(getMedicalCon, TestData.MedicalCondition);
	}
	public void SelectChooseAnAvatar() {
		wait.until(ExpectedConditions.elementToBeClickable(ChooseAnAvatar));
		common.ClickElement(ChooseAnAvatar);
	}
	public void VerifyEnteredOtherAllergies() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildAllergy));
		getAllergies = ChildAllergy.getText();
		Assert.assertEquals(getAllergies, TestData.Allergies);
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
		getDetailsPage = ChildDetailsPage.getAttribute("name");
		Assert.assertEquals(getDetailsPage,TestData.ChildDetails);
	}
	public void ClickChildGender() throws InterruptedException {
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
	public void ClickChildAllergy() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildAllergy));
		common.ClickElement(ChildAllergy);
	}
	public void GetHome() {
		wait.until(ExpectedConditions.elementToBeClickable(Home));
		getHome = Home.getAttribute("name");
		Assert.assertEquals(getHome, "Log in");
	}
	public void ClickCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateAccount));
		common.ClickElement(CreateAccount);
	}
	public void ClickContinueWithGoogle() {
		wait.until(ExpectedConditions.elementToBeClickable(ContinueWithGoogle));
		common.ClickElement(ContinueWithGoogle);
	}

	public void ClickSelectAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(SelectAccount));
		common.ClickElement(SelectAccount);
	}
	public void GetKiddoReady() {
		wait.until(ExpectedConditions.elementToBeClickable(KiddoReady));
//		getReady = KiddoReady.getText();
//		Assert.assertEquals(getReady, "Before adding your kids");
	}
	public void ClickYes() {
		wait.until(ExpectedConditions.elementToBeClickable(Yes));
		common.ClickElement(Yes);
	}
	public void GetParentName() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> ldriver = driver
				.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Name\"]"));
		if (ldriver.size() == 1) {

			wait.until(ExpectedConditions.elementToBeClickable(ParentName));
			getParentName = ParentName.getText();
			Assert.assertEquals(getParentName, TestData.Parent_Name);
		} else {
			wait.until(ExpectedConditions.elementToBeClickable(GoToDashboard));
			common.ClickElement(GoToDashboard);
			Thread.sleep(5000);
			ClickCreateAccount();
			ClickContinueWithGoogle();
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
		System.out.println(getCreateParentEmail);
		Assert.assertEquals(getCreateParentEmail, TestData.Email);
	}
	public void EnterParentZipCode() {
		wait.until(ExpectedConditions.elementToBeClickable(ZipCode));
		ZipCode.clear();
		common.SendText(ZipCode, TestData.ZipCode);
	}
	public void ClickConfirmContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmContinue));
		common.ClickElement(ConfirmContinue);
	}
	public void GetAddKidPage() {
		wait.until(ExpectedConditions.elementToBeClickable(AddKidPage));
		getAddKidPage = AddKidPage.getAttribute("name");
		Assert.assertEquals(getAddKidPage, "Now let’s add your kid");
	}
	public void EnterChildName() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ChildName));
		ChildName.clear();
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
	public void ClickApply() {
		wait.until(ExpectedConditions.elementToBeClickable(Apply));
		common.ClickElement(Apply);
	}
	public void ClickNext() {
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
	}
	public void ClickNextWhoWear() {
		
		getWhoWear();
		
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
		

		
	}
	public void getWhoWear() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildName));
		getChildName = ChildName.getText();
		getChildRelation = ChildRelation.getText();	
		System.out.println(getChildName);
		System.out.println(getChildRelation);
	}	
	public void ClickNextChildDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildGender));
		getGender = ChildGender.getText();
		getDOB = ChildDateOfBirth.getText();
		getWeight =  ChildWeight.getText();
		getHeight = ChildHeight.getText();
		
		System.out.println(getGender);
		System.out.println(getDOB);
		System.out.println(getWeight);
		System.out.println(getHeight);

		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
		
		
		
	}
	public void ClickNextMedicalInsights() {

		wait.until(ExpectedConditions.elementToBeClickable(ChildMedical));
		getMedicalCon = ChildMedical.getText();
		getAllergies = ChildAllergy.getText();
		wait.until(ExpectedConditions.elementToBeClickable(Next));
		common.ClickElement(Next);
	}	
	
	
	
	
}
