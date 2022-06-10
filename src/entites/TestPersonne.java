package entites;

/**
 * Mon application : entry point
 * @author RichardBONNAMY
 *
 */
public class TestPersonne {

	/** Méthode pour exécuter l'application
	 * @param args
	 */
	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(12, "rue Steve Jobs", 34780, "Palo Alto");		
		AdressePostale adr2 = new AdressePostale(22, "rue des Lilas", 44000, "Nantes");	
		
		Personne pers1 = new Personne("MARTIN", "Paul", adr1);
		pers1.direBonjour();
		
		Personne pers2 = new Personne("DUPONT", "Anne", adr2);
		pers2.direBonjour();
	}

}
