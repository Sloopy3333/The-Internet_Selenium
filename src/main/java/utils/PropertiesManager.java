package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    public static String getByKey(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config.properties");
        prop.load(fis);
        return prop.get(key).toString();
    }

}
