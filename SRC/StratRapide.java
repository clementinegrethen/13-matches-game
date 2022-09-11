package allumettes;

public class StratRapide implements Strategie {
	
	public int getPrise(Jeu jeu) {
		return Math.min(JeuAllumettes.PRISE_MAX, jeu.getNombreAllumettes());
		}
	}



	

	

