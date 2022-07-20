package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static Step_Definations.Setup.*;

public class ST07_Check_History_Page {

    int beforeOrder;

    @And("Get orders count from History Page")
    public void Get_Orders_Count_Before() {
        driver.get("http://automationpractice.com/index.php?controller=history");
        beforeOrder = driver.findElements(By.className("color-myaccount")).size();
    }

    @Given("Click on Back to Orders")
    public void Back_to_Orders() {
        order.To_History().click();
    }


    @Then("Orders Count Increased by One")
    public void Order_Summary_Appeared() {
        int BeforeOrder = beforeOrder;
        int AfterOrder = driver.findElements(By.className("color-myaccount")).size();
        System.out.println("Count Before Order = " + BeforeOrder + " Orders");
        System.out.println("Count After Order = " + AfterOrder + " Orders");
        soft.assertEquals(BeforeOrder + 1, AfterOrder);
    }

}
