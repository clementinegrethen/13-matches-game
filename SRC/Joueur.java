package allumettes;
public class Joueur {
	
	private String name;
	private Strategie strat;
	
	public Joueur(String nom, Strategie stratChoisie) {
		this.name = nom;
		this.strat = stratChoisie;
	}
	
	
	public Strategie getStrat() {
		return this.strat;
		
	}
	
	

	public  String getNom() {
			return this.name;
			
		}
	
	public int getPrise(Jeu jeu) {
		return this.strat.getPrise(jeu);
	}
	


}

