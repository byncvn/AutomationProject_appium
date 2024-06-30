package utils;

import io.appium.java_client.ios.IOSDriver;

public class iOSActions extends AppiumUtils {

    IOSDriver driver;

    public iOSActions(IOSDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
