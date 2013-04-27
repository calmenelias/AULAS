package TrabalhoI.GrupoII.Genies;

import TrabalhoI.GrupoII.GenieException;

public class EnchantedGenie extends Genie{

	private boolean _isEnchanted;  // Estado de feitiço do génio
	
	public EnchantedGenie( Genie g ) 
	{
		super(getEnchantedGenieName(g));
		_isEnchanted = true;
	}
	
	private static String getEnchantedGenieName(Genie g) {
		try {
		if(g instanceof EnchantedGenie){ // Lança um erro se o génio já estava enfeitiçado
			throw new GenieException("O génio já está enfeitiçado."); 
		}
		}
		catch (GenieException e){
			return g.getName();
		}
//		else
			return g.getName() + " enchanted";
	}// Acrescenta ao nome do génio "enchanted" se não estava encantado anteriormente

	public Genie getGenie(){
		return this;
	}

	@Override
	public boolean canGrantWish() 
	{
		if (this.canGrantWish())
			return false;
		return true;
	} // Retorna true se o génio ainda pode conceder desejos
	
	public boolean getIsEnchanted(){
		return _isEnchanted;
	}
	
	public void setIsEnchanted(boolean enchanted){
		_isEnchanted = enchanted;
	} // Coloca o estado de feitiço pasado como parámetro ao génio
	
	@Override
	public String toString(){
		return 	"Since " + this.getName() + " Granted " + this.getGrantedWishes() + " wishes";
	}
	
//	public void printGrantedEnchanted(){
//		System.out.print("Since ");
//		printGranted();
//	}
}
