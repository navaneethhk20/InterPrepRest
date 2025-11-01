package org.example.tests.PracticeAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class ReuseBDD {
    RequestSpecification rs;
    Response r;
    ValidatableResponse vr;

    @Test
    public void positive(){
        rs = RestAssured.given();
                rs.baseUri("https:// api.zippopotam.us").basePath("/IN/573129");
        r = rs.when().log().all().get();
        vr = r.then().log().all().statusCode(200);
    }


}
