package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import util.ConfigFileReader;
import util.DriverManager;

public class SuiteManager {

    DriverManager driverManager;
    public static ConfigFileReader config=new ConfigFileReader();

    @BeforeSuite(alwaysRun = true)
    public void StartDriver(){
        driverManager = new DriverManager();
    }

    @AfterSuite(alwaysRun = true)
    public void quitDriver(){
        DriverManager.driver.quit();
    }

    @BeforeClass
    public void launchUrl(){
        DriverManager.driver.manage().window().maximize();
        String baseUrl=config.getProperty("base_url");
        DriverManager.driver.get(baseUrl);


    }
}
