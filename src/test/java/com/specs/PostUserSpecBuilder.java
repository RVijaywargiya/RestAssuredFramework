package com.specs;

import helpers.FakeData;
import helpers.PropertyLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
//import net.minidev.json.JSONObject;
import org.json.JSONObject;

import java.io.IOException;

public class PostUserSpecBuilder implements SpecBuilder {

    public static void createPayload() {
        JSONObject jsonObject = new JSONObject();

    }
    String userName = FakeData.getFakeFirstName();
    String email = FakeData.getFakeEmail();

    @Override
    public RequestSpecification requestSpecBuilder() throws IOException {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(PropertyLoader.getProperty("baseUrl"))
                .setBasePath(PropertyLoader.getProperty("postUserBasePath"))
                .build();
    }
}