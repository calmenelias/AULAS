package GrupoI.Dish;


public class Dish implements IDish{

	private String _name;
	private double _price;
	private String _description;
	
	public Dish(String name, double price){
		_name=name;
		_price=price;
	}
	
	public Dish(){}
	
	@Override
	public String getName() {
		return _name;
	}

	@Override
	public double getPrice() {
		return _price;
	}

	@Override
	public String getDescription() {
		return _description;
	}
	
	public void setDescription(String m){
		_description = m;
	}

	@Override
	public String toString()
	{
		return "€ " + this.getPrice()+ " " +this.getName();
	}
	
	public String getString(){
		return this.toString();
	}
}
