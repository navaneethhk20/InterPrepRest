package org.example.tests.CRUD.PracticeAPI;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class TestPositivetest {


    @Test
    public void testNOnBdd(){
        String pincode5 = "560066";
        RestAssured.given().baseUri("http://api.zippopotam.us")
                .basePath("/IN/" + pincode5).when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
