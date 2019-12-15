package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class CheckOutPage extends SuiteManager {

    public CheckOutPage() {
        PageFactory.initElements(DriverManager.driver, this);
    }


    @FindBy(xpath = "//button[@name='checkout']")
    private WebElement check_out;

    public void click_checkout(){

        check_out.click();

    }



}
