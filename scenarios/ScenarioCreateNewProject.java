import createProject.CreateProject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import topNav.ProjectNav;

/**
 * Created by sehrishraza on 06/09/2015.
 */
public class ScenarioCreateNewProject {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/muhammadraza/documents/chromedriver");
        driver = new ChromeDriver();
        HomeAndLogin homeAndLogin = new HomeAndLogin(driver);
         homeAndLogin.loginVision();

    }

    @Test
    public void createNewProject() throws Exception {
        ProjectNav projectNav = new ProjectNav(driver);
        projectNav.clickOnItem(1);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("project_details")));
        CreateProject createProject = new CreateProject(driver);
        createProject.addProjectTitle("Sehrish test project");
        createProject.addCustomerToProject("sehrish UK");
        createProject.getSaveProjectOptions().clickOnItem(0);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("prj_quotation_details")));



    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();

    }
}
