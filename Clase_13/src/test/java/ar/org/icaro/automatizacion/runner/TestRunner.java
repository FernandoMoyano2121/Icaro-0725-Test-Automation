package ar.org.icaro.automatizacion.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue={
                "ar.org.icaro.automatizacion.runner",
                "ar.org.icaro.automatizacion.steps"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        monochrome = false,
        tags = ""

)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}