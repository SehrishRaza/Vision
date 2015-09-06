package topNav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by sehrishraza on 06/09/2015.
 */
public class ProjectNav extends TopNav implements HoverableDropdownOptions{
    private WebElement projects = menuBar.get(2);
    private List<WebElement> projectMenuList = projects.findElements(By.cssSelector("ul li"));
    Actions action = new Actions(driver);

    public ProjectNav(WebDriver driver) {
        super(driver);
    }

    public void hover() {
        action.moveToElement(projects).perform();
    }


    public void clickOnItem(int index) {
        hover();
        action.moveToElement(projectMenuList.get(index)).click().perform();
    }

}
