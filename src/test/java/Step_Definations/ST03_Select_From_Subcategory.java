package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Step_Definations.Setup.*;

public class ST03_Select_From_Subcategory {


    @Given("Click on Women Main Category")
    public void Click_on_Main_Woman_Category() {
        profile_page.Women_Category().click();
    }

    @And("Click on Tops Category")
    public void Click_on_Tops_Category() {
        profile_page.Tops_Category().click();
    }

    @When("Click on Blouses subcategory")
    public void Click_on_Blouses_Link() {
        profile_page.Blouses_SubCategory().click();
    }

    @Then("user directed to Blouses Subcategory")
    public void Directed_To_Blouses_Subcategory() {
        String Expected_Result = "Blouses ";
        String Actual_Result = Blouses.Blouses_Page_Title().getText();
        soft.assertTrue(Expected_Result.contains(Actual_Result));
    }

    @And("Select appeared blouse by click on it")
    public void select_blouse() {
        Blouses.Selected_blouse().click();
    }
}
