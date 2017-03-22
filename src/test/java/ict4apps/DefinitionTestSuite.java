package ict4apps;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/1WELCOME_PAGE.feature",
        "src/test/resources/features/2PRODUCTS_PAGE.feature",
        "src/test/resources/features/3SPECIAL_OFFERS_PAGE.feature",
        "src/test/resources/features/4BLOGS_PAGE.feature",
        "src/test/resources/features/5CONTACT_US_PAGE.feature",
        "src/test/resources/features/FOOTER.feature"
})
public class DefinitionTestSuite {
}
