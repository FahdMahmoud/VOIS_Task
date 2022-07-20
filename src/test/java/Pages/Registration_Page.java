package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Step_Definations.Setup.driver;

public class Registration_Page {

    public WebElement Male_Title() {
        return driver.findElement(By.id("id_gender1"));
    }

    public WebElement Female_Title() {
        return driver.findElement(By.id("id_gender2"));
    }

    public WebElement Customer_First_Name() {
        return driver.findElement(By.id("customer_firstname"));
    }

    public WebElement Customer_Last_Name() {
        return driver.findElement(By.id("customer_lastname"));
    }

    public WebElement Customer_Email() {
        return driver.findElement(By.id("email"));
    }

    public WebElement Customer_Password() {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement Day_Birth() {
        return driver.findElement(By.id("days"));
    }

    public WebElement Month_Birth() {
        return driver.findElement(By.id("months"));
    }

    public WebElement Year_Birth() {
        return driver.findElement(By.id("years"));
    }

    public WebElement Address_First_Name() {
        return driver.findElement(By.id("firstname"));
    }

    public WebElement Address_Last_Name() {
        return driver.findElement(By.id("lastname"));
    }

    public WebElement Company() {
        return driver.findElement(By.id("company"));
    }

    public WebElement Address() {
        return driver.findElement(By.id("address1"));
    }

    public WebElement City() {
        return driver.findElement(By.id("city"));
    }

    public WebElement State_dropdown() {
        return driver.findElement(By.id("id_state"));
    }

    public WebElement PostCode() {
        return driver.findElement(By.id("postcode"));
    }

    public WebElement Country_dropdown() {
        return driver.findElement(By.id("id_country"));
    }

    public WebElement Mobile() {
        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement Alias_address() {
        return driver.findElement(By.id("alias"));
    }

    public WebElement Register_BTN() {
        return driver.findElement(By.id("submitAccount"));
    }

    public WebElement Missing_Field_Error_MSG() {
        return driver.findElement(By.className("alert"));
    }

}
