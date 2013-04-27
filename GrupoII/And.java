package TrabalhoI.GrupoII;

import TrabalhoI.GrupoII.Genies.Genie;

public class And {
	private int _alreadygranted;
	private Happy _h;
	private GrantedWhishes _g;

	public And (Happy c, GrantedWhishes d){
		this._alreadygranted = d.get_alreadygranted();

	}

	public boolean equals(Genie a){

		if (_h.equals(a) & _g.equals(a)) return true;
		return false;
	}
}
