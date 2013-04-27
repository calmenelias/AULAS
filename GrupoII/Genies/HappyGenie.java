package TrabalhoI.GrupoII.Genies;

public class HappyGenie extends Genie {

	public HappyGenie(String name)
	{
		super(name);
	}

	@Override
	public boolean canGrantWish() // Retorna sempre true pois sempre concede os desejos
	{
		return true;
	}

}
