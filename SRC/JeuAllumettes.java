package allumettes;

public class JeuAllumettes implements Jeu {
	
	int allumettes;
	
	public JeuAllumettes(int al) {
		this.allumettes = al;
	}

	public int getNombreAllumettes() {
		return this.allumettes;		
	}

	
	public void retirer(int nbPrises) throws CoupInvalideException {
			if  (nbPrises > getNombreAllumettes()) {
				throw new CoupInvalideException(nbPrises, "(> " + getNombreAllumettes() + ")");

			} else if (nbPrises < 1) {
				throw new CoupInvalideException(nbPrises, "(< 1)");

			} else if (nbPrises > PRISE_MAX) {
				throw new CoupInvalideException(nbPrises, "(> " + PRISE_MAX + ")");

			} else {
				this.allumettes = getNombreAllumettes() - nbPrises;
			}
	}

}


