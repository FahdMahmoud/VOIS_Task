package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Step_Definations.Setup.*;

public class ST05_Checkout_procedure {


    @And("Click on Proceed to checkout button")
    public void Click_Proceed_Checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")))).click();
        Blouses.Shopping_Cart().click();
    }

    @Given("Click on Proceed to Checkout Button in summary page")
    public void Pr_To_Ch_BTN_Summery_Page() {
        order.Checkout_BTN_Summery_Page().click();
    }

    @When("Click on Proceed to Checkout Button in address page")
    public void Pr_To_Ch_BTN_address_Page() {
        order.Checkout_BTN_address_Page().click();
    }

    @And("Click on Proceed to Checkout Button in shipping page")
    public void Pr_To_Ch_BTN_shipping_Page() {
        order.Checkout_BTN_shipping_Page().click();
    }

    @Then("Checkout process is stopped")
    public void AgreeOnTerms_Alert_MSG() {
        String Expected_Alert_MSG = "You must agree to the terms of service before continuing.";
        String Actual_Alert_MSG = order.Agree_on_terms_Alert_MSG().getText();
        soft.assertTrue(Actual_Alert_MSG.contains(Expected_Alert_MSG));
    }

    @And("Check agree on terms check box")
    public void Select_AgreeOnTerms_CheckBox() {
        order.AgreeTerms_CheckBox().click();
    }

    @Then("user will directed to step number.5 payment page")
    public void user_directed_to_PaymentPage() {
        String Expected_Alert_MSG = "Please choose your payment method";
        String Actual_Alert_MSG = order.Payment_Page_Title().getText();
        soft.assertTrue(Actual_Alert_MSG.contains(Expected_Alert_MSG));
    }
}
