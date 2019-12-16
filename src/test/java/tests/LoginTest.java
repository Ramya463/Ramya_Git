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


    }


}