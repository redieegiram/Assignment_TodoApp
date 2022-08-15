Feature: To Do App Assignment

	Background:
	Given the user launches the application
	And the user verifies the header
	
  Scenario: Add task in to-do list
  When the user enters "Task" task
  And the user clicks on add button
  Then the user verifies the list count as 1
  
  Scenario: Add multiple task in to-do list
  
  When the user enters "Test1" task
  And the user clicks on add button
  When the user enters "Test2" task
  And the user clicks on add button
  When the user enters "Test3" task
  And the user clicks on add button
  Then the user verifies the list count as 3  
  
  Scenario: Clear all task in to-do list
  
  When the user enters "Clear Task" task
  And the user clicks on clear all button
  Then the user verifies the empty list  
  
  