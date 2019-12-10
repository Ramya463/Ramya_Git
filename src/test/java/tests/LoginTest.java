package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import suite.SuiteManager;
import testdata.logincredentials;
import util.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SuiteManager {

    @BeforeTest
    public void get_usr_and_pwd(){

        //String username=config.getProperty("username");
        //String password=config.getProperty("password");

    }

    @Test(dataProvider = "logincredentials",dataProviderClass = logincredentials.class)
    public void Login(String user_id,String pwd){

        String loginlink="//a[text()='Login']";
        String username_txtbox="spree_user_email";
        String password_txtbox="spree_user_password";

        String loginbtn_name="commit";



        DriverManager.driver.findElement(By.xpath(loginlink)).click();
        DriverManager.driver.findElement(By.id(username_txtbox)).sendKeys(user_id);
        DriverManager.driver.findElement(By.id(password_txtbox)).sendKeys(pwd);
        DriverManager.driver.findElement(By.name(loginbtn_name)).click();

    }

    @Test
    public void searchitem(){


        String searchbox="keywords";

        String search_value=config.getProperty("searchitem");
        System.out.println(search_value);
        DriverManager.driver.findElement(By.id(searchbox)).sendKeys(search_value);


        DriverManager.driver.findElement(By.id(searchbox)).sendKeys(Keys.RETURN);


    }
}