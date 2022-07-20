package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Step_Definations.Setup.driver;

public class User_Profile_Page {

    public WebElement LogoutButton() {
        return driver.findElement(By.className("logout"));
    }

    public WebElement Home_BTN_UserProfile() {
        return driver.findElement(By.cssSelector("[title=\"Home\"]"));
    }

    public WebElement Women_Category() {
        return driver.findElements(By.className("sf-with-ul")).get(0);
    }

    public WebElement Tops_Category() {
        return driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
    }

    public WebElement Blouses_SubCategory() {
        return driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a"));
    }


}
