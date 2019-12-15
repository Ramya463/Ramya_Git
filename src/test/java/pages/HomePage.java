package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//input[@id='keywords']")
    private WebElement searchbox;

    public void print_noofprod(){

        int no_of_products=noOfProducts.size();
        System.out.println(no_of_products);

    }

    public void searchItem(String searchValue){
        searchbox.sendKeys(searchValue);
        searchbox.sendKeys(Keys.ENTER);

    }

    public void check_products(){

    }

    public AddToCart cartPage(){
        DriverManager.driver.findElement(By.xpath("//span[contains(text(),'Ruby on Rails Bag')]")).click();

        return new AddToCart();
    }

}
