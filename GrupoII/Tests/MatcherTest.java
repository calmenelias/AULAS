package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoII.Genies.*;
import TrabalhoI.GrupoII.Matcher;
import TrabalhoI.GrupoII.MagicLamp.*;

public class MatcherTest {

	public static void main (String [] args){
	}
	
	//@Test
	public void shouldHappyGenieGrantWhish(Genie g){
		 // Verifica que sempre o HappyGenie conceda desejos
		if(g instanceof HappyGenie)
			assert (g.canGrantWish() == true);
		
		// Verifica se o GrumpyGenie concede so um desejos
		if(g instanceof GrumpyGenie && g.getGrantedWishes()!=0)
			assert (g.canGrantWish() == false);
		else
			assert (g.canGrantWish() == true);
		
		// Verifica se o SleepyGenie concede o máximo de desejos pasado no construtor
		if(g instanceof SleepyGenie && g.getGrantedWishes() > ((SleepyGenie) g).getNumberOfGrants())
			assert (g.canGrantWish() == false);
		else
			assert (g.canGrantWish() == true);
	}
}
