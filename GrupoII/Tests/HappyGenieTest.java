package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;

import TrabalhoI.GrupoII.Genies.Genie;
import TrabalhoI.GrupoII.Genies.HappyGenie;

public class HappyGenieTest {

	public static void main (String [] args){
		
		shouldHappyGenieGrantWhish();
		
		System.out.print("Everything fine :) !!!");
	}
	
	//@Test
	public static void shouldHappyGenieGrantWhish(){
		 // Arrange
		Genie g = new HappyGenie("Happy :)");

		
		// Assert
		Assert.assertEquals (true, g.canGrantWish());
		
		// Act
		g.grantWish();
		
		// Assert
		Assert.assertEquals (true, g.canGrantWish());
		
		// Act
		g.grantWish();
		
		// Assert
		Assert.assertEquals (true, g.canGrantWish());
		
		// Act
		g.grantWish();
		
		// Assert
		Assert.assertEquals (true, g.canGrantWish());
		
		// Act
		g.grantWish();
		
		// Assert
		Assert.assertEquals (true, g.canGrantWish());
	}// Sempre o HappyGenie concede os desejos
}
