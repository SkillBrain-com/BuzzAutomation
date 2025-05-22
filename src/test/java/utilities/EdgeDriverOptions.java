package utilities;

import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdgeDriverOptions {

    private static Logger LOGGER = LoggerFactory.getLogger(EdgeDriverOptions.class);

    public static EdgeOptions getEdgeOptions() {
        LOGGER.debug("Starting Edge Options...");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--disable-notifications");
        edgeOptions.addArguments("--disable-search-engine-choice-screen");
        edgeOptions.addArguments("--disable-popup-blocking");
        LOGGER.debug("Edge options setup successfully...");
        return edgeOptions;
    }
}
