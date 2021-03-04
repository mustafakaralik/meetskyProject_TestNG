package com.meetsky.tests.deneme;

import com.meetsky.pages.Dashboard;
import com.meetsky.tests.TestBase;
import org.testng.annotations.Test;

public class talktest extends TestBase {

    @Test
    public void test1(){
        extentLogger= report.createTest("talk");
        extentLogger.info("preconditions");
        extentLogger.info("navigate to talk Module");
        Dashboard dashboard= new Dashboard();
        dashboard.navigateToModule("talk");
        extentLogger.pass("passed");


    }
}
