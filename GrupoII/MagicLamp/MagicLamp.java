package TrabalhoI.GrupoII.MagicLamp;

import TrabalhoI.GrupoII.GenieException;
import TrabalhoI.GrupoII.Matcher;
import TrabalhoI.GrupoII.Genies.EnchantedGenie;
import TrabalhoI.GrupoII.Genies.Genie;

public abstract class MagicLamp implements Lamp{
	
	private int _maxGenies, _qGenies = 0; // Tamanho do array de génios (_maxgenies)
	private Genie [] _genies = new Genie [_maxGenies];

	@Override
	public Genie rub() {
		try{
		if( _qGenies == 0 )
			throw new GenieException("Não há génios na lâmpada.");
		}
		catch (GenieException e){
			return null;
		}
		return _genies[getIndex(0, _maxGenies)];
	}

	public MagicLamp(int max){
		_maxGenies = max;
	}

	public boolean addGenie(Genie g){
		if( _qGenies == _genies.length ) 
			return false; 
		else {
			_genies[_qGenies++]= g;
			return true;
		}
	}
	
	
	public abstract int getIndex(int min, int max);

	public void spell(){
		EnchantedGenie g = null;
		for (int i = 0; i < _genies.length; ++i){
			if(_genies[i] instanceof EnchantedGenie)
				((EnchantedGenie) _genies[i]).setIsEnchanted(!((EnchantedGenie) _genies[i]).getIsEnchanted());
			else
				g = new EnchantedGenie(_genies[i]);
			
			_genies[i] = g;
		}
	} // Lança um feitiço sobre a lâmpada, removendo o feitiço aos génios enfeitiçados 
	 // e enfeitiçando os restantes.

	public Genie getGreaterGenie(){
		Genie g = getBestGenieEnchanted();
		return g;
	} // Retorna um dos génios enfeitiçado que concedeu mais desejos

	private Genie getBestGenieEnchanted() { 
		Genie [] gBest = getEnchantedGenies();
		Genie best= gBest[0];
		for (int i = 1; i < gBest.length; ++i){
			if(best.getGrantedWishes() < gBest[i].getGrantedWishes())
				best = gBest[i];
		}
		return best;
	} // Retorna o génio dos enfeitiçado que concedeu mais desejos

	private Genie [] getEnchantedGenies() {
		int i = 0;
		Genie [] ge = new Genie [i];
		for (int j = 0; j < _genies.length; ++j){
				if(_genies[j] instanceof EnchantedGenie){
					ge[i] = _genies[j];
					++i;
					break;
				}
			}
		return ge;
	} // Retorna um array com os génios enfeitiçados
	
	private Genie [] getGenies(Matcher m){
		int i;
		int n = 0;
		Genie [] _geniesAux = new Genie [n];
		for (i = 0; i<_maxGenies; i++){
			if (m.equals(_genies[i])) {
				_geniesAux [n] = _genies[i];
				n++;	
			}
//
//			Genie [] _geniesSelected = new Genie [n];
//			for (i = 0; i<n; i++) {
//				_geniesSelected [i]	= _geniesAux[i];
//			}
//
//			return _geniesSelected;
		}
		return _geniesAux;

		//Como ligar o geniesSelected a lamp.
	}
}
