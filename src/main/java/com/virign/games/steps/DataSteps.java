package com.virign.games.steps;

import com.virign.games.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DataSteps {

    @Step()
    public ValidatableResponse getInfoByData() {
        return SerenityRest.given()
                .when().get(EndPoints.GET_ALL_BY_DATA)
                .then().log().all();


    }

}
