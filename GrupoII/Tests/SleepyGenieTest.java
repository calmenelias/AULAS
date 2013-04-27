package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoII.Genies.SleepyGenie;
import TrabalhoI.GrupoII.Genies.Genie;

public class SleepyGenieTest {

	public static void main (String [] args){
		shouldSleepyGenieGrantWish();
		shouldHaveANumberOfWish();
		
		System.out.print("Everything fine :) !!!");
	}
	
	
	//@Test
	public static void shouldHaveANumberOfWish(){
		// Arrange
		SleepyGenie g= new SleepyGenie(2, "Sleepy");
		
		// Act
		g.getNumberOfGrants();
		
		// Assert
		Assert.assertEquals(2, g.getNumberOfGrants());
	}
	
	//@Test
	public static void shouldSleepyGenieGrantWish(){
		
		// Arrange
		Genie g = new SleepyGenie(2, "Sleepy");

		// Assert
		Assert.assertEquals(true, g.canGrantWish());
		Assert.assertEquals(0, g.getGrantedWishes());
		
		// Act
		g.grantWish();

		Assert.assertEquals(true, g.canGrantWish());
		Assert.assertEquals(1, g.getGrantedWishes());
		
		// Act
		g.grantWish();

		Assert.assertEquals(false, g.canGrantWish());
		
		
	}// O SleepyGenie concede o máximo de desejos pasado no construtor
}
