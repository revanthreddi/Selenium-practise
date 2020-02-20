package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    WebDriver driver;
    By Username = By.id("username");
    By Password = By.id("password");
    By LoginButton = By.xpath("//*[@id=\"login\"]/button/i");
    By GetTextAfterLogin = By.xpath("//*[@id=\"content\"]/div/h4");
    By logoutButton = By.xpath("//*[@id=\"content\"]/div/a/i");

    // constructor here helps to use this objects in main page
    public loginpage(WebDriver driver) {
        this.driver = driver;
//    By logout = By.xpath()
//    By url =
    }

    public WebElement username() {
        return driver.findElement(Username);
    }

    public WebElement password() {
        return driver.findElement(Password);
    }

    public WebElement submit() {
        return driver.findElement(LoginButton);
    }

    public WebElement textVerification() {
        return driver.findElement(GetTextAfterLogin);
    }

    public WebElement logoutButton() {
        return driver.findElement(logoutButton);
    }

}
