package factory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory implements RemoteManager{

    @Override
    public RemoteWebDriver getDriver() {
        RemoteWebDriver driver = null;
        try {
            URL remoteUrl = new URL("http://localhost:4444");
            driver = new RemoteWebDriver(remoteUrl, new ChromeOptions());
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
        return driver;
    }
}
