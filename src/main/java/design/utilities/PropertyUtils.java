package design.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    private static Logger LOGGER = LoggerFactory.getLogger(PropertyUtils.class);

    public static Properties loadProperties() {
        Properties props = new Properties();
        String fileLocation = System.getProperty("user.dir") + "/src/test/resources/config.properties";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            props.load(bufferedReader);
        } catch (IOException e) {
            LOGGER.error("Failed to load config file from location: " + fileLocation);
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration properties. ABORT!");
        }
        return props;
    }
}
