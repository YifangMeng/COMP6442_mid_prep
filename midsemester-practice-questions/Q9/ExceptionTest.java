package Q9;

import org.junit.Before;
import org.junit.Test;


public class ExceptionTest {

	private Character character;

	@Before
	public void init() {
		this.character = new Character();
	}

	@Test(expected = NullKeyEventException.class, timeout = 1000)
	public void testNullKeyException() {
		// TODO
		// START YOUR CODE
		this.character.getState().check(character,null);

		// END YOUR CODE
	}

	@Test(expected = NullCharacterException.class, timeout = 1000)
	public void testNullCharacterException() {
		// TODO
		// START YOUR CODE
		this.character.getState().check(null,Key.UP);
		// END YOUR CODE
	}
}
