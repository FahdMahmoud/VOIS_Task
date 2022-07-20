package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Step_Definations.Setup.driver;

public class Authontication_Page {

    public WebElement Create_Account_BTN() {
        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement Register_Email_TXT() {
        return driver.findElement(By.id("email_create"));
    }

    public WebElement Invalid_Email_MSG() {
        return driver.findElement(By.id("create_account_error"));
    }

    public WebElement Existing_Email_ErrMSG() {
        return driver.findElement(By.id("create_account_error"));
    }

    public WebElement Login_Email() {
        return driver.findElement(By.id("email"));
    }

    public WebElement Login_Password() {
        return driver.findElement(By.id("passwd"));
    }

    public WebElement Login_BTN() {
        return driver.findElement(By.id("SubmitLogin"));
    }

    public WebElement Login_Field_Error_MSG() {
        return driver.findElement(By.className("alert"));
    }


}
