package TrabalhoI.GrupoII;

import TrabalhoI.GrupoII.Genies.Genie;
import TrabalhoI.GrupoII.Genies.HappyGenie;

public class Happy {

	
	public boolean equals(Genie a) {

		if (a instanceof HappyGenie) return true;
		return false;

	}
}
