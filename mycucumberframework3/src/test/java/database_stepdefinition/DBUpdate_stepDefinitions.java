package database_stepdefinition;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBUpdate_stepDefinitions {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }

    @Given("user updates Email as {string} when IDHotel is {int}")
    public void user_updates_Email_as_when_IDHotel_is(String string, Integer int1) throws SQLException {
        //Writing the query
        String query = "SELECT Email FROM dbo.tHOTEL";
        //Executing the query
        DBUtils.executeQuery(query);
        //Skip teh first 3 lines. We should use rsultset to skip
        //resultSet=>Driver.getResult
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();
        DBUtils.getResultset().next();

        String updateQuery="UPDATE dbo.tHOTEL SET Email = '"+string+"' WHERE IDHotel="+int1+"";
        DBUtils.executeQuery(updateQuery);

        while (DBUtils.getResultset().next()){
            String str=DBUtils.getResultset().getString("Email");
            System.out.println(str);
        }

    }
}
