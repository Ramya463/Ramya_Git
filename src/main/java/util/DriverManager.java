package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class DriverManager {

    public static WebDriver driver;
    /*public static final String USERNAME = "ramyakrishnapang1";
    public static final String AUTOMATE_KEY = "uzXnAsR4cfzZq1Yyhsm5";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";*/

    public  DriverManager(){
        /*DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 8 Plus");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "11");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://spree-vapasi-prod.herokuapp.com/");*/

       String chromeDriverPath=System.getProperty("user.dir")+"/"+"src/main/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}
