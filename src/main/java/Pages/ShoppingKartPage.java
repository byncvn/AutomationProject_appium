package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class ShoppingKartPage extends AndroidActions {

    AndroidDriver androidDriver;

    public ShoppingKartPage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }
}
