package allumettes;

public class JeuAllumettesProxy implements Jeu {

	private Jeu jeu;

	public JeuAllumettesProxy(int allumettes) {
		jeu = new JeuAllumettes(allumettes);
	}

	
	public int getNombreAllumettes() {
		// TODO Auto-generated method stub
		return jeu.getNombreAllumettes();
	}

	
	public void retirer(int nbPrises) throws CoupInvalideException {
		// TODO Auto-generated method stub
		jeu.retirer(nbPrises);
		throw new OperationInterditeException();
	}

}

