package co.za.inspired.commonsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    private CommonSteps CommonSteps;

    public StepDefinition() {
        this.CommonSteps = new CommonSteps();
    }

    @Given("^A user navigates to HomePage$")
    public void user_navigates_To_HomePage() {
        this.CommonSteps.goToHomePage();

    }

    @When("Validate that you are on the User List Table")
    public void validate_that_you_are_on_the_User_List_Table() {
        this.CommonSteps.validateTable();

    }

    @And("click add user")
    public void click_add_user() {
        this.CommonSteps.adduser();
    }


    @And("^user provide reg details (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void userProvideRegDetails( final String name, final String lastname, final String username, final String password, final String customer, final String role, final String email, final String cell) {

        this.CommonSteps.provideDetails(name, lastname,  username,  password, customer,  role,  email,  cell);
    }
    @And("^user log in(.*) (.*)$")
    public void user_log_inn(final String name, final String password){
        this.CommonSteps.login(name,password);
    }

    @Then("^verify created users exist on page$")
    public void userPopulateTheFormOnceDisplayed() throws Throwable  {
        this.CommonSteps.sortAscendingOrder();
    }
}
