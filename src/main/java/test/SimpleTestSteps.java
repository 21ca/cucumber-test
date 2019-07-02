package test;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SimpleTestSteps {
	private int score = 0;
	
	@Before("@simpletest")
	public void init() {
		score = 0;
		System.out.println("Init in @Before");
	}
	
	@Given("^I got score ([^\"]*)$") 
	public void gotScore(int score) {
		System.out.println("I got " + score + " in the test.");
		this.score = score;
	}
	
	@Given("I got full score") 
	public void got100() {
		System.out.println("I got 1000 in the test.");
		score = 100;
	}
	
	@Then("^I win$") 
	public void win() {
		System.out.println("I win, I win.");
		Assert.assertEquals(100, score);
	}
	
	@Given("^I got 100 for Math$") 
	public void math100() {
		System.out.println("I got 100 for Math");
	}
	
	@And("^I got 100 for English$") 
	public void english100() {
		System.out.println("I got 100 for English");
	}
	
	@Then("^I got two 100$") 
	public void gotTwo100() {
		System.out.println("I got two 100!");
	}
	
	@After("@simpletest")
	public void clean() {
		System.out.println("clean in @After");
	}
	
}
