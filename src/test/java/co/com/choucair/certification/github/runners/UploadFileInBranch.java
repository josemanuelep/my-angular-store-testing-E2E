package co.com.choucair.certification.github.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/upload_file.feature",
        tags = "@tag1",
        glue = {"co.com.choucair.certification.github.stepsdefinitions", "co.com.choucair.certification.github.util"},
        snippets = SnippetType.CAMELCASE)
public class UploadFileInBranch {
}
