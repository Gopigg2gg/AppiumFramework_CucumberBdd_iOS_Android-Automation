package com.kiddo.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kiddo.Driver.DesiredCapability;
import com.kiddo.PageObjects.CommonActionsConditions;
import com.kiddo.Driver.TestData;
import com.kiddo.Pages.CreateAccountPages;

public class AddChildPages extends DesiredCapability {

	CommonActionsConditions common = new CommonActionsConditions();
	CreateAccountPages Create = new CreateAccountPages();

	public static String getBlueFlashLight;
	public static String getSelectDevices;
	public static String getResetKiddoBand;
	public static String getKiddoBandCharge;
	public static String getBatteryLow;
	public static String getGivenGender;
	public static String getGivenDOB;
	public static String getGivenWeight;
	public static String getGivenHeight;
	public static String getAddedChild;
	public static String getGivenMedicalInfo;
	public static String getGivenAllergies;
	public static String getEditChildName;
	public static String getGender;
	public static String getChildRelation;
	public static String getDOB;
	public static String getHeight;
	public static String getWeight;
	public static String getEditedGender;
	public static String getEditedChildName;
	public static String getEditedDOB;
	public static String getEditedWeight;
	public static String getEditedHeight;
	public static String getMedicalCondition;
	public static String getAllergies;
	public static String getMedical;
	public static String getEditedMedical;
	public static String getDeleteChildPOP;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildName\"]")
	private static WebElement getChildName;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildGender\"]")
	private static WebElement ChildGender;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Male\"]")
	private static WebElement Male;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildDOB\"]")
	private static WebElement ChildDateOfBirth;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildWeight\"]")
	private static WebElement ChildWeight;

	@FindBy(xpath = "//android.widget.EditText[@content-desc=\"ChildHeight\"]")
	private static WebElement ChildHeight;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"ChildProfileLbl\"]")
	public static WebElement Childprofile;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Add Kids\"]")
	public static WebElement AddChilds;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add Child']")
	public static WebElement AddChild;

	@FindBy(xpath = "//android.widget.TextView[@text='No']")
	public static WebElement No;

	@FindBy(xpath = "//android.widget.TextView[@text='Add Kiddo Band']")
	public static WebElement AddKiddoBand;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	public static WebElement ChildName;

	@FindBy(xpath = "//android.widget.TextView[@text='Got it']")
	public static WebElement GotIt;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ImageView[2]")
	public static WebElement KiddoBandDropDown;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Add New KiddoLbl\"]")
	public static WebElement AddNewKiddo;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"PairingBandLbl-SubTitle\"]")
	public static WebElement BlueFlashLight;

	@FindBy(xpath = "//android.widget.TextView[@text='Kiddo Band is pulsing green and blue']")
	public static WebElement KiddoPulsingBlue;

	@FindBy(xpath = "//android.widget.TextView[@text='Yes, it is']")
	public static WebElement YesItIs;

	@FindBy(xpath = "//android.widget.TextView[@text='Oops, it’s not']")
	public static WebElement OopsNot;

	@FindBy(xpath = "//android.widget.TextView[@text='The Kiddo Band is back on charger']")
	public static WebElement BackOnCharger;

	@FindBy(xpath = "//android.widget.TextView[@text='Now select the device you want to pair']")
	public static WebElement SelectDevices;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"BackBtn\"]")
	public static WebElement PressBack;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"The battery seems to be low\"]")
	public static WebElement BatteryLow;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"NextLbl\"]")
	public static WebElement Next;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"NotPulsatingBtn\"]")
	public static WebElement NotPulsingBlue;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Let the Kiddo band charge for at least 30 minutes\"]")
	public static WebElement KiddoBandCharge;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"If the connection problem persists, please try to reset the Kiddo band\"]")
	public static WebElement ResetKiddoBand;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Reset and Pair KiddoLbl\"]")
	public static WebElement ResetKiddo;

	@FindBy(xpath = " //android.view.ViewGroup[@content-desc=\"PopupButtonCancel\"]/android.view.ViewGroup/android.widget.TextView")
	public static WebElement PopCancel;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"PopupButtonYes, Exit\"]/android.view.ViewGroup/android.widget.TextView")
	public static WebElement YesExit;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[1]")
	public static WebElement GivenChildName;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[2]")
	public static WebElement GivenGender;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[3]")
	public static WebElement GivenDOB;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[4]")
	public static WebElement GivenWeight;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[5]")
	public static WebElement GivenHeight;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[6]")
	public static WebElement GivenMedicalCont;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
	public static WebElement GivenChildName1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[1]")
	public static WebElement GivenGender1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[3]")
	public static WebElement GivenDOB1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[2]")
	public static WebElement GivenWeight1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[4]")
	public static WebElement GivenHeight1;

	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[5]")
	public static WebElement GivenMedicalCont1;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Female']")
	private static WebElement Female;

	@FindBy(xpath = "//android.widget.SeekBar[@content-desc=\"February, Select Month\"]")
	public static WebElement SelectFeb;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"EditBtn\"]")
	public static WebElement ChildEditIcon;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
	public static WebElement ChildNameInput;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"DoneLbl\"]")
	public static WebElement ChildDone;

	@FindBy(xpath = "//android.widget.TextView[@text='Save']")
	public static WebElement SaveChildChanges;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"DeleteAccountLbl\"]")
	public static WebElement DeleteAccount;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Cancel, keep accountLbl\"]")
	public static WebElement CancelAccount;

	@FindBy(xpath = "//android.widget.TextView[@text='Yes, delete']")
	public static WebElement YesDeleteChildAccount;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Are you sure to delete QAKiddo's profile?']")
	public static WebElement DeleteChildPOP;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	public static WebElement YesRemove;

	@FindBy(xpath = "//android.widget.TextView[@text='Okay']")
	public static WebElement DeleteOkay;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"ReminderViewLbl\"]")
	public static WebElement KiddoBandRemoved;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"AllergyValueLbl\"]")
	public static WebElement GetAllery;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"MedicalConditionValueLbl\"]")
	public static WebElement GetMedicalCondition;
	
	@FindBy(xpath = "(//android.widget.TextView[@content-desc=\"TitleLbl\"])[6]")
	public static WebElement GetMedicalCondition1;
	
	@FindBy(xpath = "//android.widget.TextView[@text='QAGopinath']")
	public static WebElement ClickChild;
	
	@FindBy(xpath = "//android.widget.TextView[@text='QAKiddo']")
	public static WebElement ClickChild1;
	
	@FindBy(xpath = "//android.widget.TextView[@text = 'Autism']")
	public static WebElement ClickAutism;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
	public static WebElement ClickCancel;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Save']")
	public static WebElement ClickSave;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	public static WebElement ClickAddChildDashboard;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add Kids']")
	public static WebElement ClickAddChild;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Delete Child Profile']")
	public static WebElement DeleteChildProfile;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")
	public static WebElement PlusIcon;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add Kids']")
	public static WebElement AddKids;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add Kiddo']")
	public static WebElement AddKiddo;
	
	
	public void clickAddKiddo() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(AddKiddo));
		common.ClickElement(AddKiddo);
	}
	
	public void clickPlusIcon() {
		wait.until(ExpectedConditions.visibilityOf(PlusIcon));
		common.ClickElement(PlusIcon);
	}
	
	public void clickAddKids() {
		wait.until(ExpectedConditions.visibilityOf(AddKids));
		common.ClickElement(AddKids);
	}
	
	public void clickAddedChild() {
		wait.until(ExpectedConditions.visibilityOf(ClickChild));
		common.ClickElement(ClickChild);
	}
	public void clickAddedChild1() {
		wait.until(ExpectedConditions.visibilityOf(ClickChild1));
		common.ClickElement(ClickChild1);
	}
	
	

	public void clickSaveChildChanges() {
		wait.until(ExpectedConditions.visibilityOf(GivenChildName1));
		getEditChildName = GivenChildName1.getText();
		getGender = GivenGender1.getText();
		getDOB = GivenDOB1.getText();
		getWeight = GivenWeight1.getText();
		getHeight = GivenHeight1.getText();
		getMedical = GivenHeight1.getText();
		
		System.out.println(getEditChildName);
		System.out.println(getGender);
		System.out.println(getDOB);
		System.out.println(getWeight);
		System.out.println(getHeight);
		System.out.println(getMedical);

		wait.until(ExpectedConditions.visibilityOf(SaveChildChanges));
		common.ClickElement(SaveChildChanges);
	}

	public void verifyEditChildPages() {
		wait.until(ExpectedConditions.visibilityOf(GivenChildName));
		getEditedChildName = GivenChildName.getText();
		getEditedWeight = GivenWeight.getText();
		getEditedDOB = GivenDOB.getText();
		getEditedGender = GivenGender.getText();
		getEditedHeight = GivenHeight.getText();
		getEditedMedical = GivenHeight.getText();
		
		System.out.println(getEditedChildName);
		System.out.println(getEditedWeight);
		System.out.println(getEditedDOB);
		System.out.println(getEditedGender);
		System.out.println(getEditedHeight);
		System.out.println(getEditedMedical);

		common.assertEquals(getEditedChildName, getEditChildName);
		common.assertEquals(getEditedGender, getGender);
		common.assertEquals(getEditedDOB, getDOB);
		common.assertEquals(getEditedWeight, getWeight);
		common.assertEquals(getEditedHeight, getHeight);
		common.assertEquals(getEditedHeight, getHeight);
	}

	public void clickEditChildIcon() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(ChildEditIcon));
		common.ClickElement(ChildEditIcon);
	}

	public void clickNotPulsingBlue() {
		wait.until(ExpectedConditions.visibilityOf(NotPulsingBlue));
		common.ClickElement(NotPulsingBlue);
	} 
	
	public void clickSelectFeb() {
		wait.until(ExpectedConditions.visibilityOf(SelectFeb));
		common.ClickElement(SelectFeb);
	}

	public void clickEditGenderFemale() {
		wait.until(ExpectedConditions.visibilityOf(Female));
		common.ClickElement(Female);
	}

	public void clickGivenChildName() {
		wait.until(ExpectedConditions.visibilityOf(GivenChildName));
		common.ClickElement(GivenChildName);
	}

	public void enterEditChildName() {
		wait.until(ExpectedConditions.visibilityOf(ChildNameInput));
		ChildNameInput.clear();
		common.SendText(ChildNameInput, TestData.EditChildName);
	}

	public void clickChildDone() {
		wait.until(ExpectedConditions.visibilityOf(ChildDone));
		common.ClickElement(ChildDone);
	}

	public void clickGivenGender() {
		wait.until(ExpectedConditions.visibilityOf(GivenGender));
		common.ClickElement(GivenGender);
	}

	public void clickGivenDOB() {
		wait.until(ExpectedConditions.visibilityOf(GivenDOB));
		common.ClickElement(GivenDOB);
	}

	public void clickGivenWeight() {
		wait.until(ExpectedConditions.visibilityOf(GivenWeight));
		common.ClickElement(GivenWeight);
	}

	public void clickGivenHeight() {
		wait.until(ExpectedConditions.visibilityOf(GivenHeight));
		common.ClickElement(GivenHeight);
	}

	public void clickNext() {
		wait.until(ExpectedConditions.visibilityOf(Next));
		common.ClickElement(Next);
	}

	public void clickResetKiddo() {
		wait.until(ExpectedConditions.visibilityOf(ResetKiddo));
		common.ClickElement(ResetKiddo);
	}

	public void clickKiddoPulsingBlue() {
		wait.until(ExpectedConditions.visibilityOf(KiddoPulsingBlue));
		common.ClickElement(KiddoPulsingBlue);
	}

	public void clickYesItIs() {
		wait.until(ExpectedConditions.visibilityOf(YesItIs));
		common.ClickElement(YesItIs);
	}

	public void clickPopCancel() {
		wait.until(ExpectedConditions.visibilityOf(YesItIs));
		common.ClickElement(YesItIs);
	}

	public void clickExitCancel() {
		wait.until(ExpectedConditions.visibilityOf(YesExit));
		common.ClickElement(YesExit);
	}

	public void clickPressBack() {
		wait.until(ExpectedConditions.visibilityOf(PressBack));
		common.ClickElement(PressBack);
	}

	public void clickOopsNot() {
		wait.until(ExpectedConditions.visibilityOf(OopsNot));
		common.ClickElement(OopsNot);
	}

	public void clickBackOnCharger() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(BackOnCharger));
		common.ClickElement(BackOnCharger);
		Thread.sleep(20000);
	}

	public void enterChildName() {
		wait.until(ExpectedConditions.visibilityOf(ChildName));
		common.ClickElement(ChildName);
		wait.until(ExpectedConditions.visibilityOf(ChildName));
		common.SendText(ChildName, TestData.AddChildName);
	}
	public void clickAddChild() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(AddChild));
		common.ClickElement(AddChild);
	}
	public void clickAddChilds() throws InterruptedException {

		List<WebElement> ldriver = driver.findElements(By.xpath("//android.widget.TextView[@text='Add Kiddo Band']"));
		if (ldriver.size() == 1) {
			wait.until(ExpectedConditions.elementToBeClickable(AddKiddoBand));
			common.ClickElement(AddKiddoBand);
			clickChildprofile();
			wait.until(ExpectedConditions.elementToBeClickable(DeleteAccount));
			common.ClickElement(DeleteAccount);
			wait.until(ExpectedConditions.elementToBeClickable(CancelAccount));
			common.ClickElement(CancelAccount);
			wait.until(ExpectedConditions.elementToBeClickable(DeleteAccount));
			common.ClickElement(DeleteAccount);
			wait.until(ExpectedConditions.elementToBeClickable(YesDeleteChildAccount));
			common.ClickElement(YesDeleteChildAccount);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(YesRemove));
			common.ClickElement(YesRemove);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(DeleteOkay));
			common.ClickElement(DeleteOkay);
			wait.until(ExpectedConditions.elementToBeClickable(KiddoBandRemoved));
			common.ClickElement(KiddoBandRemoved);

		} else {

			wait.until(ExpectedConditions.visibilityOf(AddChilds));
			common.ClickElement(AddChilds);
		}
	}

	public void clickNo() {
		wait.until(ExpectedConditions.visibilityOf(No));
		common.ClickElement(No);
	}

	public void clickGotIt() {
		wait.until(ExpectedConditions.visibilityOf(GotIt));
		common.ClickElement(GotIt);
	}

	public void clickAddKiddoBand() {
		wait.until(ExpectedConditions.visibilityOf(AddKiddoBand));
		common.ClickElement(AddKiddoBand);
	}

	public void clickKiddoBandDropDown() {
		wait.until(ExpectedConditions.visibilityOf(KiddoBandDropDown));
		common.ClickElement(KiddoBandDropDown);
	}

	public void clickAddNewKiddo() {
		wait.until(ExpectedConditions.visibilityOf(AddNewKiddo));
		common.ClickElement(AddNewKiddo);
	}

	public void clickChildprofile() {
		wait.until(ExpectedConditions.visibilityOf(Childprofile));
		common.ClickElement(Childprofile);
	}

	public void validMedicalCondition() {
		getMedicalCondition = GetMedicalCondition1.getText();
		common.assertEquals(CreateAccountPages.getMedicalCon, getMedicalCondition);
	}

	public void validAllergy() {
		getAllergies = GetAllery.getText();
		common.assertEquals(CreateAccountPages.getAllergy, getAllergies);
	}

	public void validAddedChild() {
		getAddedChild = GivenChildName.getText();
		System.out.println(getAddedChild);
		common.assertEquals(CreateAccountPages.getChildName, getAddedChild);
	}

	public void validDOB() {
		getGivenDOB = GivenDOB.getText();
		
		common.assertEquals(CreateAccountPages.getDOB, getGivenDOB);
	}

	public void validWeight() {
		getGivenWeight = GivenWeight.getText();
		System.out.println(getGivenWeight);
		common.assertEquals(CreateAccountPages.getWeight, getGivenWeight);
	}

	public void validHeight() {
		getGivenHeight = GivenHeight.getText();
		System.out.println(getGivenHeight);
		common.assertEquals(CreateAccountPages.getHeight, getGivenHeight);
	}

	public void validGender() {
		getGivenGender = GivenGender.getText();
		System.out.println(getGivenGender);
		common.assertEquals(CreateAccountPages.getGender, getGivenGender);
	}

	public void validMedicalInfo() {
		getGivenMedicalInfo = GivenMedicalCont.getText();
		System.out.println(getGivenMedicalInfo);
		common.assertEquals(CreateAccountPages.getMedicalCon, getGivenMedicalInfo);
	}
	public void validAllergies() {
		getGivenAllergies = GivenGender.getText();
		common.assertEquals(CreateAccountPages.getAllergies, getGivenAllergies);
	}
	public void clickGivenChildName1() {
		wait.until(ExpectedConditions.visibilityOf(GivenChildName1));
		String GivenChildName2 = GivenChildName1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenChildName1);
	}
	public void clickGivenGender1() {
		wait.until(ExpectedConditions.visibilityOf(GivenGender1));
		String GivenChildName2 = GivenGender1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenGender1);
	}
	public void clickGivenDOB1() {
		wait.until(ExpectedConditions.visibilityOf(GivenDOB1));
		String GivenChildName2 = GivenDOB1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenDOB1);
	}
	public void clickGivenWeight1() {
		wait.until(ExpectedConditions.visibilityOf(GivenWeight1));
		String GivenChildName2 = GivenWeight1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenWeight1);
	}
	public void clickGivenHeight1() {
		wait.until(ExpectedConditions.visibilityOf(GivenHeight1));
		String GivenChildName2 = GivenHeight1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenHeight1);
	} 
	public void clickGivenMedical1() {
		wait.until(ExpectedConditions.visibilityOf(GivenMedicalCont1));
		String GivenChildName2 = GivenMedicalCont1.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(GivenMedicalCont1);
	}
	
	public void clickGivenAutism() {
		wait.until(ExpectedConditions.visibilityOf(ClickAutism));
		String GivenChildName2 = ClickAutism.getText();
		System.out.println(GivenChildName2);
		common.ClickElement(ClickAutism);
	}
	public void enterInvalidChildName() {
		wait.until(ExpectedConditions.elementToBeClickable(ChildNameInput));
		ChildNameInput.clear();
		common.SendText(ChildNameInput, TestData.InvalidChildName);
	}
	public void clickOkay() {
		wait.until(ExpectedConditions.visibilityOf(DeleteOkay));
		common.ClickElement(DeleteOkay);
	}
	public void clickSaveCancel() {
		wait.until(ExpectedConditions.visibilityOf(ClickCancel));
		common.ClickElement(ClickCancel);
	}
	public void clickSave() {
		wait.until(ExpectedConditions.visibilityOf(ClickSave));
		common.ClickElement(ClickSave);
	} 
	public void clickAddChildDashboard() {
		wait.until(ExpectedConditions.visibilityOf(ClickAddChildDashboard));
		common.ClickElement(ClickAddChildDashboard);
	}
	public void clickDeleteChild() {
		wait.until(ExpectedConditions.visibilityOf(ClickAddChildDashboard));
		common.ClickElement(ClickAddChildDashboard);
	}
	
	public void clickYesDelete() {
		wait.until(ExpectedConditions.visibilityOf(YesDeleteChildAccount));
		common.ClickElement(YesDeleteChildAccount);
	}
	public void checkDeletePOP() {
		wait.until(ExpectedConditions.visibilityOf(DeleteChildPOP));
		getDeleteChildPOP = DeleteChildPOP.getText();
		common.assertEquals(getDeleteChildPOP, TestData.DeletePOP);
	}
	
	public void ClickDeleteChildProfile() {
		wait.until(ExpectedConditions.visibilityOf(DeleteChildProfile));
		common.ClickElement(DeleteChildProfile);
	}
}
