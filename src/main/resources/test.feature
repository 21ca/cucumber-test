@simpletest
Feature: My first test feature

	Scenario: I win if I got 100 in the test
		Given I got score 100
		Then I win
		
	Scenario: I win if I got full score in the test
		Given I got full score
		Then I win
		
	Scenario: I win if I got 90 in the test
		Given I got score 90
		Then I win
		
	Scenario: I got two 100
		Given I got 100 for Math
		And I got 100 for English
		Then I got two 100
