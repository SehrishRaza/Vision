package createProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by muhammadraza on 04/09/2015.
 */
public class CreateNewProduct {

    protected final WebDriver driver;
    private final WebElement bottomOptions;
    protected List<WebElement> topTabs;

    public CreateNewProduct(WebDriver driver) {
        this.driver = driver;
        topTabs = driver.findElements(By.cssSelector(".tabmenu.prodform > li"));
        bottomOptions = driver.findElement(By.cssSelector("#prodform_bottombar"));
    }

    public void publishProductLive() {
        bottomOptions.findElement(By.id("prod_approved_status")).click();
    }

    public void saveProduct() {
        bottomOptions.findElement(By.id("saveproduct")).click();
    }

}
