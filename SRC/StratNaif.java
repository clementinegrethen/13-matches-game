package allumettes;
import java.util.Random;
public class StratNaif implements Strategie {
	
	int genererInt(int borneInf, int borneSup) {
		   Random random = new Random();
		   int nb;
		   nb = borneInf + random.nextInt(borneSup - borneInf);
		   return nb;
		}

		
	public int getPrise(Jeu jeu) {
		if (jeu.getNombreAllumettes() > jeu.PRISE_MAX) {
			int nbAllu = genererInt(1, jeu.PRISE_MAX);
			return nbAllu;
		} else {
			int nbAllu = genererInt(1, jeu.getNombreAllumettes());
			return nbAllu;
		}
		
	}
}


