package co.com.choucair.certification.angular_store.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/upload_file.feature",
        tags = "@regresion",
        glue = {"co.com.choucair.certification.angular_store.stepsdefinitions", "co.com.choucair.certification.angular_store.util"},
        snippets = SnippetType.CAMELCASE)
public class ProductDetail {

}
