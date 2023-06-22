Feature: Verify Region setting functionality

Scenario Outline:  Verify Region setting  functionality of Alibaba
Given I am in landing page
When  I input data into scarch box <rownumber>
Then  I click on scarch button
Then I get back to the landing page
#When I mouseHover on region setting
#And I select languauge as Hindi
#And I select currency as INR
#Then I click save button

Examples:      
	    |rownumber|
	    |0        |
			|1        |
			|2        |
  
  
  
  