import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by muhammadraza on 03/09/2015.
 */
public class HomePage {

    private final WebDriver driver;
    private WebElement cusermenuMain;

    public HomePage(WebDriver driver) {
        this.driver = driver;
       cusermenuMain  = this.driver.findElement(By.id("cusermenu"));


    }

    public void clickLoginLink() {
        cusermenuMain.findElement(By.className("log-in")).findElement(By.tagName("a")).click();

    }

    public void acknowledgeLogout(){

        List<WebElement> cusermenu = this.driver.findElement(By.id("cusermenu")).findElements(By.cssSelector("a"));
        WebElement lastElement = cusermenu.get(cusermenu.size()-1);
        Assert.assertTrue(lastElement.getText().equalsIgnoreCase("Log Out"));

    }




}
