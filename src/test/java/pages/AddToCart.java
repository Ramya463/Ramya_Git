package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class AddToCart extends SuiteManager {

    public void AddToCart() {
        PageFactory.initElements(DriverManager.driver, this);
    }

    @FindBy(id="add-to-cart-button")
    private WebElement add_to_cart;

    public CheckOutPage Click_AddtoCart(){
        add_to_cart.click();
        return new CheckOutPage();
    }
}
