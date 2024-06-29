package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    AndroidDriver androidDriver;

    public LoginPage(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOGIN\"]")
    private WebElement usernameField;

    public void clickUsernameField(){
        usernameField.click();
    }
}
