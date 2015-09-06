import createProduct.NewProductDetailTab;
import createProduct.NewProductPricingTab;
import createProduct.SelectColourOption;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import topNav.ProductNav;

import static org.hamcrest.core.Is.is;

public class ScenarioCreateNewProduct {
    private WebDriver driver;


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/muhammadraza/documents/chromedriver");
        driver = new ChromeDriver();
        HomeAndLogin homeAndLogin = new HomeAndLogin(driver);
        homeAndLogin.loginVision();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }

    @Test
    public void mainTest() throws InterruptedException {

        ProductNav productNav = new ProductNav(driver);
        productNav.clickOnItem(1);
        new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("productform")));

        NewProductDetailTab newProductDetailTab = new NewProductDetailTab(driver);
        newProductDetailTab.enterProdTitle();
        newProductDetailTab.enterSupplierRef();
        newProductDetailTab.clickAddCategory();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".application.ui-resizable.ui-draggable")));
        newProductDetailTab.selectProdCategory("367142");
        newProductDetailTab.selectSupplier("Sehrish Supplier");

        NewProductPricingTab newProductPricingTab = new NewProductPricingTab(driver);
        newProductPricingTab.openPricingTab();
        newProductPricingTab.selectColour(SelectColourOption.COLOUR_2.getIndex());
        newProductPricingTab.addQuantityBreak(0,10);
        double cost = 10d;
        double margin = 50d;
        newProductPricingTab.addCostPrice(0,cost);
        newProductPricingTab.addMargin(0,margin);
        double sellPrice = newProductPricingTab.getSellPrice(0);
        Assert.assertTrue(sellPrice == 20d);
        newProductPricingTab.publishProductLive();
        newProductPricingTab.saveProduct();
        WebElement addProdSuccess = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("addProd_message")));
        Assert.assertTrue(addProdSuccess.getText().equalsIgnoreCase("Product has been saved and is live."));



    }

}
