package TrabalhoI.GrupoII.Genies;

import TrabalhoI.GrupoII.GenieException;

public class EnchantedGenie extends Genie{

	private boolean _isEnchanted;  // Estado de feiti�o do g�nio
	
	public EnchantedGenie( Genie g ) 
	{
		super(getEnchantedGenieName(g));
		_isEnchanted = true;
	}
	
	private static String getEnchantedGenieName(Genie g) {
		try {
		if(g instanceof EnchantedGenie){ // Lan�a um erro se o g�nio j� estava enfeiti�ado
			throw new GenieException("O g�nio j� est� enfeiti�ado."); 
		}
		}
		catch (GenieException e){
			return g.getName();
		}
//		else
			return g.getName() + " enchanted";
	}// Acrescenta ao nome do g�nio "enchanted" se n�o estava encantado anteriormente

	public Genie getGenie(){
		return this;
	}

	@Override
	public boolean canGrantWish() 
	{
		if (this.canGrantWish())
			return false;
		return true;
	} // Retorna true se o g�nio ainda pode conceder desejos
	
	public boolean getIsEnchanted(){
		return _isEnchanted;
	}
	
	public void setIsEnchanted(boolean enchanted){
		_isEnchanted = enchanted;
	} // Coloca o estado de feiti�o pasado como par�metro ao g�nio
	
	@Override
	public String toString(){
		return 	"Since " + this.getName() + " Granted " + this.getGrantedWishes() + " wishes";
	}
	
//	public void printGrantedEnchanted(){
//		System.out.print("Since ");
//		printGranted();
//	}
}
