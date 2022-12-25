import io.restassured.RestAssured;

public class GetUsers {

    public static void getUsers() {
        RestAssured.baseURI = "https://reqres.in/";

        RestAssured.given()
                .baseUri("https://reqres.in/")
                .when()
                .get("api/users?page=2")
                .then()
                .log()
                .all();
    }

    public static void main(String[] args) {
        getUsers();
    }
}
