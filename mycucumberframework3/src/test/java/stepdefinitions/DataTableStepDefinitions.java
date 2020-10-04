package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTableStepDefinitions {

    DataTablePage dataTable = new DataTablePage();

    DataTablePage dataTablePage = new DataTablePage();

    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));
    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newBtn.click();
    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dataTablePage.firstName.sendKeys("Jonny");
    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastName.sendKeys("Walker");
    }

    @When("user enters the position")
    public void user_enters_the_position() {
        dataTablePage.position.sendKeys("sdet");
    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.office.sendKeys("Toronto");
    }

    @When("user enters the extension")
    public void user_enters_the_extension() {
        dataTablePage.extension.sendKeys("12345");
    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dataTablePage.startDate.sendKeys("2020-10-04");
    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salary.sendKeys("1000000");
    }

    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createBtn.click();
    }

    @When("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys("Jonny");
    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Jonny"));
    }

}
