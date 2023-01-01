package com.specs;

import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public interface SpecBuilder {

    RequestSpecification requestSpecBuilder() throws IOException;
}
