package com.tests;

import com.specs.GetUsersSpecBuilder;
import com.specs.PostUserSpecBuilder;
import org.testng.annotations.Test;

import static com.fetch.data.Payloads.getPayload;
import static io.restassured.RestAssured.*;

import java.io.IOException;

public class TestCases extends BaseTest {

    @Test
    public void getUsers() throws IOException {
        given(new GetUsersSpecBuilder().requestSpecBuilder())
                .get()
                .then()
                .log()
                .all();
    }

    @Test
    public void postUser() throws IOException {
        given(new PostUserSpecBuilder().requestSpecBuilder())
                .body(getPayload("src/test/resources/Payloads/CreateUser.json"))
                .post()
                .then()
                .log()
                .all();
    }
}
