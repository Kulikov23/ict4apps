package ict4apps;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/WELCOME_PAGE.feature",
        "src/test/resources/features/PRODUCTS_PAGE.feature",
        "src/test/resources/features/SPECIAL_OFFERS_PAGE.feature",
        "src/test/resources/features/BLOGS_PAGE.feature",
        "src/test/resources/features/CONTACT_US_PAGE.feature",
        "src/test/resources/features/FOOTER.feature",
        "src/test/resources/features/HEADER.feature",
        "src/test/resources/features/SCROLLED_HEADER.feature",
        "src/test/resources/features/BREADCRUMB.feature"
})
public class DefinitionTestSuite {
}
