package allumettes;

public class StratExpert implements Strategie {
	

	public int getPrise(Jeu jeu) {
			// TODO Auto-generated method stub
			int n = jeu.getNombreAllumettes();
			int nbRef = Jeu.PRISE_MAX + 1; 
			if ((n - 1) % nbRef == 0) {
				return 1;
			} else {
				return (n - 1) % nbRef;
			}
		}

}

