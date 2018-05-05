/*
 * First and Last Names
 */


import java.awt.Rectangle;

public class Homework1 {

	/* Tests to verify that your solutions work
	 * Do not submit your homework until all of these pass
	 */
	public static void main(String[] args) {
		int exitCode = 0;
		if (problem1() == -3) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}
		if (problem2("Hello").equals("HELLO")) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}
		if (problem3("Hello, World!").equals("HelloWorld")) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}
		if (problem4() != null) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}
		if (problem5(new Rectangle(5, 10, 20, 30)) == 100) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}
		System.exit(exitCode);
	}

	/* Fix the error in this method so that it runs properly
	 */
	public static int problem1() {
		int mystery = 1;
		mystery = mystery + 1;
		int mystery = 1 - 2 * mystery;
		return mystery;
	}

	/* Use String methods to turn the provided String (input) into all uppercase
	 * letters and return the result
	 * Hint: The String class has a 'toUpperCase' method
	 */
	public static String problem2(String input) {

	}

	/* Use String methods to remove punctuation from the provided String (input)
	 * Hint: The String class has a 'replace' method
	 */
	public static String problem3(String input) {

	}

	/* Fix the errors in the following method
	 */
	public static Rectangle problem4() {
		Rectangle r1 = (5, 10, 15, 20);
		double width = Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2;
		r2.translate(15, 25);
		r3 = new Rectangle();
		r3.translate("Far, far away");
		return r3;
	}

	/* Use Rectangle methods to calculate and return the perimiter of the
	 * provided Rectangle (rect)
	 */
	public static int problem5(Rectangle rect) {

	}

}
