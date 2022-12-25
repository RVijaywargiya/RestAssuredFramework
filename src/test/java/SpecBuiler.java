import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class SpecBuiler {
    public static RequestSpecBuilder reqBuilder;
    public static RequestSpecification reqSpec;
    public static RequestSpecification requestSpecBuilder() {
        reqBuilder = new RequestSpecBuilder();
        reqBuilder.setBaseUri("https://reqres.in/").setBasePath("api/users?page=2").build();
        return reqBuilder.build();
    }
}
