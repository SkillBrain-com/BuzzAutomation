package homework.edinita.seleniumBasicPartOne_Homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read_Config_File {
    private static Logger LOGGER = LoggerFactory.getLogger(Read_Config_File.class);

    public static Properties readConfigFile() {
        LOGGER.debug("Reading config file");
        Properties props = new Properties();
        String fileLocation = System.getProperty("user.dir") + "/src/test/java/seleniumBasicPartOne_Homework/config.properties";
        try {
            LOGGER.debug("Loading config file from location: " + fileLocation);
            BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
            props.load(reader);
        } catch (IOException e) {
            LOGGER.error("Failed to load config file from location: " + fileLocation);
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration properties. ABORT");
        }
        return props;
    }


}
