package com.kiddo.Pages.iOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.kiddo.Driver.DesiredCapability;
import com.kiddo.PageObjects.CommonActionsConditions;
import com.kiddo.Driver.TestData;

public class AddChildPagesiOS extends DesiredCapability{
	
	CommonActionsConditions common = new CommonActionsConditions();
	CreateAccountPagesiOS Create = new CreateAccountPagesiOS();
	
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
	public static String getkiddoband;
	

	
	
	

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
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"ChildProfileImg ChildProfileLbl\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	
	public static WebElement Childprofile;
	
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"addChildBtn\"]")
	public static WebElement AddChilds;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NoLbl\"]")
	public static WebElement No;
		
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"QAGopinathBatteryLevelImg QAGopinathSyncDateLbl Add Kiddo Band QAGopinathProfileImg\"]")
	public static WebElement AddKiddoBand;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
	public static WebElement ChildName;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Got itLbl\"]")
	public static WebElement GotIt;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"KiddoSettingImg KiddoSettingLbl KiddoStatusLbl\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage")
	public static WebElement KiddoBandDropDown;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add New KiddoLbl\"]")
	public static WebElement AddNewKiddo;
	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PairingBandLbl-SubTitle\"]")
	public static WebElement BlueFlashLight;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The Kiddo band is pulsing blueLbl\"]")
	public static WebElement KiddoPulsingBlue;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes, it isBtn\"]")
	public static WebElement YesItIs;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Oops, it’s notBtn\"]")
	public static WebElement OopsNot;	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Band is back on the chargerLbl\"]")
	public static WebElement BackOnCharger;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Title\"]")
	public static WebElement SelectDevices;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"BackBtn\"]")
	public static WebElement PressBack ;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"walkthroughTitle\"]")
	public static WebElement BatteryLow;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NextLbl\"]")
	public static WebElement Next;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"walkthroughTitle\"]")
	public static WebElement KiddoBandCharge;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"walkthroughTitle\"]")
	public static WebElement ResetKiddoBand;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Reset and Pair KiddoLbl\"]")
	public static WebElement ResetKiddo;
	
	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"CancelBtn\"]")
	public static WebElement PopCancel;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Yes, ExitBtn\"]")
	public static WebElement ExitCancel;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"QAGopinath\"]")
	public static WebElement GivenChildName;
	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"QAKiddo\"]")
	public static WebElement GivenEditChildName;
	
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Male\"]")
	public static WebElement GivenGender;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"DateOfBirthTitleLbl DateOfBirthValueLbl\"])[2]")
	public static WebElement GivenDOB;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"9 kg\"]")
	public static WebElement GivenWeight;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"76 cm\"]")
	public static WebElement GivenHeight;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MedicalSectionTitle\"]")
	public static WebElement GivenMedicalAllergies;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Asthma\"]")
	public static WebElement GivenMedicalCont;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Dairy\"]")
	public static WebElement GivenAllergies;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Female\"]")
	private static WebElement Female;

	@FindBy(xpath = "//android.widget.SeekBar[@content-desc=\"February, Select Month\"]")
	public static WebElement SelectFeb;
	
	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"EditBtn\"])[2]")
	public static WebElement ChildEditIcon;
	
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"PopupInput\"]")
	public static WebElement ChildNameInput;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DoneLbl\"]")
	public static WebElement ChildDone;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save ChangesLbl\"]")
	public static WebElement SaveChildChanges;
	
	//XCUIElementTypeOther[@name="Yes, Remove QAKiddo"]
	

	public void clickSaveChildChanges(){
		wait.until(ExpectedConditions.visibilityOf(GivenEditChildName));
		getEditChildName = GivenEditChildName.getAttribute("name");
		getGender = Female.getAttribute("name");
		getDOB = GivenDOB.getAttribute("name");
		getWeight =  GivenWeight.getAttribute("name");
		getHeight = GivenHeight.getAttribute("name");
		System.out.println(getEditChildName);
		System.out.println(getGender);
		System.out.println(getkiddoband);
		System.out.println(getkiddoband);
		System.out.println(getkiddoband);
		System.out.println(getkiddoband);

		wait.until(ExpectedConditions.visibilityOf(SaveChildChanges));
		common.ClickElement(SaveChildChanges);		
		
	}
	public void verifyEditChildPages() {
		
		wait.until(ExpectedConditions.visibilityOf(GivenEditChildName));
		getEditedChildName = GivenEditChildName.getAttribute("name");
		getEditedGender = Female.getAttribute("name");
		getEditedDOB = GivenDOB.getAttribute("name");
		getEditedWeight = GivenWeight.getAttribute("name");
		getEditedHeight = GivenHeight.getAttribute("name");
		common.assertEquals(getEditedChildName,getEditChildName );
		common.assertEquals(getEditedGender,getGender );	
		common.assertEquals(getEditedDOB,getDOB );
		common.assertEquals(getEditedWeight,getWeight );
		common.assertEquals(getEditedHeight,getHeight );
		
	}
	public void clickEditChildIcon() {
		wait.until(ExpectedConditions.visibilityOf(ChildEditIcon));
		common.ClickElement(ChildEditIcon);
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
		common.SendText(ChildNameInput,TestData.EditChildName);
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
		wait.until(ExpectedConditions.visibilityOf(ExitCancel));
		common.ClickElement(ExitCancel);
	}
	public void clickPressBack() {
		wait.until(ExpectedConditions.visibilityOf(PressBack));
		common.ClickElement(PressBack);
	}
	public void clickOopsNot() {
		wait.until(ExpectedConditions.visibilityOf(OopsNot));
		common.ClickElement(OopsNot);
	}
	public void getSelectDevices() {
		wait.until(ExpectedConditions.visibilityOf(SelectDevices));
//		getSelectDevices = SelectDevices.getText();
//		common.assertEquals(getSelectDevices, TestData.SelectDevices);
	}
	
	public void clickBackOnCharger() {
		wait.until(ExpectedConditions.visibilityOf(BackOnCharger));
		common.ClickElement(BackOnCharger);
	} 
	public void enterChildName() {
		wait.until(ExpectedConditions.visibilityOf(ChildName));
		common.ClickElement(ChildName);
		common.SendText(ChildName,"QAGopinath");
	}
	public void clickAddChild(){
		wait.until(ExpectedConditions.visibilityOf(AddChilds));
		common.ClickElement(AddChilds);
	}

	public void clickNo(){

		wait.until(ExpectedConditions.visibilityOf(No));
		common.ClickElement(No);
	}
	
	public void clickGotIt(){

		wait.until(ExpectedConditions.visibilityOf(GotIt));
		common.ClickElement(GotIt);
	}
	public void clickAddKiddoBand() {

		wait.until(ExpectedConditions.visibilityOf(AddKiddoBand));
		getkiddoband = AddKiddoBand.getText();
		System.out.println(getkiddoband);
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
	public void clickChildprofile(){
	
		wait.until(ExpectedConditions.visibilityOf(Childprofile));
		common.ClickElement(Childprofile);
	}
	
	public void validAddedChild()  {
		wait.until(ExpectedConditions.visibilityOf(GivenChildName));
		getAddedChild = GivenChildName.getAttribute("name");
		common.assertEquals(CreateAccountPagesiOS.getChildName,getAddedChild);
	}
	public void validDOB() {
		wait.until(ExpectedConditions.visibilityOf(GivenDOB));
//		getGivenDOB = GivenDOB.getText();
//		common.assertEquals(CreateAccountPagesiOS.getDOB,getGivenDOB );
	}
	
	public void validWeight(){
		wait.until(ExpectedConditions.visibilityOf(GivenWeight));
		getGivenWeight= GivenWeight.getAttribute("name");
		common.assertEquals(CreateAccountPagesiOS.getWeight,getGivenWeight );
	}
	public void validHeight(){
		wait.until(ExpectedConditions.visibilityOf(GivenHeight));
		getGivenHeight = GivenHeight.getAttribute("name");
		common.assertEquals(CreateAccountPagesiOS.getHeight,getGivenHeight );
	}
	public void validGender(){
		wait.until(ExpectedConditions.visibilityOf(GivenGender));
		getGivenGender = GivenGender.getAttribute("name");
		common.assertEquals(CreateAccountPagesiOS.getGender,getGivenGender );
	}
	public void clickGivenMedicalAllergies(){
		wait.until(ExpectedConditions.visibilityOf(GivenMedicalAllergies));
		common.ClickElement(GivenMedicalAllergies);
	}
	public void validMedicalInfo() {
		wait.until(ExpectedConditions.visibilityOf(GivenMedicalCont));
		getGivenMedicalInfo = GivenMedicalCont.getText();
		common.assertEquals(CreateAccountPagesiOS.getMedicalCon,getGivenMedicalInfo );
	}
	public void validAllergies() {
		wait.until(ExpectedConditions.visibilityOf(GivenMedicalCont));
		getGivenAllergies = GivenGender.getText();
		common.assertEquals(CreateAccountPagesiOS.getAllergies,getGivenAllergies );
	}	
}
