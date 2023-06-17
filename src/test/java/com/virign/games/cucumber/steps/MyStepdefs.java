package com.virign.games.cucumber.steps;

import com.virign.games.steps.DataSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;


public class MyStepdefs {


    static ValidatableResponse response;

    @Steps
    DataSteps dataSteps;
    @When("^User send the get request$")
    public void userSendTheGetRequest() {
        response = dataSteps.getInfoByData();

    }

    @Then("^User get response status code (\\d+)$")
    public void userGetResponseStatusCode(int arg0) {
        response.statusCode(200);

    }


    @And("^user verify name is 'Adventure'$")
    public void userVerifyNameIsAdventure() {
        response.body("data.pots[0].name", equalTo("Adventure"));

    }
}
