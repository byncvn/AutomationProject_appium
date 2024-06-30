package sampleAppTests;

import Pages.AllItemsPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {


    @Test(description = "Log in happy-path",
            dataProvider = "credentials")
    public void validLogin(String user, String Password) {
        loginPage.inputUsername(user);
        loginPage.inputPassword(Password);
        loginPage.tapLoginButton();
        Assert.assertTrue(true, "String message");
    }

    @Test(description = "invalidLogin",
            dataProvider = "getCredentials")
    public void invalidLogin() {
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

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"standard_user", "secret_sauce"}};
    }
}
