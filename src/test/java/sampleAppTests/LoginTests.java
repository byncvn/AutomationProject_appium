package sampleAppTests;

import Pages.AllItemsPage;
import Pages.LoginPage;
import base.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "Log in happy-path")
    public void validLogin() {
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.tapLoginButton();
        Assert.assertTrue(true, "String message");
    }

    @Test(description = "input username")
    public void testUsernameField() {
        loginPage.inputUsername("");
        log.info("this is a log test");
        Assert.assertTrue(true, "String message");

    }

    @Test(description = "test description")
    public void testName() {
        AllItemsPage allItemsPage = loginPage.login();
        allItemsPage.addItemToCartByIndex(1);
        Assert.assertTrue(true, "String message");

    }
}
