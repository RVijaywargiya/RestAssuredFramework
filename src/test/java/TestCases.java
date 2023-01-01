import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

public class TestCases extends BaseTest {

    public static String getUsers() throws IOException {
        return given(new GetUsersSpecBuilder().requestSpecBuilder())
                .get()
                .then()
                .log()
                .all().toString();
    }

    public static String postUser() throws IOException {
        return given(new PostUserSpecBuilder().requestSpecBuilder())
                .body(new File("src/test/resources/Payloads/CreateUser.json"))
                .post()
                .then()
                .log()
                .all().toString();
    }

    public static void main(String[] args) throws IOException {

        System.out.println(postUser());
//        System.out.println("----------------------");
        System.out.println(getUsers());
    }
}
