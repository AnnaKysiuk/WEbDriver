package myproject.automation.lection3.pages.pages;

import org.openqa.selenium.WebDriver;

public class MyTest {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillEmailInput();
        loginPage.fillLoginInput();
        loginPage.fillLoginBtn();


        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickOnExitBtn();
        dashboardPage.clickOnIserIcon();

        quiteDriver(driver);


    }
}
