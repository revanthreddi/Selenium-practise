package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/revan/workspace/Selenium-practise/src/test/java/featureFiles/", glue={"stepDefinition"})
public class CucumberRunner {

}