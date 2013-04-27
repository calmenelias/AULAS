package TrabalhoI.GrupoII.MagicLamp;

import java.lang.Math;

public class MagicLamp2 extends MagicLamp {

	public MagicLamp2(int max) {
		super(max);
	}


	@Override
	public int getIndex(int min, int max) {
		return (int) Math.random()*(max+1);
	} // Retorna índice aleatorio; a constante max+1 permite gerar valores até a posição máxima no array
	
}
