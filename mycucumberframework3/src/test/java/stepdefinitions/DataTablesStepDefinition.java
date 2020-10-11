package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinition {

    DataTablePage dataTablePage=new DataTablePage();

    @Given("user is on the datatables page")
    public void user_is_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));
    }
    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();
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
        dataTablePage.position.sendKeys("Manager");
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
        dataTablePage.startDate.sendKeys("2020-10-04", Keys.ENTER);
    }
    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salary.sendKeys("1000000");
    }
    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createButton.click();
    }
    @When("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys("Jonny");
    }
    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Jonny"));
    }
    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dataTablePage.firstName.sendKeys(string);
    }
    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dataTablePage.lastName.sendKeys(string);
    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablePage.position.sendKeys(string);
    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dataTablePage.office.sendKeys(string);
    }
    @When("user enters the extension {string}")
    public void user_enters_the_extension(String string) {
        dataTablePage.extension.sendKeys(string);
    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dataTablePage.startDate.sendKeys(string, Keys.ENTER);
    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablePage.salary.sendKeys(string);
    }
    @When("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        dataTablePage.searchBox.sendKeys(string);
    }
    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String string) throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains(string));
    }
}
