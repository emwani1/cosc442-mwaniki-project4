package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoffeeMakerTest {
	CoffeeMaker cm ;
	Recipe r;
	Recipe r2;
	public void setUp(){
		cm = new CoffeeMaker();
		r = new Recipe();
		r2 = new Recipe();
		
		r.setName("Choclate");
		r.setAmtChocolate(1);
		r.setAmtCoffee(0);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setPrice(10);
		
		r2.setName("Coffee");
		r2.setAmtChocolate(0);
		r2.setAmtCoffee(1);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setPrice(20);
	
	}

	@Test
	public void testAddRecipe() {
		setUp();
		assertEquals(true,cm.addRecipe(r));
		assertEquals(true,cm.addRecipe(r2));
	}

	@Test
	public void testDeleteRecipe() {
		setUp();
		cm.addRecipe(r);
		cm.addRecipe(r2);
		assertEquals(true,cm.deleteRecipe(r));
		assertEquals(true,cm.deleteRecipe(r2));
		Recipe r3 = new Recipe();
		assertEquals(false,cm.deleteRecipe(r3));
	}

	@Test
	public void testEditRecipe() {
		setUp();
		cm.addRecipe(r);
		cm.addRecipe(r2);
		Recipe r3 = new Recipe();
		
		r3.setName("Latte");
		r3.setAmtChocolate(0);
		r3.setAmtCoffee(1);
		r3.setAmtMilk(1);
		r3.setAmtSugar(1);
		r3.setPrice(30);
		assertEquals(true,cm.editRecipe(r3, r));
		assertEquals(true,cm.editRecipe(r3, r2));
		assertEquals(false,cm.editRecipe(r, r3));
	}

	@Test
	public void testAddInventory() {
		setUp();
		int coffee = 1;
		int milk = 1;
		int sugar = 0;
		int choclate = 1;
		assertEquals(true,cm.addInventory(coffee, milk, sugar, choclate));
		sugar = 1;
		assertEquals(false,cm.addInventory(coffee, milk, sugar, choclate));
		
	}

	@Test
	public void testMakeCoffee() {
		setUp();
		cm.addRecipe(r);
		cm.addRecipe(r2);
		assertEquals(0,cm.makeCoffee(r2, 20),0.001);
		assertEquals(40,cm.makeCoffee(r, 50),0.001);
	}


	@Test
	public void testGetRecipeForName() {
		setUp();
		cm.addRecipe(r);
		cm.addRecipe(r2);
		assertEquals(r,cm.getRecipeForName(r.getName()));
		assertEquals(r2,cm.getRecipeForName(r2.getName()));
	}

}
