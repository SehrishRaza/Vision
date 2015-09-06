import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by muhammadraza on 03/09/2015.
 */
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterEmail(String email) {

        this.driver.findElement(By.id("appusername")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password1")).sendKeys(password);

    }

    public void submitCredentials() {
        driver.findElement(By.id("submitNormal")).click();

    }

    public void login(String email, String password){

        enterEmail(email);
        enterPassword(password);
        submitCredentials();
    }

}
