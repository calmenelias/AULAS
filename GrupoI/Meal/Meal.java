package GrupoI.Meal;

import GrupoI.Dish.IDish;

public class Meal { 

	private IDish[] _dishes = new IDish[ 10 ]; private int _nDishes = 0; 
	private String _name; 

	public Meal( String name ) { 
		this._name = name;
	} 

	public boolean addDish( IDish d ) {
		if( _nDishes == _dishes.length ) 
			return false; 
		else {
			_dishes[_nDishes++]= d;
			return true;
		}
	} 
	
	@Override
	public final String toString() {
		return _name + ": € " + getPrice() ; 
	} 
	
	public final void printMeal() { 
		for( int i=0; i< _nDishes; ++i ) 
			System.out.println(_dishes[i]); 
		System.out.println( "----------------\n" + this); 
	} 
	
	public double getPrice() {
		double mealCost=0;		
		for(int i=1; i<_nDishes; ++i)
			mealCost+=_dishes[i].getPrice();
		return mealCost;
	} // Retorna o somatório dos preços dos pratos
	
	public String getName() {
		return _name;
	}
	
	public Object getMeal(int pos){
		return this._dishes[pos];
	}
} 