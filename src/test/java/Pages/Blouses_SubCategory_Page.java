package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Step_Definations.Setup.driver;

public class Blouses_SubCategory_Page {

    public WebElement Selected_blouse() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
    }

    public WebElement Add_to_Cart_BTN() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
    }

    public WebElement Shopping_Cart(){
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b"));
    }

    public WebElement Item_added_Confirmation_MSG() {
        return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"));
    }

    public WebElement Selected_Item_Title() {
        return driver.findElement(By.id("product_reference"));
    }

    public WebElement Blouses_Page_Title() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]"));
    }


}
