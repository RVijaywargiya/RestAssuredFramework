import helpers.PropertyLoader;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class PostUserSpecBuilder implements SpecBuilder {

    String requestBody = "{\n" +
            "  \"email\": \"eve.holt@reqres.in\",\n" +
            "  \"password\": \"pistol\"\n" +
            "}";

    @Override
    public RequestSpecification requestSpecBuilder() throws IOException {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(PropertyLoader.getProperty("baseUrl"))
                .setBasePath(PropertyLoader.getProperty("postUserBasePath"))
                .setBody(requestBody)
                .build();
    }
}