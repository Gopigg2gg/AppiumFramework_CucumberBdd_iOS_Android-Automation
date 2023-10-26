package com.kiddo.Driver;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import org.junit.runner.RunWith;

import com.kiddo.Stepdef.BaseTest;
import com.kiddo.Util.Log;

import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import java.text.SimpleDateFormat;
import java.util.Date;


@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},

        features = {"src/test/resources/Features/TS_01_CreateAccount.feature"},
        glue = "com.kiddo.Stepdef", stepNotifications = true, monochrome =true

)
public class TestRunner extends BaseTest{
    @BeforeClass
    public static void setup() {
        Log.startLog("Test Starts from Here");
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        Log.info(timeStamp);
    }

    @AfterClass
    public static void writeExtentReport() {
        Log.endLog("Test Ends Here");
    }

}