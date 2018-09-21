Feature: Searching on Google

@google
Scenario: Search for Iphone X on Google
	Given the user is on Google home Page
	When the user enters "Iphone X" and hits search button 
	Then the user should able to see the result of the search