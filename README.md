Class Batsman is given to you. Add below details to the class

1. Instance variables:
	name: String,
	runs: int,
	matches: int,
	batting_avg: float.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, runs, matches.
4. Create below methods,

	Method name: computeBattingAverage
	Return type: void
	
	This method should print the batting average of the batsman by dividing run with matches.
	Input: "Sachin", 18000, 463
	Output: 

		Name: Sachin
		Batting_Avg: 38.87689

	Note: a. If runs or matches values are negative print 'Error'.
		  b. If runs are greater than 0 when matches are 0 print 'Error'.

	Method name: getStatistics
	Return type: void
	
	This method should print the details of the batsman.
	Input: "Sachin", 18000, 463
	Output: 
		Name: Sachin
		Runs: 18000
		Matches: 463

	Note: a. If runs or matches values are negative print 'Error'.
		  b. If runs are greater than 0 when matches are 0 print 'Error'.

Given a class Testing that contains main method. Use this class to test your code.
