package task4;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Batsman b1 = new Batsman("aaa", 453, 546);
		b1.getStatistics();
		b1.computeBattingAverage();

		System.out.println("------------");

		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the number of mtches ");
		int matches = sc.nextInt();
		System.out.println("Enter runs scored");
		int runs = sc.nextInt();

		Batsman b2 = new Batsman(name, runs, matches);

		System.out.println("------------");
		b2.computeBattingAverage();
		b2.getStatistics();
		sc.close();

	}
}
