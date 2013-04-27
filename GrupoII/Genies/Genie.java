package TrabalhoI.GrupoII.Genies;

public abstract class Genie {
	private final String _name;
	private int _granted;      // Número de desejos já realizados. 
	
	public Genie( String name )  
	{ this._name = name;}
	
//	public Genie( int granted, String name ) { 
//		this._granted = granted;
//		this._name = name;}
	
	public final void grantWish()  
	{ if ( canGrantWish() ) ++_granted;}
	
	public final int getGrantedWishes() 
	{ return _granted;}
	
	public final String getName()  
	{ return _name;}
	
	public final void printGranted()  
	{ System.out.println( this );}
	
	@Override
	public String toString()  
	{ return _name + " Granted  " + _granted + " wishes"; } 
	
	public abstract boolean canGrantWish();
	

}
