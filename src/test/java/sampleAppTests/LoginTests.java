package sampleAppTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class LoginTests extends BaseTest {


    @Test(description = "Log in happy-path",
            dataProvider = "credentials")
    public void validLogin(HashMap<String, String> input) {
        log.info(input.get("username"));
        log.info(input.get("password"));
        loginPage.inputUsername(input.get("username"));
        loginPage.inputPassword(input.get("password"));
        loginPage.tapLoginButton();
        //TODO: COMPLETE ASSERTIONS
        Assert.assertTrue(true, "String message");
    }

    @Test(description = "invalidLogin",
            dataProvider = "credentials")
    public void invalidLogin(HashMap<String, String> input) {
        loginPage.inputUsername(input.get("username"));
        loginPage.inputPassword(input.get("password"));
        loginPage.tapLoginButton();
        //TODO: COMPLETE ASSERTIONS
        Assert.assertTrue(true, "String message");

    }

    @AfterMethod
    public void setActivity() {
        loginPage.setLoginPage();
    }

    @DataProvider(name = "credentials")
    public Object[][] credentials() throws IOException {
        List<HashMap<String, String>> data = loginPage.getJsonData(System.getProperty("user.dir") + "\\src\\test\\java\\testData\\sampleApp.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};
    }
}
