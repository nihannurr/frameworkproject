package frameworkproject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

public class ApiStepDefinitions {

    @Given("Set the base URL to {string}")
    public void set_the_base_url_to(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    @When("Send a GET request to {string}")
    public void send_a_get_request_to(String endpoint) {
        SerenityRest.given().get(endpoint);
    }

    // Bu methodu kullanmak icin senaryoya test adımı eklenebilir.
    @When("Send a PUT request to {string}")
    public void send_a_put_request_to(String endpoint) {
        SerenityRest.given().put(endpoint);
    }

    // Bu methodu kullanmak icin senaryoya test adımı eklenebilir.
    @When("Send a POST request to {string}")
    public void send_a_post_request_to(String endpoint) {
        SerenityRest.given().post(endpoint);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

}
