package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        configureAppiumService();
        configureAndroidDriver();
    }

    @AfterClass
    public void tearDown() {
        //Quit driver
        //Stop service
    }

    private void configureAndroidDriver() {
    }

    private void configureAppiumService() {

    }
}
