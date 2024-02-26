package task4;

/*
 * Class Batsman is given to you. Add below details to the class

1. Instance variables:
	name: String,
	runs: int,
	matches: int,
	batting_avg: float.
2. Create a default constructor that assigns default values to instance variables.
3. Create parameterized constructor that accepts name, runs, matches.
 */
public class Batsman {
	private String name;
	private int runs;
	private int matches;
	private float batting_avg;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(String name, int runs, int matches) {
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
		this.batting_avg = (float)runs/(float)matches;
	}

	/*
	 * Method name: computeBattingAverage Return type: void
	 * 
	 * This method should print the batting average of the batsman by dividing run
	 * with matches. Input: "Sachin", 18000, 463 Output:
	 * 
	 * Name: Sachin Batting_Avg: 38.87689
	 * 
	 * Note: a. If runs or matches values are negative print 'Error'. 
	 * b. If runs are greater than 0 when matches are 0 print 'Error'.
	 */
	public void computeBattingAverage() {

		if (runs < 0 || matches < 0) {
			System.out.println("computeBattingAverage-(there is negitive value either in runs and matches\\)");
			return;
		}
		if (runs > 0 && matches == 0) {
			System.out.println("computeBattingAverage-Error runs is grater and matches is 0");
			return;
		} else {
			this.batting_avg = ((float)runs / (float)matches);
			System.out.println("Name: " + name + " is :" + (batting_avg));
		}
	}

	/*
	 * Method name: getStatistics Return type: void
	 * 
	 * This method should print the details of the batsman. Input: "Sachin", 18000,
	 * 463 Output: Name: Sachin Runs: 18000 Matches: 463
	 * 
	 * Note: a. If runs or matches values are negative print 'Error'. b. If runs are
	 */
	public void getStatistics() {

		if (runs < 0 || matches < 0) {
			System.out.println("Negitive Value Error");
			return;
		}
		if (runs > 0 && matches == 0) {
			System.out.println("getStatistics-Error runs are grager than matches");
			return;
		} else {
			System.out.println("Name: " + name + "\nRuns: " + runs + "\nMatches: " + matches+ "\nbatting_avg"+ batting_avg);
		}
	}
}
