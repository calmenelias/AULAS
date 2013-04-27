package TrabalhoI.GrupoII.Genies;

public class GrumpyGenie extends Genie {

	public static int _numberOfGrumpy = 0; // número de vezes que já foram instanciados GrumpyGenies
	
	
	public GrumpyGenie()	{
		super( ( ++_numberOfGrumpy ) + "º " + "Grumpy");
	}

	@Override
	public boolean canGrantWish() {
		if(this.getGrantedWishes() == 0)
			return true;
		return false;
	} // Retorna false se já tinha concedido algum desejo
	
	@Override
	public String toString(){
		if( canGrantWish() )
			return this.getName() + " can grant a wish";
		
		return this.getName() + " already granted the wish";
	} // Retorna se pode o não conceder desejos
}
