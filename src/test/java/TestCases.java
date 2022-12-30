import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class TestCases {

    public static String getUsers() throws IOException {
        return given(new GetUsersSpecBuilder().requestSpecBuilder())
                .get()
                .then()
                .log()
                .all().toString();
    }

    public static String postUser() throws IOException {
        return given(new PostUserSpecBuilder().requestSpecBuilder())
                .post()
                .then()
                .log()
                .all().toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getUsers());
        System.out.println("----------------------");
        System.out.println(postUser());
    }
}
