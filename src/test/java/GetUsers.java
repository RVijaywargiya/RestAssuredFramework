import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsers {

    public static Response getUsers() {
        return RestAssured
                .given(SpecBuiler.requestSpecBuilder())
                .get();
    }

    public static void main(String[] args) {
        System.out.println(getUsers().asString());
    }
}
