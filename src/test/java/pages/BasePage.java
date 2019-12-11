package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.DriverManager;

public class BasePage extends SuiteManager {

    public BasePage(){
        PageFactory.initElements(DriverManager.driver,this);
    }

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginButton;


    public LoginPage clickLoginButton(){
        loginButton.click();
        return new LoginPage();
    }
}
