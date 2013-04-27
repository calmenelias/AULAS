package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoII.Genies.*;
import TrabalhoI.GrupoII.Matcher;
import TrabalhoI.GrupoII.MagicLamp.*;

public class EnchantedGenieTest {

	public static void main (String [] args){
		
		shouldHaveGenieNameAndEnchanted();
				
		System.out.print("Everything fine :) !!!");
	}
	
	//@Test
	public static void shouldHaveGenieNameAndEnchanted(){
		
		// Arrange
		Genie g = new GrumpyGenie();
		
		
		// Act
		Genie g1 = new EnchantedGenie(g);
		Genie g2 = new EnchantedGenie(g1);
		
		
		// Assert
		Assert.assertEquals("1º Grumpy enchanted", g1.getName());
		Assert.assertEquals("1º Grumpy enchanted", g2.getName());
		Assert.assertEquals("Since 1º Grumpy enchanted Granted 0 wishes", g1.toString());		
	}
}
