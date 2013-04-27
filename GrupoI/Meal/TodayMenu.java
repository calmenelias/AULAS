package GrupoI.Meal;

import GrupoI.Discount;

public class TodayMenu extends Meal implements Discount{
	
	@SuppressWarnings("unused")
	private String[]  _soups, _mainDishes, _desserts;
	private double _menuPrice;
	
	
	public TodayMenu(String [] soups, String [] mainDishes, String [] desserts, double menuPrice){
		super("Menu do dia");
		_menuPrice = menuPrice;		
		_soups = soups;
		_mainDishes = mainDishes;
		_desserts = desserts;		
	}
	
	@Override
	public double getPrice() {
		return _menuPrice;
		
	}

	@Override
	public double getDiscount() {
		double discount = this.getPrice() - _menuPrice;
		return discount;
	}
	
}
