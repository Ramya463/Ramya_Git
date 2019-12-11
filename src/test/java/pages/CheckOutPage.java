package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class CheckOutPage extends SuiteManager {

    public void CheckOutPage() {
        PageFactory.initElements(DriverManager.driver, this);
    }

}
