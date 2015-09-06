import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by muhammadraza on 05/09/2015.
 */
public class HomeAndLogin {

    private final WebDriver driver;
    private static final String URL = "http://uk.customerfocus.com";
    private static final String emailAddress = "sehrish.raza@tradeonly.com";
    private static final String password = "";


    public HomeAndLogin(WebDriver driver) {
        this.driver = driver;

    }

    public void loginVision(String email, String password){
        driver.get(URL);
        HomePage homepage = new HomePage(driver);
        homepage.clickLoginLink();
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("appusername")));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("cusermenu")));
        homepage.acknowledgeLogout();

    }
    public  void loginVision(){
        loginVision(emailAddress, password);

    }

}
