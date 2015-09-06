package topNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by muhammadraza on 04/09/2015.
 */
public class ProductNav extends TopNav {

    private WebElement products = menuBar.get(1);
    private List<WebElement> prodMenu = products.findElements(By.cssSelector("ul li"));
    Actions action = new Actions(driver);

    public ProductNav(WebDriver driver) {
        super(driver);
    }

    public void hoverProduct() {
        action.moveToElement(products).perform();
    }

    public void clickProdOverviewNav() {
        hoverProduct();
        action.moveToElement(prodMenu.get(0)).click().perform();

    }

    public void clickNewProdNav() {
        hoverProduct();
        action.moveToElement(prodMenu.get(1)).click().perform();

    }

    public void clickMyProdNav() {
        hoverProduct();
        action.moveToElement(prodMenu.get(2)).click().perform();
    }

}
