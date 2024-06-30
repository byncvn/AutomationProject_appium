package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AndroidActions extends AppiumUtils {


    AndroidDriver androidDriver;

    public AndroidActions(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
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

    public void scrollToText(){

    }

    public void swipeLeft() {
        //TODO:

    }

    public void swipeRight() {
        //TODO:

    }

}
