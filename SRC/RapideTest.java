package allumettes;

import org.junit.*;
import static org.junit.Assert.*;


public class RapideTest {
	
	private StratRapide rapide;
	private Jeu jeu;
	
	
	@Before public void setUp() {
		
		rapide = new StratRapide();
		jeu = new JeuAllumettes(13);
	}
	
	
	
	@Test
	public void testerRapide13allumettes() {
		try { 
			
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1);
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),3);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),2);
			jeu.retirer(1); 
			assertEquals(rapide.getPrise(jeu),1);
			
		}
		catch (CoupInvalideException e) {
			
		}
	}
}