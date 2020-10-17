package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleSearchStepDefinitions {

    GooglePage google = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @Given("user search for {string}")
    public void user_search_for(String string) {
        google.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String pageTitle = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(pageTitle.contains(string));
        Assert.fail();
    }
}
