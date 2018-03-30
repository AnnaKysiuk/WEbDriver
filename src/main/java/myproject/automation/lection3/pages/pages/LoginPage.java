package myproject.automation.lection3.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.id("email");
    private By loginInput = By.id("passwd");
    private By loginBtn = By.name("submitLogin");
    private String email = "";
    private String Login = "";

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void open(){
        driver.get();
    }

    private void fillEmailInput(){
        driver.findElement(emailInput).sendKeys(email);
    }

    private void fillLoginInput(){
        driver.findElement(loginInput).sendKeys(Login);
    }

    private void fillLoginBtn(){
        driver.findElement(loginBtn).click();
    }
}
