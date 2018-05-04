import java.awt.Rectangle;

public class Homework1 {
	
	public static void main(String[] args) {
		if (problem1() == -3) {
			System.out.println("Pass 1");
		}
		if (problem2("Hello").equals("HELLO")) {
			System.out.println("Pass 2");
		}
		if (problem3("Hello, World!").equals("HelloWorld")) {
			System.out.println("Pass 3");
		}
		if (problem4() != null) {
			System.out.println("Pass 4");
		}
		if (problem5(new Rectangle(5, 10, 20, 30)) == 100) {
			System.out.println("Pass 5");
		}
	}
	
	// Fix the error in this method so that it runs properly
	public static int problem1() {
		int mystery = 1;
		mystery = mystery + 1;
		int mystery = 1 - 2 * mystery;
		return mystery;
	}
	
	// Use String methods to turn the provided String (input) into all uppercase letters and return the result
	// Hint: The String class has a 'toUpperCase' method
	
	public static String problem2(String input) {
		
	}

	// Use String methods to remove punctuation from the provided String (input)
	// Hint: The String class has a 'replace' method
	public static String problem3(String input) {
		
	}
	
	// Fix the errors in the following method
	public static Rectangle problem4() {
		Rectangle r1 = (5, 10, 15, 20);
		double width = Rectangle(5, 10, 15, 20).getWidth();
		Rectangle r2;
		r2.translate(15, 25);
		r3 = new Rectangle();
		r3.translate("Far, far away");
		return r3;
	}
	
	// Use Rectangle methods to calculate and return the perimiter of the provided Rectangle (rect)
	public static int problem5(Rectangle rect) {
		
	}
	
}
