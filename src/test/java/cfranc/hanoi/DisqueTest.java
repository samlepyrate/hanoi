package cfranc.hanoi;



import static org.junit.Assert.*;

import org.junit.Test;

import cfranc.hanoi.Disque;

public class DisqueTest {
	Disque dSmall = new Disque(1);
	Disque dSmall2 = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dLarge = new Disque(3);
	
	@Test
	public void test_compareTo_SmallMedium() {
		int expected = -1;
		int actual = dSmall.compareTo(dMedium);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_compareTo_SmallLarge() {
		int expected = -1;
		int actual = dSmall.compareTo(dLarge);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_compareTo_SmallSmall() {
		int expected = 0;
		int actual = dSmall.compareTo(dSmall2);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_compareTo_LargeMedium() {
		int expected = 1;
		int actual = dLarge.compareTo(dMedium);
		
		assertEquals(expected, actual);
	}

}
