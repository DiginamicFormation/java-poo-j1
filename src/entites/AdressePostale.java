package entites;

/** Type Adresse postale
 *
 */
public class AdressePostale {

	// Variables d'instance
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	
	/** Constructeur avec 4 paramètres
	 */
	AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		ville = nvVille;
	}
	
}
