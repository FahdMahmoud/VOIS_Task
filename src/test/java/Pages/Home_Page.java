package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Step_Definations.Setup.driver;


public class Home_Page {


    public WebElement Signin_BTN()
    {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    }

}
