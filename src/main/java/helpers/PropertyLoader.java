package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyLoader {
    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(new File("src/main/resources/config/config.properties"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static Properties properties = new Properties();
    static String propertyValue;

    public static String getProperty(String propertyName) throws IOException {
        properties.load(fis);
        propertyValue = properties.getProperty(propertyName);
        return propertyValue;
    }

    public PropertyLoader() throws FileNotFoundException {
    }
}
