package frameworkproject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class AdditionStepDefinitions {
    
    private int a;
    private int b;
    private int result;

    @Given("first number is {int}")
    public void first_number_is(Integer int1) {
        a = int1;
    }

    @Given("second number is {int}")
    public void second_number_is(Integer int1) {
        b = int1;
    }

    @When("Add the two numbers")
    public void add_the_two_numbers() {
        result = a + b;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        assertEquals(int1.intValue(), result);
    }


}
