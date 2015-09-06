package createProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by muhammadraza on 04/09/2015.
 */
public class NewProductPricingTab extends CreateNewProduct {
    private WebElement pricingtab = topTabs.get(3);
    private WebElement pricingtabForm;

    public NewProductPricingTab(WebDriver driver) {
        super(driver);
        pricingtabForm = this.driver.findElement(By.id("prodform_pricing_section"));
    }

    public void openPricingTab() {
        pricingtab.click();
    }

    public void selectColour(int index) {
        List<WebElement> selectColourList = pricingtabForm.findElements(By.cssSelector("#prodform_base_pricing_as_container > div.pricing_radial"));
        selectColourList.get(index).click();
    }

    public void addQuantityBreak(int index, int QB) {
        List<WebElement> selectQB = pricingtabForm.findElements(By.cssSelector("#prodform_pricing_table > thead > tr:first-child > .numberaligned input"));
        selectQB.get(index).sendKeys(String.valueOf(QB));

    }

    public void addCostPrice(int index, double cost) {
        List<WebElement> selectCostPrice = pricingtabForm.findElements(By.cssSelector("#prodform_pricing_table .prodform_pricing_costrow .colour_type_field.numberaligned input"));
        selectCostPrice.get(index).sendKeys(String.valueOf(cost));
    }

    public void addMargin(int index, double margin) {
        List<WebElement> addMargin = pricingtabForm.findElements(By.cssSelector("#prodform_pricing_table .prodform_pricing_costrow.rowactive .margin_item input"));
        addMargin.get(index).sendKeys(String.valueOf(margin));
    }

    public double getSellPrice(int index) {
        List<WebElement> getSellPrice = pricingtabForm.findElements(By.cssSelector("#prodform_pricing_table .prodform_pricing_sellrow .colour_type_field.numberaligned input"));
        return Double.parseDouble(getSellPrice.get(index).getAttribute("value"));
    }
}
