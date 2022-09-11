package allumettes;

public class Arbitre {
	
	private Joueur j1, j2;
	
	public Arbitre(Joueur joueur1, Joueur joueur2) {
		this.j1 = joueur1;
		this.j2 = joueur2;
	}
	
	public void arbitrer(Jeu jeu) {
		int nbtour = 0;
		try {
			while (jeu.getNombreAllumettes() > 0) {
				System.out.println(" ");

				System.out.println("Allumettes restantes : "
						+ jeu.getNombreAllumettes());
				if (nbtour % 2 == 0) {
					nbtour = Arbitre.tour(jeu, j1, nbtour);
					System.out.println(" ");

				} else {
					nbtour = Arbitre.tour(jeu, j2, nbtour);
				}
				
				
			}
			Arbitre.gagnant(j1, j2, nbtour);
		} catch (OperationInterditeException o) {
			if (nbtour % 2 == 0) {
				System.out.println("Abandon de la partie car  "
			+ j1.getNom() + " triche !");
			} else {
				System.out.println("Abandon de la partie car "
			+ j2.getNom() + " triche !");
			}
		}
	}

	
	public static void gagnant(Joueur j1, Joueur j2, int nbtour) {
		
		if (nbtour % 2 == 0) {
			System.out.println(j2.getNom() + " perd !");
			System.out.println(j1.getNom() + " gagne !");
		
		} else {
			System.out.println(j1.getNom() + " perd !");
			System.out.println(j2.getNom() + " gagne !");
		
		}
	}
	
	public static int tour(Jeu jeu, Joueur joueur, int nbtour) {
		//System.out.println("Au tour de " + joueur.getNom() + ".");
		
		int prise = joueur.getPrise(jeu);
		if (prise ==  1 || prise == 0) {
			System.out.println(joueur.getNom() + " prend " + prise + " allumette.");
			} 
		
			
		
		else {
			System.out.println(joueur.getNom() + " prend " + prise + " allumettes.");
		}
		try {
			jeu.retirer(prise);
		} catch (CoupInvalideException e) {
			System.out.println("Impossible ! Nombre invalide : " + e.getCoup() + " " + e.getProbleme());
			nbtour -= 1;
		} catch (OperationInterditeException o) {

		}
		return nbtour += 1;
		
	}
	
}

