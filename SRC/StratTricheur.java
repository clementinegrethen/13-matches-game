package allumettes;

public class StratTricheur implements Strategie {
	
	public int getPrise(Jeu jeu) {
	System.out.println("[Je triche...]");
	while (jeu.getNombreAllumettes() != 2) {
		try {
			jeu.retirer(1);
		} catch (CoupInvalideException e) {
			System.out.println("impossible");
		}
	}
	System.out.println("[Allumettes restantes : " + jeu.getNombreAllumettes() + "]");
	return 1;
}


}

