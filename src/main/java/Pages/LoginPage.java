package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class LoginPage extends AndroidActions {

    AndroidDriver androidDriver;

    public LoginPage(AndroidDriver androidDriver) {
        super(androidDriver);
        this.androidDriver = androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    //-------------------------- Elements ---------------------------------------------
    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    private WebElement title;

    @AndroidFindBy(accessibility = "test-Username")
    private WebElement usernameField;

    @AndroidFindBy(accessibility = "test-Password")
    private WebElement passwordField;

    @AndroidFindBy(accessibility = "test-biometry")
    private WebElement biometryButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView")
    private WebElement robotImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOGIN\"]")
    private WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"The currently accepted usernames for this application are (tap to autofill):\"]")
    private WebElement credentialsInfo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"standard_user\"]")
    private WebElement standardUserText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"locked_out_user\"]")
    private WebElement lockedOutUserText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"problem_user\"]")
    private WebElement problemUserText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"And the password for all users is:\"]")
    private WebElement passwordMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"secret_sauce\"]")
    private WebElement secretSauceText;

    //-------------------------- Methods ---------------------------------------------

    public void tapLoginButton() {
        tapElement(loginButton);
    }

    public void tapBiometryButton() {
        tapElement(biometryButton);
    }

    public void tapStandardUserText() {
        tapElement(standardUserText);
    }

    public void tapLockedOutUserText() {
        tapElement(lockedOutUserText);
    }

    public void tapProblemUserText() {
        tapElement(problemUserText);
    }

    public void inputUsername(String input) {
        sendKeysTo(usernameField, input);
    }

    public void inputPassword(String input) {
        sendKeysTo(passwordField, input);
    }

    public AllItemsPage login(){
        tapElement(standardUserText);
        tapElement(loginButton);
        return new AllItemsPage(androidDriver);
    }

}
