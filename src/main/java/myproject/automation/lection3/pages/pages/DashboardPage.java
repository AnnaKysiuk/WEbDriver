package myproject.automation.lection3.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private WebDriver driver;
    private By iserIcon = By.id("");
    private By exitBtn = By.id("");

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnIserIcon(){
        driver.findElement(iserIcon).click();
    }

    public void clickOnExitBtn(){
        driver.findElement(exitBtn).click();
    }
}

