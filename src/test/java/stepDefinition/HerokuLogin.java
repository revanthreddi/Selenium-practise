package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageRepository.loginpage;

/*
To import login page into Page factory follow these steps
1. Create constructor with parameter
2. Add objects into constructor
3. Create object in other page
 */

// TODO Move objects into Page Factory


public class HerokuLogin {



    String Expected = "Welcome to the Secure Area. When you are done click logout below.";
    WebDriver driver;

    // Open Browser and open webpage using Cucumber-Given
    @Given("User opens Application$")
    public void user_opens_application() throws Throwable {
        // WebDriver manager to get Chrome capabilities
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Open Web page
        driver.get("http://the-internet.herokuapp.com/login");

        System.out.println("Executed Given");
        loginpage login;

//        throw new PendingException();
    }

    // Enter username and password using When
    @When("User provide username and Password$")
    public void user_provide_username_and_password() throws Throwable {
        // Create object for Page factory
        loginpage login = new loginpage(driver);
        // Send Username and password using page object
        login.username().sendKeys("tomsmith");
        login.password().sendKeys("SuperSecretPassword!");
        login.submit().click();
        Thread.sleep(5000);


        System.out.println("Executed When");
//        throw new PendingException();
    }

    // Check if the testcase is passed or not
    @Then("User is able to login$")
    public void user_is_able_to_login() throws Throwable {
        loginpage login = new loginpage(driver);
        String text = login.textVerification().getText();
        if (text.equalsIgnoreCase(Expected)) {
            System.out.println("Test Passed");
            login.logoutButton().click();
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
        System.out.println("Executed Then");
//        throw new PendingException();
    }

}
