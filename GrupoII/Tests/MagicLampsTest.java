package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoII.Genies.*;
import TrabalhoI.GrupoII.GenieException;
import TrabalhoI.GrupoII.MagicLamp.*;

public class MagicLampsTest {

	public static void main (String [] args){
		
		shouldMagicLampSpellGenies();
//		shouldGenerateAnAException();
		
		System.out.print("Everything fine :) !!!");
	}
	
	//@Test
	public static void shouldMagicLampSpellGenies(){

		//Arrange
		MagicLamp m = new MagicLamp1(2);
		Genie g = new GrumpyGenie();
		EnchantedGenie g1 = new EnchantedGenie(g);
		
		
		// Act
		m.addGenie(g);
		m.addGenie(g1);
		m.spell();
		
		// Assert
		Assert
		Assert.assertEquals(true, g.getIsEnchanted());
		Assert.assertEquals();
		
	} // Comproba o bom funcionamento do método spell
	
	public static void shouldGenerateAnAException(){
		
		// Arrange
		MagicLamp m = new MagicLamp1(2);
		
		
		// Act
		m.rub();
		
		// Assert
		Assert.assertTrue(m instanceof MagicLamp);
		Assert.assertTrue(null == m.rub());
		
	}// O método rub retorna null e dá excepção
}
