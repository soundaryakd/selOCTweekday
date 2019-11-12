package week4.day5;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LearnAssert {
	@Test
	public void testCase1() {
		assertEquals("test", "test1");
		System.out.println("TestCase1");
	}
	@Test
	public void testCase2() {
		System.out.println("TesCase2");
	}
	@Test
	public void testCase3() {
		System.out.println("TestCase3");
	}

}
