package sampleAppTests;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    public LoginPage loginPage;

    @BeforeMethod
    public void createPages() {
        loginPage = new LoginPage(androidDriver);
    }

    @Test(description = "Log in happy-path")
    public void validLogin() {
        loginPage.clickUsernameField();
        Assert.assertTrue(true, "String message");
    }

}
