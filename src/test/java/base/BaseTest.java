package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public BaseTest() {
    }

    public AndroidDriver androidDriver;
    public AppiumDriverLocalService appiumService;
    public UiAutomator2Options capabilities;
    public String pathMainJS = "C:\\Users\\ggeta\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";

    public String deviceName = "SM-G975U";
    public String appActivity = "com.swaglabsmobileapp.MainActivity";
    public String appPackage = "com.swaglabsmobileapp";
    public String appPath = "C:\\Users\\ggeta\\IdeaProjects\\AutomationProject_appium\\src\\test\\java\\resources\\androidApp\\SampleApp.apk";

    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        configureAppiumService();
        configureAndroidDriver();
        setUptimeOutDuration(5);
    }

    @AfterClass
    public void tearDown() {
        androidDriver.quit();
        appiumService.stop();
         System.out.println("finish");
    }

    private void configureAppiumService() {
        appiumService = new AppiumServiceBuilder()
                .withAppiumJS(new File(pathMainJS))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        appiumService.start();
    }
    
    private void configureAndroidDriver() throws URISyntaxException, MalformedURLException {
        URL url = new URI("http://127.0.0.1:4723/").toURL();

        capabilities = new UiAutomator2Options();
        capabilities.setDeviceName(deviceName);
        capabilities.setApp(appPath);
        capabilities.setAppActivity(appActivity);
        capabilities.setAppPackage(appPackage);

        androidDriver = new AndroidDriver(url,capabilities);
    }

    public void setUptimeOutDuration(int timeInSeconds){
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
    }

}
