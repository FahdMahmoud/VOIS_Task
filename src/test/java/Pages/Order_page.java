package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Step_Definations.Setup.driver;

public class Order_page {

    public WebElement Checkout_BTN_Summery_Page() {
    return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    }

    public WebElement Checkout_BTN_address_Page() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
    }

    public WebElement AgreeTerms_CheckBox() {
        return driver.findElement(By.id("cgv"));
    }

    public WebElement Checkout_BTN_shipping_Page() {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
    }

    public WebElement Payment_Page_Title() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }

    public WebElement Agree_on_terms_Alert_MSG() {
        return driver.findElement(By.xpath("//*[@id=\"order\"]/div[2]/div/div/div/div/p"));
    }

    public WebElement pay_by_bank_wire() {
        return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    }

    public WebElement ConfirmOrder_BTN() {
        return driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
    }

    public WebElement OrderConfirmation_Title() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
    }

    public WebElement To_History(){
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a"));
    }

}
