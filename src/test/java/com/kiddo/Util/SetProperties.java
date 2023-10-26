package com.kiddo.Util;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import java.io.File;

public class SetProperties {

	// Create reference of ReadProperties class.

	public static ReadProperties appConfig;

	public SetProperties() {
		try {
			appConfig = new ReadProperties();

			/**
			 * Read Input's from AppConfig Properties file
			 */

			appConfig.readFile(new File(
					System.getProperty("user.dir") + "/src/test/resources/PropertyFiles/appConfig.properties"));

//			appConfig.readFile(new File("/Amazon_Test/src/test/resources/PropertyFiles/appConfig.properties"));

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}