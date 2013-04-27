package GrupoI;

import junit.framework.Assert;
import org.junit.Test;
import GrupoI.Dish.Dish;
import GrupoI.Meal.*;

public class MealTests {
	
	@Test
	public void MealTest(){
	
		// Arrange Test Dishes
		Dish d = new Dish( "café", 0.5 );
		
		// Assert
		Assert.assertEquals (0.5 , d.getPrice());
		Assert.assertEquals ("café" , d.getName());
		Assert.assertEquals ("€ 0.5 café" , d.toString());
		
		
		// Arrange Test MealWithOffer
		Meal meal=new MealWithOffer( new Dish( "café", 0.5 ) );
		meal.addDish( new Dish( "espetadas", 8.5 ) ); 
		meal.addDish( new Dish( "salada de frutas", 1.8 ) ); 
		
		// Assert
		Assert.assertEquals("€ 0.5 café", meal.getMeal(0).toString());
		Assert.assertEquals("€ 8.5 espetadas", meal.getMeal(1).toString());
		Assert.assertEquals("€ 1.8 salada de frutas", meal.getMeal(2).toString());
		Assert.assertEquals("Refeição com oferta de café: € 10.3", meal.toString());
		Assert.assertEquals(10.3, meal.getPrice());
		
			
		// Arrange Test TodayMenu
		String[]  soups =  { "sopa de cenoura" }, 
		         mainDishes =  { "bacalhau", "espetadas" }, 
		         desserts =   { "salada de frutas", "pudim" };  
		Meal menu = new TodayMenu(soups, mainDishes, desserts, 9.0 ); 
		menu.addDish( new Dish( "sopa de cenoura", 1.5 ) ); 
		menu.addDish( new Dish( "bacalhau", 7.5 ) ); 
		menu.addDish( new Dish( "pudim", 1.8 ) ); 
		
		
		//Assert
		Assert.assertEquals("€ 1.5 sopa de cenoura", menu.getMeal(0).toString());
		Assert.assertEquals("€ 7.5 bacalhau", menu.getMeal(1).toString());
		Assert.assertEquals("€ 1.8 pudim", menu.getMeal(2).toString());
		Assert.assertEquals(9.0, menu.getPrice());
		
		
		// Arrange Test print(Meal [] meals) da classe MealsPrint
		Meal [] meals = {menu, meal};
		
		// Assert
		Assert.assertEquals(19.3, MealsPrint.getTotalPrice(meals));
		Assert.assertEquals(2.3, MealsPrint.getTotalDiscount(meals));
		Assert.assertEquals("10.3				9.0",MealsPrint.getPriceMealExpensiveAndCheap(meals));
		
	}	
}
