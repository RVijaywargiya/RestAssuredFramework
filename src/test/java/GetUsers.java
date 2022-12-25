import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

public class GetUsers {

    public static Response getUsers() throws IOException {
        return RestAssured
                .given(SpecBuilder.requestSpecBuilder())
                .get();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getUsers().asString());
    }
}
