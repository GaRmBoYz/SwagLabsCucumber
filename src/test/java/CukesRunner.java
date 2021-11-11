import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cukesReport.html",
                "rerun:target/failed-scenarios/cukes.txt"},
        features = "src/main/resources/features",
        glue = {"stepDefinitions"},
        stepNotifications = true,
        tags = "@ScenarioOutline"
)
public class CukesRunner {}