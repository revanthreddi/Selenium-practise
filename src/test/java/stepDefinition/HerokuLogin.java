package stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HerokuLogin {
    WebDriver driver;

    @Given("User opens Application$")
    public void user_opens_application() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://http://the-internet.herokuapp.com/login");
        System.out.println("Executed Given");

//        throw new PendingException();
    }

    @When("User provide username and Password$")
    public void user_provide_username_and_password() throws Throwable {
        System.out.println("Executed When");
//        throw new PendingException();
    }

    @Then("User is able to login$")
    public void user_is_able_to_login() throws Throwable {
        driver.quit();
        System.out.println("Executed Then");
//        throw new PendingException();
    }

}
