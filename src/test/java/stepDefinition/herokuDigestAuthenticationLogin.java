package stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class herokuDigestAuthenticationLogin {

    @Given("^user opens application page$")
    public void user_opens_application_page() throws Throwable {
        System.out.println("Executed Given");
        throw new PendingException();

    }

    @When("^user switch to popup$")
    public void user_switch_to_popup() throws Throwable {
        System.out.println("Executed When");
        throw new PendingException();
    }

    @Then("^User is able to signin and verify that user is landed in correct page$")
    public void user_is_able_to_signin_and_verify_that_user_is_landed_in_correct_page() throws Throwable {
        System.out.println("Executed Then");
        throw new PendingException();
    }

    @And("^User enters username and Password$")
    public void user_enters_username_and_password() throws Throwable {
        System.out.println("Executed And");
        throw new PendingException();
    }

}
