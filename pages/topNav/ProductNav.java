package topNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by sehrishraza on 04/09/2015.
 */
public class ProductNav extends TopNav implements HoverableDropdownOptions{

    private WebElement products = menuBar.get(1);
    private List<WebElement> prodMenu = products.findElements(By.cssSelector("ul li"));
    Actions action = new Actions(driver);

    public ProductNav(WebDriver driver) {

        super(driver);
    }

    public void hover() {

        action.moveToElement(products).perform();
    }


    public void clickOnItem(int index) {
        hover();
        action.moveToElement(prodMenu.get(index)).click().perform();

    }


}
