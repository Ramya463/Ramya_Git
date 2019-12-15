package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class AddToCart extends SuiteManager {

    public AddToCart() {
        PageFactory.initElements(DriverManager.driver, this);
    }

   /* @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement add_to_cart;*/


    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement cart_add;

    public CheckOutPage Click_AddtoCart(){
        cart_add.click();
        return new CheckOutPage();
    }
}
