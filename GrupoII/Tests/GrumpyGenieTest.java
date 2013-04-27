package TrabalhoI.GrupoII.Tests;

import junit.framework.Assert;
import org.junit.Test;

import TrabalhoI.GrupoII.Genies.Genie;
import TrabalhoI.GrupoII.Genies.GrumpyGenie;

public class GrumpyGenieTest {

	public static void main (String [] args){
		shouldGrumpyGenieGrantWhish();
		checkGrumpyGenieName();

		
		System.out.print("Everything fine :) !!!");
	}
	
	//@Test
	public static void shouldGrumpyGenieGrantWhish(){
		
		// Arrange
		Genie g = new GrumpyGenie();
		
		
		// Assert
		Assert.assertEquals( true , g.canGrantWish() );
		Assert.assertEquals( g.getName() + " can grant a wish" , g.toString() );
		
		
		// Act
		g.grantWish();
		
		
		// Assert
		Assert.assertEquals( false , g.canGrantWish() );
		Assert.assertEquals( g.getName() + " already granted the wish" , g.toString() );

	} // O GrumpyGenie concede so um desejos
	
	public static void checkGrumpyGenieName(){
		
		// Arrange
		Genie g = new GrumpyGenie();
		Genie g1 = new GrumpyGenie();
		
		// Act
		g.getName();
		g1.getName();
		
		
		// Assert
		assert (g.getName() == "1º Grumpy");
		assert (g1.getName() == "2º Grumpy");
	} // O nome dos génios GrumpyGenie é “Grumpy” antecedido do número de vezes que já foram instanciados
}
