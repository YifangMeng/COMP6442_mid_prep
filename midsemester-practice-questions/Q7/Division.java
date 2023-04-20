package Q7;

public class Division extends Operation {

	public Division(double a, double b) {
		super(a, b);
	}

	@Override
	public double evaluate() {

		//START YOUR CODE
		if (b==0)
			throw new ArithmeticException();

		//END YOUR CODE
		return a/b;
	}
}
