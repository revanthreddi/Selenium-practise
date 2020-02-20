package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    WebDriver driver;
    // Page factory model

    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    By Username = By.id("username");
    public WebElement username() {
        return driver.findElement(Username);
    }

    By Password = By.id("password");
    public WebElement password() {
        return driver.findElement(Password);
    }

    By LoginButton = By.xpath("//*[@id=\"login\"]/button/i");
    public WebElement submit() {
        return driver.findElement(LoginButton);
    }

    By GetTextAfterLogin = By.xpath("//*[@id=\"content\"]/div/h4");
    public WebElement textVerification() {
        return driver.findElement(GetTextAfterLogin);
    }

    By logoutButton = By.xpath("//*[@id=\"content\"]/div/a/i");
    public WebElement logoutButton() {
        return driver.findElement(logoutButton);
    }

    // constructor here helps to use this objects in main page
}
