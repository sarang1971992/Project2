package factory;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

	static Logger logger;
	static WebDriver driver;
	static Properties prop;

	public static WebDriver initializeDriver() throws IOException {

		prop = getProperties();
		String execution_env = prop.getProperty("execution_env");
		String oss = prop.getProperty("os");
		String browser = prop.getProperty("browser");

		if (execution_env.equalsIgnoreCase("remote")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();

			switch (oss) {

			case "mac":
				capabilities.setPlatform(Platform.MAC);
				break;
			case "windows":
				capabilities.setPlatform(Platform.WINDOWS);
				break;
			case "linux":
				capabilities.setPlatform(Platform.LINUX);
				break;
			default:
				System.out.println("out of operating system");
				return null;

			}

			switch (browser) {
                         //kya re bhai
			case "firefox":
				capabilities.setPlatform(Platform.MAC);
				break;
			case "chrome":
				capabilities.setPlatform(Platform.WINDOWS);
				break;
			case "edge":
				capabilities.setPlatform(Platform.LINUX);
				break;
			default:
				System.out.println("out of browser");
				return null;
			}

			driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);

		} else if (execution_env.equalsIgnoreCase("local")) {

			switch (browser) {

			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("out of browser");
				return driver;

			}
		}

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		return driver;
	}

	public static Properties getProperties() throws IOException {

		FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		prop = new Properties();

		prop.load(file);

		return prop;

	}

	public static String getNumericValues() {

		String randomnumber = RandomStringUtils.randomNumeric(5);
		return randomnumber;

	}

	public static String getAlpabets() {

		String randomnumber = RandomStringUtils.randomAlphabetic(5);
		return randomnumber;
	}

	public static String getAlphanumeric() {

		String randomnumber = RandomStringUtils.randomNumeric(5);
		String randomstring = RandomStringUtils.randomAlphabetic(5);
		return randomnumber + randomstring;
	}

	public static Logger getLogger() {

		Logger getlogger = LogManager.getLogger();
		return getlogger;

	}

	public static WebDriver getDriver() {

		return driver;
	}
}
