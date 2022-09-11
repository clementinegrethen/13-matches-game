package allumettes;

/** Lance une partie des 13 allumettes en fonction des arguments fournis
 * sur la ligne de commande.
 * @author	Xavier Crégut
 * @version	$Revision: 1.5 $
 */
public class Jouer {

	/** Lancer une partie. En argument sont donnés les deux joueurs sous
	 * la forme nom@stratégie.
	 * @param args la description des deux joueurs
	 */
	public static void main(String[] args) {
		try {
			verifierNombreArguments(args);

			

		} catch (ConfigurationException e) {
			System.out.println();
			System.out.println("Erreur : " + e.getMessage());
			afficherUsage();
			System.exit(1);
		}
		String[] strategie1String;
		String[] strategie2String;
		Jeu jeu;
		
		if (args[0].equalsIgnoreCase("-confiant")) {
			 strategie1String = args[1].split("@");
			 strategie2String = args[2].split("@");
			jeu = new JeuAllumettes(13); 
			
			} else {
			jeu = new JeuAllumettesProxy(13);
			 strategie1String = args[0].split("@");
			 strategie2String = args[1].split("@");
		}
		Strategie strategie1 = convertstrat(strategie1String[1], strategie1String[0]);
		Strategie strategie2 = convertstrat(strategie2String[1], strategie2String[0]);
		Joueur j1 = new Joueur(strategie1String[0], strategie1);
		Joueur j2 = new Joueur(strategie2String[0], strategie2);
		Arbitre arbitre = new Arbitre(j1, j2);
		arbitre.arbitrer(jeu);
		
		
			
	}
	
	public static Strategie convertstrat(String strat, String nom) {
		switch (strat) {
		case "naif":
		case "Naif":
			return new StratNaif();
		case "rapide" :
		case "Rapide":
			return new StratRapide();
		case "humain":
		case "Humain":
			return new StratHumain(nom);
		case "expert":
		case "Expert":
			return new StratExpert();
		case "tricheur":
			return new StratTricheur();
		default:
			break;
		}
		return null;
	}
	private static void verifierNombreArguments(String[] args) {
		final int nbJoueurs = 2;
		if (args.length < nbJoueurs) {
			throw new ConfigurationException("Trop peu d'arguments : "
					+ args.length);
		}
		if (args.length > nbJoueurs + 1) {
			throw new ConfigurationException("Trop d'arguments : "
					+ args.length);
		}
	}

	/** Afficher des indications sur la manière d'exécuter cette classe. */
	public static void afficherUsage() {
		System.out.println("\n" + "Usage :"
				+ "\n\t" + "java allumettes.Jouer joueur1 joueur2"
				+ "\n\t\t" + "joueur est de la forme nom@stratégie"
				+ "\n\t\t" + "strategie = naif | rapide | expert | humain | tricheur"
				+ "\n"
				+ "\n\t" + "Exemple :"
				+ "\n\t" + "	java allumettes.Jouer Xavier@humain "
					   + "Ordinateur@naif"
				+ "\n"
				);
	}

}

