package com.kiddo.PageObjects;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
//import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

//import com.google.zxing.BinaryBitmap;
//import com.google.zxing.LuminanceSource;
//import com.google.zxing.MultiFormatReader;
//import com.google.zxing.NotFoundException;
//import com.google.zxing.Result;
//import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
//import com.google.zxing.common.HybridBinarizer;

import com.kiddo.Driver.DesiredCapability;

//import Utils.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class commonMethodFunctions extends DesiredCapability {

	private Dimension screenSize;
	private static final AndroidDriver DRIVER = null;
	public static String ADB;
	public static String JAVA_HOME;

	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomAlphaNumeric(int count) {
		final String token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder builder = new StringBuilder();
		builder.append("Customer");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomSupplierAlphaNumeric(int count) {
		final String token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder builder = new StringBuilder();
		builder.append("Supplier");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomSpecialCharacter(int count) {
		final String token = "@#$%^&*()_+/-:;!?";
		StringBuilder builder = new StringBuilder();
		builder.append("Customer");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomSupplierSpecialCharacter(int count) {
		final String token = "@#$%^&*()_+/-:;!?";
		StringBuilder builder = new StringBuilder();
		builder.append("Supplier");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomName(int count) {
		final String token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	/**
	 *
	 * @param count
	 * @return
	 */
	public String randomNumber(int count) {
		final String token = "6789";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}


	public int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}


	/**
	 *
	 * @param text
	 * @param driver
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void scrollToText(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
		MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("new UiScrollable("
						+ "new UiSelector().scrollable(true)).scrollIntoView("
						+ "new UiSelector().textContains(\""+text+"\"));");
	}

	/**
	 *
	 * @param text
	 * @param driver
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void scrollToTextWithClick(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
		MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("new UiScrollable("
						+ "new UiSelector().scrollable(true)).scrollIntoView("
						+ "new UiSelector().textContains(\""+text+"\"));");
		el.click();
	}

	public void scrollToExactTextWithClick(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
		MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
				.findElementByAndroidUIAutomator("new UiScrollable("
						+ "new UiSelector().scrollable(true)).scrollIntoView("
						+ "new UiSelector().text(\""+text+"\"));");
		el.click();
	}


	public void swipeVertical (double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		getTouchAction().press(point(anchor, startPoint))
				.waitAction(waitOptions(ofMillis(duration)))
				.moveTo(point(anchor, endPoint)).release().perform();
	}
	public static TouchAction getTouchAction () {

		return new TouchAction(driver);
	}

	@SuppressWarnings("rawtypes")
	public static void topBottomScroll(AppiumDriver<MobileElement> driver, double startYprc, double endYprc) {

		System.out.println("Scroll Top to bottom...");
		Dimension size = driver.manage().window().getSize();
	    int startX = size.width / 2;
	    int startY = (int) (size.height * startYprc);
	    int endY = (int) (size.height * endYprc);
	    
	    System.out.println("Scroll: "+startX+", "+startY+", "+endY+" and Size: "+size);
	    new TouchAction(driver).press(point(startX, startY))
		.waitAction(waitOptions(ofMillis(2000))).moveTo(point(startX, endY))
		.release().perform();
	   	System.out.println("Page Scrolled...");
	   	
	}

	public static void scroll(AppiumDriver<MobileElement> driver, double startYprc, double endYprc) {

		System.out.println("Scroll Top to bottom...");
		Dimension size = driver.manage().window().getSize();
		int startX = size.width / 2;
		int startY = (int) (size.height * startYprc);
		int endY = (int) (size.height * endYprc);

		System.out.println("Scroll: "+startX+", "+startY+", "+endY+" and Size: "+size);
		new TouchAction(driver).press(point(startX, startY)).moveTo(point(startX, endY)).release().perform();
		System.out.println("Page Scrolled...");

	}

	/**
	 *
	 * @param element
	 * @throws InterruptedException
	 */
	public void clickAction(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(element).click();
		builder.perform();
	}

	public static boolean elementIsDisplayed(WebElement element, AppiumDriver<MobileElement> driver) {
		try {
			boolean isDisplayed = driver.findElement((By) element).isDisplayed();
			return isDisplayed;
		} catch (Exception var2) {
			return false;
		}
	}

	public int GetCurrentDate() {

		LocalDate now = LocalDate.now();
//	    System.out.println(now.getDayOfMonth());
		int date = now.getDayOfMonth();
		return date;
	}
	public static String CurrentDateWithTime() {
		Date objDate = new Date();
		String strDateFormat = "dd MMM yyyy hh:mm a";
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		return objSDF.format(objDate);
	}
	public static String CurrentMonthYear() {
		Date objDate = new Date();
		String strDateFormat = " MMM yyyy";
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		return objSDF.format(objDate);
	}
	public static String CurrentDate() {
		Date objDate = new Date();
		String strDateFormat = "dd MMM yyyy";
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		return objSDF.format(objDate);
	}
	public String runCommand(String command) throws InterruptedException, IOException {

		Process p = Runtime.getRuntime().exec(command);
		// get std output
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";
		String allLine = "";
		int i = 1;
		while ((line = r.readLine()) != null) {
			allLine = allLine + "" + line + "\n";
			if(line.contains("Console LogLevel: debug") && line.contains("Complete")) {
				break;
			}
			i++;
		}
		return allLine;
	}
	/*
	 * Swipe right to left
	 */
	public static void swipeHorizontal(AppiumDriver<MobileElement> driver2, double startPercentage,
									   double finalPercentage, double anchorPercentage) {

		System.out.println("Call swipe left...");
		Dimension size = driver2.manage().window().getSize();
		int anchor = (int) (size.height * anchorPercentage);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * finalPercentage);

		System.out.println("Swipe: " + anchor + ", " + startPoint + ", " + endPoint + " and Size: " + size);
		// new TouchAction(driver).press(950, 700).waitAction().moveTo(100,
		// 700).release().perform();
		System.out.println("Element Swiped...");
	}

	public static void pulltorefresh(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);

	}
	@SuppressWarnings("rawtypes")
	public static void pulltorefresh_by_coardinates() {
		new TouchAction(driver)
				.press(point(621, 618))
				.waitAction()
				.moveTo(point(576, 1939))
				.release().perform();

//		(new TouchAction(driver))
//		  .press({x: 621, y: 618})
//		  .moveTo({x: 576: y: 1939})
//		  .release()
//		  .perform()

	}
	public void leftRightSwipe() {

		Dimension size = driver.manage().window().getSize();
		System.out.println(size.height+"height");
		System.out.println(size.width+"width");
		System.out.println(size);
		int startPoint = (int) (size.width * 0.99);
		int endPoint = (int) (size.width * 0.15);
		int ScreenPlace =(int) (size.height*0.40);
		int y=(int)size.height*20;

		TouchAction ts = new TouchAction(driver);
		//for(int i=0;i<=3;i++) {
		ts.press(point(startPoint,ScreenPlace ))
				.waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(endPoint,ScreenPlace )).release().perform();

	}
	public void rightLeftSwipe() {

		Dimension size = driver.manage().window().getSize();
		System.out.println(size.height+"height");
		System.out.println(size.width+"width");
		System.out.println(size);
		int startPoint = (int) (size.width * 0.99);
		int endPoint = (int) (size.width * 0.15);
		int ScreenPlace =(int) (size.height*0.40);
		int y=(int)size.height*20;

		TouchAction ts = new TouchAction(driver);
		//for(int i=0;i<=3;i++) {
		ts.press(point(endPoint,ScreenPlace ))
				.waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(startPoint,ScreenPlace )).release().perform();

	}

	public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.height * anchorPercentage);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * endPercentage);
		new TouchAction(driver)
				.press(point(startPoint, anchor))
				.waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(endPoint, anchor))
				.release().perform();
	}

	public void swipeJS(MobileElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "left");
		params.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: swipe", params);
	}

	public static boolean IsDispayed(WebElement webelement)
	{
		try {
			webelement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void showNotifications() {
		manageNotifications(true);
	}

	public void hideNotifications() {
		manageNotifications(false);
	}

	private void manageNotifications(Boolean show) {

		screenSize = driver.manage().window().getSize();

		int yMargin = 5;
		int xMid = screenSize.width / 2;

		PointOption top = point(xMid, yMargin);
		PointOption bottom = point(xMid, screenSize.height - yMargin);

		TouchAction action = new TouchAction(driver);
		if (show) {
			action.press(top);
		} else {
			action.press(bottom);
		}
		action.waitAction(waitOptions(Duration.ofSeconds(1)));
		if (show) {
			action.moveTo(bottom);
		} else {
			action.moveTo(top);
		}
		action.perform();
	}
//	public void readQRCode() {
//		MobileElement qrCodeElement = driver.findElement(By.id("com.example.qrcode:id/imageView"));
//		File screenshot = driver.getScreenshotAs(OutputType.FILE);
//
//		String content = decodeQRCode(generateImage(qrCodeElement, screenshot));
////		assertThat(content).isEqualTo("f3ce8d4d-074f-483f-9fd0-45c7947fd40c");
//	}

	/**
	 * Return a cropped image based on an element (in this case the qrcode image) from the entire device screenshot
	 *
	 * @param element    elemement that will show in the screenshot
	 * @param screenshot the entire device screenshot
	 * @return a new image in BufferedImage object
	 */

	public static String getDeviceDetails(String cmd) throws java.io.IOException {

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(ADB + cmd);
		java.io.InputStream is = pr.getInputStream();
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
		String value = "";
		if (s.hasNext()) {
			value = s.next();
		}
		else {
			value = "";
		}
		return value;
	}


}

