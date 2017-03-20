package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	Recipe re;
	@Before
	public void setUp() throws Exception {
		re = new Recipe();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAmtChocolate() throws Exception {
		setUp();
		re.setAmtChocolate(1);
		assertEquals(1,re.getAmtChocolate());
		re.setAmtChocolate(-1);
		assertEquals(0,re.getAmtChocolate());
	}

	@Test
	public void testGetAmtCoffee() throws Exception {
		setUp();
		re.setAmtCoffee(23);
		assertEquals(23,re.getAmtCoffee());
		re.setAmtCoffee(-18);
		assertEquals(0,re.getAmtCoffee());
	}

	@Test
	public void testGetAmtMilk() throws Exception {
		setUp();
		re.setAmtMilk(50);
		assertEquals(50,re.getAmtMilk());
		re.setAmtMilk(0);
		assertEquals(0,re.getAmtMilk());
	}

	@Test
	public void testGetAmtSugar() throws Exception {
		setUp();
		re.setAmtSugar(12);
		assertEquals(12,re.getAmtSugar());
		re.setAmtSugar(-18);
		assertEquals(0,re.getAmtSugar());
	}

	@Test
	public void testGetName() throws Exception {
		setUp();
		re.setName(null);
		assertEquals(null,re.getName());
		re.setName("Latte");
		assertEquals("Latte",re.getName());
	}

	@Test
	public void testGetPrice() throws Exception {
		setUp();
		re.setPrice(43);
		assertEquals(43,re.getPrice());
		re.setPrice(-18);
		assertEquals(0,re.getPrice());
	}

	@Test
	public void testEqualsRecipe() throws Exception {
		setUp();
		Recipe r = new Recipe ();
		assertEquals(false,re.equals(r));
		r.setName("Choclate");
		assertEquals(false,re.equals(r));
		re.setName("Pizza");
		assertEquals(false,re.equals(r));
		re.setName("Choclate");
		assertEquals(true,re.equals(r));	
	}

	@Test
	public void testToString() throws Exception {
		setUp();
		re.setName("Latte");
		assertEquals("Latte",re.getName());
	}

}
