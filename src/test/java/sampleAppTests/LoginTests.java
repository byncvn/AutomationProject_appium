package sampleAppTests;

import base.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.AndroidActions;

import java.sql.DriverManager;

public class LoginTests extends BaseTest {


    @Test(description = "Log in happy-path",
            dataProvider = "credentials")
    public void validLogin(String user, String Password) {
        loginPage.inputUsername(user);
        loginPage.inputPassword(Password);
        loginPage.tapLoginButton();
        //TODO: COMPLETE ASSERTIONS
        Assert.assertTrue(true, "String message");
    }

    @Test(description = "invalidLogin",
            dataProvider = "credentials")
    public void invalidLogin(String user, String Password) {
        loginPage.inputUsername(user);
        loginPage.inputPassword(Password);
        loginPage.tapLoginButton();
        //TODO: COMPLETE ASSERTIONS
        Assert.assertTrue(true, "String message");

    }

    @AfterMethod
    public void setActivity() {
        loginPage.setLoginPage();
    }

    @DataProvider(name = "credentials")
    public Object[][] credentials() {
        return new Object[][]{
                {"standard_user", "secret_sauce"}, {"standard_user", "secret_sauce"}
        };
    }
}
