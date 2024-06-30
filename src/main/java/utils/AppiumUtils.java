package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class AppiumUtils {

    public Logger log = LoggerFactory.getLogger(AndroidActions.class);
    AppiumDriver driver;

    public AppiumUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public Double getFormatCurrency(String amount) {
        return Double.parseDouble(amount.substring(1));
    }

    public void waitForElementToAppear(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains((element), "text", "cart"));
    }


}
