import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by muhammadraza on 05/09/2015.
 */
public class ScenarioLoginVision {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadraza/documents/chromedriver");
        driver = new ChromeDriver();

    }
    @Test
    public void LoginToVision(){
        HomeAndLogin homeAndLogin = new HomeAndLogin(driver);
        homeAndLogin.loginVision();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}
