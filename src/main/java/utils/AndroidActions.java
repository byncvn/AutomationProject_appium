package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AndroidActions extends AppiumUtils {


    AndroidDriver androidDriver;

    public AndroidActions(AndroidDriver driver) {
        super(driver);
        this.androidDriver = driver;
    }

    public void setActivity(String pack, AndroidDriver driver){
        ((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("intent", pack));
    }

    public void tapElement(WebElement webElement) {
        webElement.click();
        log.info("element {} has been tapped", webElement);
    }

    public void sendKeysTo(WebElement webElement, String inputs) {
        webElement.sendKeys(inputs);
        androidDriver.hideKeyboard();
        log.info("input [{}] has been sent", inputs);
    }

    public void scrollDown() {
        //TODO:

    }

    public void scrollUp() {
        //TODO:

    }

    public void scrollToText() {

    }

    public void swipeLeft() {
        //TODO:

    }

    public void swipeRight() {
        //TODO:

    }

}
