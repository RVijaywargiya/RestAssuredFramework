import helpers.PropertyLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class PostUserSpecBuilder implements SpecBuilder {

    @Override
    public RequestSpecification requestSpecBuilder() throws IOException {
        return new RequestSpecBuilder().setBasePath(PropertyLoader.getProperty("postUserBasePath"))
                .setBody("""
                {"name": "morpheus",
                    "job": "leader"
                }""").build();
    }
}
