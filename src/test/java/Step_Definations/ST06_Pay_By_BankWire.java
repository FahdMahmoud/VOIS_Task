package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static Step_Definations.Setup.order;
import static Step_Definations.Setup.soft;

public class ST06_Pay_By_BankWire {

    @Given("Click on Pay by bank wire Button in payment page")
    public void Pr_To_Ch_BTN_Summery_Page() {
        order.pay_by_bank_wire().click();
    }

    @And("Press on I Confirm My Order Button")
    public void Press_on_I_Confirm() {
        order.ConfirmOrder_BTN().click();
    }

    @Then("Order summery appeared")
    public void Order_Summary_Appeared() {
        String ExpectedTitle = "Order confirmation";
        String ActualTitle = order.OrderConfirmation_Title().getText();
        soft.assertTrue(ActualTitle.contains(ExpectedTitle));
    }

}
