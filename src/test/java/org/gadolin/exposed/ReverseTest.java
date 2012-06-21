package org.gadolin.exposed;
import org.junit.*;
import static org.junit.Assert.*;

public class ReverseTest {
	
	Reverse reverse;

	public void init() {
		reverse = new Reverse();
	}
	
	@Test
	public void shouldReverseOneChar() {
			assertTrue(reverse.reverse("a").equals("a"));	
	}




}
