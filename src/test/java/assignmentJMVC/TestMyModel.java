package assignmentJMVC;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMyModel {
	
	MyModel Mod = new MyModel();
	@Parameters("Browser")
	@Test
	public void testAdd() {
		assertEquals(73, Mod.addV(43, 30));
	}
	@Test 
	public void testSub() {
		assertEquals(8, Mod.subV(9, 1));
	}
	@Test 
	public void testMult() {
		assertEquals(63, Mod.mulV(7, 9));
	}
	@Test
	public void testMultZero() {
		assertEquals(0, Mod.mulV(5, 0));
	}
	@Test 
	public void testDiv() {
		assertEquals(5, Mod.DivV(15, 3));
	}
	
	@Test
	public void testDivS() {
		assertEquals(0, Mod.DivV(0, 9));
	}
	
	@Test 
	public void testMod() {
		assertEquals(2, Mod.modV(23, 7));
	}
	
	@Test 
	public void testModZero() {
		assertEquals(0, Mod.modV(5, 0));
	}

}
