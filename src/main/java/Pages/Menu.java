package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;


public class Menu extends AndroidActions {
    AndroidDriver androidDriver;

    public Menu(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOGOUT\"]")
    private WebElement logOutButton;

    public void navigateToLogOut() {
        tapElement(menuButton);
        tapElement(logOutButton);
    }
}
