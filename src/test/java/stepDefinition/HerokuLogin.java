package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HerokuLogin {
    WebDriver driver;
    String Expected = "Welcome to the Secure Area. When you are done click logout below.";

    @Given("User opens Application$")
    public void user_opens_application() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        System.out.println("Executed Given");

//        throw new PendingException();
    }

    @When("User provide username and Password$")
    public void user_provide_username_and_password() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

        System.out.println("Executed When");
//        throw new PendingException();
    }

    @Then("User is able to login$")
    public void user_is_able_to_login() throws Throwable {
        String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h4")).getText();
        if (text.equalsIgnoreCase(Expected)) {
            System.out.println("Test Passed");
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
        System.out.println("Executed Then");
//        throw new PendingException();
    }

}
