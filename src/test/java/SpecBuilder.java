import static helpers.PropertyLoader.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class SpecBuilder {
    public static RequestSpecBuilder reqBuilder;
    public static RequestSpecification requestSpecBuilder() throws IOException {
        reqBuilder = new RequestSpecBuilder();
        reqBuilder.setBaseUri(getProperty("baseUrl")).setBasePath(getProperty("listUserBasePath")).build();
        return reqBuilder.build();
    }
}
