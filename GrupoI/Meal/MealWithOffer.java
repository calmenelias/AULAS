package GrupoI.Meal;

import GrupoI.Discount;
import GrupoI.Dish.Dish;

public class MealWithOffer extends Meal implements Discount {
	
	public MealWithOffer(Dish dish) {
		super("Refeição com oferta de " + dish.getName());
		this.addDish(dish);
	}


	@Override
	public double getDiscount() {
		return ((Dish) this.getMeal(0)).getPrice();
	}
}
	