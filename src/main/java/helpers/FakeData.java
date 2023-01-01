package helpers;

import com.github.javafaker.Faker;

public class FakeData {

    private static final Faker faker = new Faker();
    public static String getFakeFirstName() {
        return faker.name().firstName();
    }

    public static String getFakeLastName() {
        return faker.name().lastName();
    }

    public static String getFakeEmail() {
        return getFakeFirstName()+getFakeLastName()+"@gmail.com";
    }
}
