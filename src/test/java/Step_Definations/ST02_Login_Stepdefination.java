package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import static Step_Definations.Setup.*;

public class ST02_Login_Stepdefination {

    @When("^enter valid Email address which is \"(.*)\"$")
    public void Enter_Valid_Email(String Email) {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        Authentication.Login_Email().sendKeys(Email);
    }

    @And("^enter Invalid password which is \"(.*)\"$")
    public void Enter_Invalid_password(String Pass) {
        Authentication.Login_Password().sendKeys(Pass);
    }

    @And("Click on Sign In Button")
    public void Click_Login_BTN() {
        Authentication.Login_BTN().click();
    }

    @Then("Login Fail Error Message will appeared Invalid password.")
    public void invalid_password_ErrMSG() {
        soft.assertTrue(Authentication.Login_Field_Error_MSG().getText().contains("Invalid password."));
    }

    @When("^enter Invalid Email address which is \"(.*)\"$")
    public void Enter_Invalid_email(String Email) {
        Authentication.Login_Email().sendKeys(Email);
    }

    @And("^enter valid password which is \"(.*)\"$")
    public void Enter_valid_password(String Pass) {
        Authentication.Login_Password().sendKeys(Pass);
    }

    @Then("Login Fail Error Message will appeared Invalid email address.")
    public void invalid_email_ErrMSG() {
        soft.assertTrue(Authentication.Login_Field_Error_MSG().getText().contains("Invalid email address."));
    }

    @Then("Login Fail Error Message will appeared Authentication failed.")
    public void non_registered_email_ErrMSG() {
        soft.assertTrue(Authentication.Login_Field_Error_MSG().getText().contains("Authentication failed."));
    }

    @Then("Login Fail Error Message will appeared Password is required.")
    public void Missing_password_ErrMSG() {
        soft.assertTrue(Authentication.Login_Field_Error_MSG().getText().contains("Password is required."));
    }


    @Then("Login Success")
    public void Login_Success() {
        soft.assertTrue(profile_page.LogoutButton().isDisplayed());
    }

}
