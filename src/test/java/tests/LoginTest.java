package tests;

import org.testng.annotations.*;
import pages.*;
import suite.SuiteManager;
import util.ConfigFileReader;

public class LoginTest extends SuiteManager {

    public BasePage basePage;
    public LoginPage loginPage;
    public HomePage homePage;
    public AddToCart addCartPage;
    public CheckOutPage checkOut;
    ConfigFileReader config=new ConfigFileReader();

    @Test/*(dataProvider = "logincredentials",dataProviderClass = logincredentials.class)*/
    public void Login(){

        basePage =new BasePage();
        loginPage=basePage.clickLoginButton();



        String user_name=config.getProperty("username");
        String pword=config.getProperty("password");
        String searchValue=config.getProperty("searchitem");

       homePage=loginPage.login(user_name,pword);//logging in with username and password
       homePage.searchItem(searchValue);//Search using a keyword
       homePage.print_noofprod();//Printing number of products
       homePage.check_products(searchValue);//validating the products
       addCartPage=homePage.cartPage();//getting the cart page
       checkOut=addCartPage.Click_AddtoCart();//clicking on add cart and move to cart details page
       checkOut.click_checkout();//check out of cart items









        /*String loginlink="//a[text()='Login']";
        String username_txtbox="spree_user_email";
        String password_txtbox="spree_user_password";

        String loginbtn_name="commit";



        DriverManager.driver.findElement(By.xpath(loginlink)).click();
        DriverManager.driver.findElement(By.id(username_txtbox)).sendKeys(user_id);
        DriverManager.driver.findElement(By.id(password_txtbox)).sendKeys(pwd);
        DriverManager.driver.findElement(By.name(loginbtn_name)).click();*/

    }

   /* @Test
    public void searchitem(){


        String searchbox="keywords";

        String search_value=config.getProperty("searchitem");
        System.out.println(search_value);
        DriverManager.driver.findElement(By.id(searchbox)).sendKeys(search_value);


        DriverManager.driver.findElement(By.id(searchbox)).sendKeys(Keys.RETURN);
        List<WebElement> Product_list=DriverManager.driver.findElements(By.xpath("//div[contains(@id,'product_')]"));
        System.out.println(Product_list);


    }*/
}