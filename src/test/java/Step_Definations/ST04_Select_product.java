package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Step_Definations.Setup.*;

public class ST04_Select_product {


    @Given("Click on Resulted blouse")
    public void Hover_on_resulted_blouse() {
        Blouses.Selected_blouse().click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/a")))).click();
        action.moveToElement(Blouses.Selected_blouse());
        action.build().perform();
    }

    @When("Click on Add to cart Button")
    public void Add_Blouse_To_Cart() {
        wait.until(ExpectedConditions.elementToBeClickable(Blouses.Add_to_Cart_BTN())).click();
    }


    @And("Add to cart confirmation appeared")
    public void Item_Added_to_Cart() {
        String Expected_MSG = "Product successfully added to your shopping cart";
        String Actual_MSG = Blouses.Item_added_Confirmation_MSG().getText();
        soft.assertTrue(Actual_MSG.contains(Expected_MSG));
    }
}
