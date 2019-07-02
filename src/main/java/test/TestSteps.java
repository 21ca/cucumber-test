package test;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestSteps {
	private int score = 0;
	
	@Before
	public void init() {
		System.out.println("Init in @Before");
	}
	
	@Given("I got 100") 
	public void got100() {
		System.out.println("I got 100 in the test.");
		score = 100;
	}
	
	@Given("I got 90") 
	public void got90() {
		System.out.println("I got 90 in the test.");
		score = 90;
	}
	
	@Then("I win") 
	public void win() {
		System.out.println("I win, I win.");
		Assert.assertEquals(100, score);
	}
	
	@After
	public void clean() {
		System.out.println("clean in @After");
	}
	
}
