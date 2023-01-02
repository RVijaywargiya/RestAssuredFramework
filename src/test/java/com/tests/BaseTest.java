package com.tests;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.given;

public class BaseTest {

    @BeforeMethod
    public void setUp() {

    }

    @AfterMethod
    public void tearDown() {

    }


}
