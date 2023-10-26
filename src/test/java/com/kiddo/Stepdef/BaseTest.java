package com.kiddo.Stepdef;
/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import java.io.IOException;
import java.util.Set;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.logging.LogEntries;

import com.kiddo.Driver.DesiredCapability;

import io.cucumber.java.Before;

public class BaseTest extends DesiredCapability {

	private static boolean runOnlyOnce = true;

	@Before(order = 0)
	public void beforeHookfunction() throws InterruptedException, IOException {

		SetDesiredCapabilities();

	}

	@After
	public void after() {
		if (driver == null) {
			driver.quit();
			driver = null;
			driver.getSessionId();
			}
	}

}