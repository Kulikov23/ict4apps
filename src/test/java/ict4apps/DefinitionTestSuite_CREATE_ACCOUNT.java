package ict4apps;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/CREATE_ACCOUNT_PAGE.feature",
})
public class DefinitionTestSuite_CREATE_ACCOUNT {}