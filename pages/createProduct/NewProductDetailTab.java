package createProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by muhammadraza on 04/09/2015.
 */
public class NewProductDetailTab extends CreateNewProduct {

    private WebElement prodDetail = topTabs.get(0);
    private WebElement prodDetailForm;

    public NewProductDetailTab(WebDriver driver) {
        super(driver);
        prodDetailForm = this.driver.findElement(By.id("prodform_details_section"));
    }

    public void enterProdTitle() {

        prodDetailForm.findElement(By.id("prod_title")).sendKeys("Sehrish test project");
    }

    public void enterSupplierRef(){

        prodDetailForm.findElement(By.id("prod_supplier_ref")).sendKeys("Test_ref");
    }
    public void clickAddCategory() {
        prodDetailForm.findElement(By.id("categorypicker_button")).click();
    }

    public void selectProdCategory(String option){
        WebElement addCategoryPopup = driver.findElement(By.cssSelector(".application.ui-resizable.ui-draggable"));
        WebElement subCategory = addCategoryPopup.findElement(By.cssSelector("div.wrap div.content div.picker_form_contents div.pickers_standard div#midcat_picker_container select"));
        Select selectCategory = new Select(subCategory);
        selectCategory.selectByValue(option);
        WebElement okButton = addCategoryPopup.findElement(By.cssSelector("div.wrap div.content div.picker_form_contents div#categorypicker_selectbutton_container a"));
        okButton.click();
    }
    public void selectSupplier(String supplierName){

        driver.findElement(By.id("supplier_id_input")).clear();
        driver.findElement(By.id("supplier_id_input")).sendKeys(supplierName);
        driver.findElement(By.id("supplier_id_input")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("supplier_id_input")).sendKeys(Keys.RETURN);
    }



}
