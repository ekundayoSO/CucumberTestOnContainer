package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestBase {
    public static Properties CONFIG = null;
    public static WebDriver driver = null;

    public void initialize() throws IOException {
        if (driver == null) {
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);

            String browser = CONFIG.getProperty("browser");
            DesiredCapabilities capabilities;

            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    capabilities = new DesiredCapabilities();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    capabilities.merge(firefoxOptions);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    capabilities = new DesiredCapabilities();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    capabilities.merge(edgeOptions);
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    capabilities = new DesiredCapabilities();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    capabilities.merge(chromeOptions);
                    break;
            }

            String gridUrl = CONFIG.getProperty("grid_url");
            driver = new RemoteWebDriver(new URL(gridUrl), capabilities);

        }
    }
}
