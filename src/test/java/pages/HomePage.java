package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

import java.util.List;

public class HomePage extends SuiteManager {

    public  HomePage() {

        PageFactory.initElements(DriverManager.driver, this);
    }

    @FindBy(xpath = "//div[contains(@id,'product_')]")
    private List<WebElement> noOfProducts;

    public void print_noofprod(){

        int no_of_products=noOfProducts.size();
        System.out.println(no_of_products);

    }

    public AddToCart cartPage(){

        return new AddToCart();
    }

}
