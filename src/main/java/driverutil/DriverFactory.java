package driverutil;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory implements DriverSource {

    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    @Override
    public WebDriver newDriver() {
        return new ChromeDriver(getChromeOptions());
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }

    public ChromeOptions getChromeOptions () {
        boolean headlessMode = Boolean.parseBoolean(environmentVariables.getProperty("headless.mode"));
        String binaryPath = environmentVariables.getProperty("webdriver.chrome.driver");
        String binaryAbsolutePath = new File(binaryPath).getAbsolutePath();
        String proxyPacUrl = environmentVariables.getProperty("proxy.pac.url");
        String userDataPath = environmentVariables.getProperty("user.data");
        String profile = environmentVariables.getProperty("profile");
        String scaleFactor = environmentVariables.getProperty("browser.scale.factor");


        System.setProperty("webdriver.chrome.driver", binaryAbsolutePath);
        System.setProperty("webdriver.chrome.verboseLogging", "true");

        ChromeOptions chromeOptions = new ChromeOptions();

        if (headlessMode) {
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--remote-debugging-port=9222");
            chromeOptions.addArguments("--window-size=1920,1080");
        } else {
            chromeOptions.addArguments("--start-maximized");
        }

        if (scaleFactor != null) {
            chromeOptions.addArguments("force-device-scale-factor=" + scaleFactor);
        }

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--test-type");
        chromeOptions.addArguments("--lang=en-US");

//        chromeOptions.addArguments("--proxy-server='direct://'");
//        chromeOptions.addArguments("--proxy-bypass-list=*");
//        chromeOptions.addArguments("--proxy-auto-detect");

        if (profile != null) {
            chromeOptions.addArguments("user-data-dir=" + userDataPath);
            chromeOptions.addArguments("--profile-directory=" + profile);
        }

        if (proxyPacUrl != null) {
            Proxy proxy = new Proxy();
            proxy.setProxyAutoconfigUrl(proxyPacUrl);
            chromeOptions.setProxy(proxy);
            chromeOptions.setCapability("proxy", proxy);
        }

        String downLoadDirectory = environmentVariables.getProperty("download.default_directory");
        String downLoadDirectoryAbsolutePath = new File(downLoadDirectory).getAbsolutePath();
        Map<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downLoadDirectoryAbsolutePath);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        chromeOptions.setAcceptInsecureCerts(true);


        return chromeOptions;
    }

}
