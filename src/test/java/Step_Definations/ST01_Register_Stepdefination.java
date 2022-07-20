package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static Step_Definations.Setup.*;


public class ST01_Register_Stepdefination {

    Select select_state_dropdown;
    Select select_country_dropdown;



    @Given("user Open the browser navigate to Home page to Register")
    public void user_open_browser() {
        Page_setup();
    }

    @And("user click on sign In button")
    public void Click_SignIn_BTN() {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        home.Signin_BTN().click();
    }

    @When("^user enter Invalid Email which is \"(.*)\"$")
    public void InvalidEmail(String Email_AddressTXT) {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        Authentication.Register_Email_TXT().sendKeys(Email_AddressTXT);
    }

    @And("user click on create an account button")
    public void user_click_create_account_BTN() {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        Authentication.Create_Account_BTN().click();
    }

    @Then("user Registration Fail")
    public void Invalid_Email_Error_MSG() {
        String Expected_Result = "Invalid email address.";
        String Actual_Result = Authentication.Invalid_Email_MSG().getText();
        soft.assertTrue(Expected_Result.contains(Actual_Result));
        soft.assertAll();
    }

    @And("^user enter valid and not used Email which is \"(.*)\"$")
    public void User_Enter_Valid_Email(String Email_address) {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        Authentication.Register_Email_TXT().sendKeys(Email_address);
    }

    @When("^user enter valid data, first name is \"(.*)\" , last name is \"(.*)\", Password is \"(.*)\", Company is \"(.*)\" , address is \"(.*)\"$")
    public void Fill_with_missing_Mandatory_Field(String First_name, String Last_name, String Password, String company, String Address) {
        Register.Customer_First_Name().sendKeys(First_name);
        Register.Customer_Last_Name().sendKeys(Last_name);
        Register.Customer_Password().sendKeys(Password);
        Register.Company().sendKeys(company);
        Register.Address().sendKeys(Address);
    }

    @And("^city is \"(.*)\" and state is \"(.*)\" and postal_code is \"(.*)\" , country is \"(.*)\"$")
    public void Fill_with_missing_Mandatory_Field(String City, String State, String PastalCode, String Country) {
        Register.City().sendKeys(City);
        select_state_dropdown = new Select(Register.State_dropdown());
        select_state_dropdown.selectByVisibleText(State);
        Register.PostCode().sendKeys(PastalCode);
        select_country_dropdown = new Select(Register.Country_dropdown());
        select_country_dropdown.selectByVisibleText(Country);
    }

    @And("^mobile is \"(.*)\" and address alias is \"(.*)\"$")
    public void Fill_with_missing_Mandatory_Field(String Mobile, String Address_Alias) {

        Register.Mobile().sendKeys(Mobile);
        Register.Alias_address().sendKeys(Address_Alias);
    }

    @And("user click on Register Button")
    public void Click_Register_BTN() {
        Register.Register_BTN().click();
    }

    @Then("user Registration Fails")
    public void Missing_Password_MSG() {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        soft.assertTrue(Register.Missing_Field_Error_MSG().isDisplayed(), "Assertion fail as missing field error message was not appeared");
        soft.assertAll();
    }

    @Then("user Registration Successfully")
    public void Register_Successfully() {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        // assert that the Logout button is appeared when redirected
        soft.assertTrue(profile_page.LogoutButton().isDisplayed(), "Assertion for Logout button");
        // assert that the Home button is appeared
        soft.assertTrue(profile_page.Home_BTN_UserProfile().isDisplayed(), "Assertion for Home button");
        soft.assertAll();
    }

    @When("^user enter existing Email which is \"(.*)\"$")
    public void Register_with_ExistEmail(String Email) {
        driver.manage().timeouts().implicitlyWait(sleepTime, TimeUnit.SECONDS);
        Authentication.Register_Email_TXT().sendKeys(Email);
    }

    @Then("user Registration will Fail")
    public void Register_Fail() {
        String Expected_Result = "An account using this email address has already been registered. Please enter a valid password or request a new one. ";
        String Actual_Result = Authentication.Existing_Email_ErrMSG().getText();
        soft.assertTrue(Expected_Result.contains(Actual_Result), "Assertion fail as duplication message was not appeared ");
        soft.assertAll();
    }

}
