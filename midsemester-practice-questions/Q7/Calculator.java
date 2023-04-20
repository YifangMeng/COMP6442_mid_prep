package Q7;

public class Calculator {

	public double add(double a, double b) {

		//START YOUR CODE
		return new Addition(a, b).evaluate();

		//END YOUR CODE
	}

	public double subtract(double a, double b) {

		//START YOUR CODE
		return new Subtraction(a,b).evaluate();

		//END YOUR CODE
	}

	public double multiply(double a, double b) {

		//START YOUR CODE
		return new Multiplication(a, b).evaluate();
		//END YOUR CODE
	}

	public double divide(double a, double b) {

		//START YOUR CODE
		return new Division(a,b).evaluate();

		//END YOUR CODE
	}
}
