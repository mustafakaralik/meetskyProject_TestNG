package com.meetsky.tests.deneme;

import com.meetsky.pages.Dashboard;
import com.meetsky.tests.TestBase;
import org.testng.annotations.Test;

public class clickTalkModule extends TestBase {
    @Test
    public void clickTestTalk(){
        extentLogger = report.createTest("Verify Talk Module Selected");
        extentLogger.info("Precondition Loaded Successfully");
        Dashboard dashboard = new Dashboard();
        extentLogger.info("Navigate to Talk Module");
        dashboard.navigateToModule("Talk");
        extentLogger.pass("Passed");
    }
    @Test
    public void clickTestNotes(){
        extentLogger = report.createTest("Verify Talk Module Selected");
        extentLogger.info("Precondition Loaded Successfully");
        Dashboard dashboard = new Dashboard();
        extentLogger.info("Navigate to Talk Module");
        dashboard.navigateToModule("note");
        extentLogger.pass("Passed");
    }
}
