package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryTest {
	Inventory it;
	@Before
	public void setUp() throws Exception {
		it = new Inventory();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetChocolate() throws Exception {
		setUp();
		assertEquals(15,it.getChocolate(),0.001);
		it.setChocolate(1);
		assertEquals(1,it.getChocolate(),0.001);
		it.setChocolate(-1);
		assertEquals(0,it.getChocolate(),0.001);
		
		
	}


	@Test
	public void testGetCoffee() throws Exception {
		setUp();
		assertEquals(15,it.getCoffee(),0.001);
		it.setCoffee(1);
		assertEquals(1,it.getCoffee(),0.001);
		it.setCoffee(-5);
		assertEquals(0,it.getCoffee(),0.001);
		
		
	}

	@Test
	public void testGetMilk() throws Exception {
		setUp();
		assertEquals(15,it.getMilk(),0.001);
		it.setMilk(1);
		assertEquals(1,it.getMilk(),0.001);
		it.setMilk(-3);
		assertEquals(0,it.getMilk(),0.001);
	}


	@Test
	public void testGetSugar() throws Exception {
		setUp();
		assertEquals(15,it.getSugar(),0.001);
		it.setSugar(1);
		assertEquals(1,it.getSugar(),0.001);
		it.setSugar(-2);
		assertEquals(0,it.getSugar(),0.001);
	}


	@Test
	public void testEnoughIngredients() throws Exception {
		setUp();
		Recipe r = new Recipe ();
		r.setName("Choclate");
		r.setAmtChocolate(1);
		r.setAmtCoffee(2);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setPrice(10);
		
		assertEquals(true,it.enoughIngredients(r));
		it.setChocolate(0);
		assertEquals(false,it.enoughIngredients(r));
		it.setMilk(0);
		assertEquals(false,it.enoughIngredients(r));
		it.setSugar(0);
		assertEquals(false,it.enoughIngredients(r));
		it.setCoffee(1);
		assertEquals(false,it.enoughIngredients(r));
		
		
		
	}
	
	@Test
	public void testToString () throws Exception{
		setUp();
		String itString = "Coffee: " + it.getCoffee() + String.format("%n") +
		"Milk: " + it.getMilk() + String.format("%n") +
		"Sugar: " + it.getSugar() + String.format("%n") +
		"Chocolate: " + it.getChocolate() + String.format("%n");
		assertEquals(itString,it.toString());
	}


}
