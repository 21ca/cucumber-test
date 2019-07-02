package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:datatable.feature", glue = "classpath:test", plugin = "html:reports")
public class DataTableTest {

}
