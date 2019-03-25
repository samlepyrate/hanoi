package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import cfranc.hanoi.Disque;

public class TourTest {
	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dLarge = new Disque(3);
	
	int hauteurMax = 3;
	
	Tour t = new Tour(hauteurMax);
	Tour t2 = new Tour(hauteurMax);
	
	@Test
	public void test_empile_tourVide() {
		boolean expected = true;
		boolean actual = t.empiler(dSmall);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_empile_dLargeSurdSmall() {
		boolean expected = false;
		t.empiler(dSmall);
		boolean actual = t.empiler(dLarge);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_empile_dSmallSurDlarge() {
		boolean expected = true;
		t.empiler(dLarge);
		boolean actual = t.empiler(dSmall);
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_depiler() {
		t.empiler(dSmall);
		t.depiler();		
		assertEquals(true, t.estVide());
	}
	@Test
	public void test_estPleine() {
		t.empiler(dLarge);
		t.empiler(dMedium);
		t.empiler(dSmall);
		assertEquals(true, t.estPleine());
	}
	@Test
	public void test_estPleine1() {
		t.empiler(dLarge);
		t.empiler(dMedium);
		
		assertEquals(false, t.estPleine());
	}
}
