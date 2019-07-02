package test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class DataTableSteps {	
	@Given("^I have a list of students$") 
	public void students(DataTable table) {
		System.out.println(table.asMaps());
	}
	
}
