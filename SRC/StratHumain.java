package allumettes;

import java.util.Scanner;

public class StratHumain implements Strategie {

	private static Scanner scan = new Scanner(System.in);
	private String nom;
	
	public StratHumain (String nom) {
		
		this.nom = nom;
	}
	
	@Override
	
	public int getPrise(Jeu jeu) {
		assert (jeu.getNombreAllumettes() > 0);
		assert (jeu != null);

		String choix;
		int prise = 0;
		
		boolean valide = false;
		while (!valide) {
		
			System.out.print(nom + ", combien d'allumettes ? ");
			try {
			
				choix = this.scan.next();

				if (choix.equals("triche")) {

					try {
						jeu.retirer(1);
						
						System.out.print("[Une allumette en moins, plus que ");
						
						System.out.print(jeu.getNombreAllumettes());
						
						System.out.println(". Chut !]");
						
					} catch (CoupInvalideException e) {
					
					}
				} else {
					prise = Integer.parseInt(choix);
					valide = true;
				}
				
			} catch (NumberFormatException e) {
			
				System.out.println("Vous devez donner un entier.");
			}
		}
		return prise;
	}
}
