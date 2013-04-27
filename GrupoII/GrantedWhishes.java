package TrabalhoI.GrupoII;

import TrabalhoI.GrupoII.Genies.Genie;

public class GrantedWhishes extends Matcher {
	
	Genie a;
	@SuppressWarnings("unused")
	private int _alreadygranted;
	
	public GrantedWhishes (int n) {
		this._alreadygranted=n;
	}
	
	
	@Override
	public boolean equals(Genie a){
		boolean _returnEquals = false;
		this.a = a;
		if (a.getGrantedWishes() == 2) _returnEquals = true;
		return _returnEquals;
	}

	public int get_alreadygranted() {
		return a.getGrantedWishes();
	}

}
