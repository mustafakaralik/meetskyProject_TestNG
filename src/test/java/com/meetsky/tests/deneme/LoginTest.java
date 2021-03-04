package com.meetsky.tests.deneme;

import com.meetsky.pages.LoginPage;
import com.meetsky.tests.TestBase;
import com.meetsky.utilities.Driver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void loginTest(){
        extentLogger = report.createTest("MeetSky Login Test");
        extentLogger.info("Login as Employee");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsEmployee();
        extentLogger.pass("Passed");
    }
//    @Test
//    public void loginTest2(){
//        Driver.get().get("https://qa.meetsky.net/");
//    }

}
