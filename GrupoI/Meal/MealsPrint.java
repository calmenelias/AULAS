package GrupoI.Meal;

import GrupoI.Dish.Dish;

public class MealsPrint {
	
	public static void main(String [] args){
		
		Meal meal=new MealWithOffer( new Dish( "café", 0.5 ) );
		meal.addDish( new Dish( "espetadas", 8.5 ) ); 
		meal.addDish( new Dish( "salada de frutas", 1.8 ) );
		
		String[]  soups =  { "sopa de cenoura" }, 
		         mainDishes =  { "bacalhau", "espetadas" }, 
		         desserts =   { "salada de frutas", "pudim" };  
		Meal menu = new TodayMenu(soups, mainDishes, desserts, 9.0 ); 
		menu.addDish( new Dish( "sopa de cenoura", 1.5 ) ); 
		menu.addDish( new Dish( "bacalhau", 7.5 ) ); 
		menu.addDish( new Dish( "pudim", 1.8 ) ); 
		
		Meal [] meals = {menu, meal};
//		getTotalDiscount(meals);
		print(meals);
		
	}

	public static void print(Meal [] meals){
		System.out.println ("Refeição		Preço");
		for (int i = 0; i < meals.length ; ++i)
			System.out.println (meals[i].getName() + "			" + meals[i].getPrice());
		
		
		System.out.println ("Total Preços: " + getTotalPrice(meals));
		System.out.println ("Total Descontos: " + getTotalDiscount(meals));
		System.out.println ("Refeição mais cara		Refeição mais barata");
		System.out.println (getPriceMealExpensiveAndCheap(meals));
		
	}// Retorna nome e o preço  de  cada refeição e no fim: o somatório dos preços;
	//o somatório dos descontos; o preço da  refeição mais cara; e o preço da refeição mais barata.

	public static double getTotalDiscount(Meal[] meals) {
		double totalDiscount = 0;
		for(int i = 0; i<meals.length; ++i){
			if(meals[i] instanceof MealWithOffer)
				totalDiscount += ((Dish) meals[i].getMeal(0)).getPrice();
			else
				totalDiscount += ((Dish) meals[i].getMeal(2)).getPrice();
		}
		return totalDiscount;
	}// Retorna o desconto total dos menus contidos no array de menus

	public static double getTotalPrice(Meal[] meal) {
		double price = 0;
		for(int i = 0; i<meal.length; ++i)
			price += meal[i].getPrice();
		return price;
	}	// Retorna o preço total dos menus contidos no array de menus
	
	public static String getPriceMealExpensiveAndCheap(Meal[] meal) {  
		double cheap = meal[0].getPrice(), expensive = 0;
		for (int i = 1; i < meal.length ; ++i)
		{
			if (cheap < meal[i].getPrice())
				expensive = meal[i].getPrice();
			else if (cheap > meal[i].getPrice()){
				expensive = cheap;
				cheap = meal[i].getPrice();
			}
			else if (cheap == meal[i].getPrice()){
				cheap = meal[i+1].getPrice();
				++i;
			}
		}
		return expensive + "				" + cheap;
	}	// Retorna a refeição mas cara e a mas barata
}
