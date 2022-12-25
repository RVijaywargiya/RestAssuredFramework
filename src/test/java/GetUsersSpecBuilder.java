import static helpers.PropertyLoader.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class GetUsersSpecBuilder implements SpecBuilder{
    @Override
    public RequestSpecification requestSpecBuilder() throws IOException {
        return new RequestSpecBuilder().setBaseUri(getProperty("baseUrl"))
                .setBasePath(getProperty("listUserBasePath"))
                .addQueryParam(getProperty("listUserQueryParamName"), getProperty("listUserQueryParamValue"))
                .build();
        }
}
