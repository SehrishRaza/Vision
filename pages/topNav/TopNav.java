package topNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by muhammadraza on 04/09/2015.
 */
public class TopNav {

    protected final WebDriver driver;
    protected List<WebElement> menuBar;

    public TopNav(WebDriver driver) {
        this.driver = driver;
        menuBar = driver.findElements(By.cssSelector("#cm-menu > ul > li"));
    }

    public int getSize() {
        return menuBar.size();
    }


}
