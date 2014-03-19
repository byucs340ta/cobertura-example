package testing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {
  
	@Test
	public void testMyClass() {
		MyClass myclass = new MyClass();
		
		assertEquals(myclass.tryItOut(), "Success!");
	}

} 