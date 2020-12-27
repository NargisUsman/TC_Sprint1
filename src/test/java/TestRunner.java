import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //path to my feature files
        features = {"src/test/resources/features"},

        //specify the stepdefinition package name
        glue = {"stepDefinition", "DriverWrapper"},

        //which ever tag I want to run I specify here
        tags = {"@regression", "@sanity", "@smoke"},

        // to make logs on console readable
        monochrome = true,

        //This creates cucumber reports
        plugin = {"pretty", "html:Reports/Default/"},

        //This creates auto method name in camelCase
        snippets = SnippetType.CAMELCASE

)
public class TestRunner {

}



