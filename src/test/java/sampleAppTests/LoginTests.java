package sampleAppTests;

import Pages.LoginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LoginTests extends BaseTest {

    public LoginTests() throws URISyntaxException, MalformedURLException {
    }

    public LoginPage loginPage;

    @BeforeMethod
    public void methodName() {
        loginPage = new LoginPage();
    }

    @Test(description = "Log in happy-path")
    public void validLogin() {
        Assert.assertTrue(true, "String message");
    }
}
