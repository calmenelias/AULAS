package TrabalhoI.GrupoII.Genies;

public class SleepyGenie extends Genie{
	
	private int _numberOfGrants;

	public SleepyGenie (int n, String name){
		super( name );
		_numberOfGrants = n;
	}
	
	@Override
	public boolean canGrantWish() 
	{
		if(this.getNumberOfGrants() >= 0){
			this._numberOfGrants = this.getNumberOfGrants() - 1;
			return true;		
		}
		return false;
	} // Retorna true se o n�mero de desejos concedidos � menor que o n�mero passado no construtor
	
	public int getNumberOfGrants(){
		return this._numberOfGrants;
	}
}
