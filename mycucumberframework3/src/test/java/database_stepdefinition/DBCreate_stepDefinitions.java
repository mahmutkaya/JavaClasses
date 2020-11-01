package database_stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

public class DBCreate_stepDefinitions {

    @Given("create a new hotel with the new data")
    public void create_a_new_hotel_with_the_new_data() {
        String create="INSERT INTO dbo.tHOTEL " +
                "(Code, Name, Address, Phone, Email, IDGroup, CreateDate,CreateUser) " +
                "VALUES ('000', '6zzz9', 'a-a-a-a', '69', 'eeee@eeee.com', 10012, '2023-10-04 13:38:47.597',999)";
        DBUtils.executeQuery(create);
    }
    @Then("verify if the hotel is created")
    public void verify_if_the_hotel_is_created() {
        String read="SELECT Name FROM dbo.tHOTEL";
        //getColumnData is returning the list of data in certain column.
        //DBUtils.getColumnData(read,"Name").toString() will return ALL NAMES from the dbo.tHOTEL table
        Assert.assertTrue(DBUtils.getColumnData(read,"Name").toString().contains("6zzz9"));

        DBUtils.closeConnection();
    }

}
