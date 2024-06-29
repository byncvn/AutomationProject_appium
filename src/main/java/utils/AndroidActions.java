package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class AndroidActions {

    AndroidDriver androidDriver;

    public AndroidActions(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    public void tapElement(WebElement webElement) {
        webElement.click();
        //TODO: Add log to inform element has been tapped
        System.out.println("element has been tapped");
    }

    public void sendKeysTo(WebElement webElement, String inputs) {
        webElement.sendKeys(inputs);
        //TODO: Add log to inform element has been tapped
        System.out.println("element has been tapped");
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
