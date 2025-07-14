package com.api.Listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener {

    public static final Logger logger = LogManager.getLogger(TestListners.class);


    public void onTestStart(ITestResult result) {

       logger.info("Started !!! "+ result.getMethod().getMethodName());
        logger.info("Description "+result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        logger.info("Passed!!"+ result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
     logger.error("failed !!!! "+result.getMethod().getMethodName());
    }
    public void onTestSkipped(ITestResult result) {
        logger.info("Test Skilled !!!"+result.getMethod().getMethodName());
    }
    public void onStart(ITestContext context) {
            logger.info("The test Suite has Started !!");    }

    public void onFinish(ITestContext context) {
        logger.info("The Suite execution is completed");
    }

}
