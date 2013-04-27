package TrabalhoI.GrupoII.MagicLamp;

public class MagicLamp1 extends MagicLamp {
	private int _index =0;
	
	public MagicLamp1(int max) {
		super(max);
	}

	@Override
	public int getIndex(int min, int max) {
		 if (min < max)
			 ++_index;
		 
		return _index;
	}// Retorna o índice que vá rodando por todos os génios contidos no array
	
}
