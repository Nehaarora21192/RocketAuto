package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentUtil {

    public String getEnvProperty(String propertyKey) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/environments/" + System.getProperty("environment") + ".properties"));
        return properties.getProperty(propertyKey);
    }
}
