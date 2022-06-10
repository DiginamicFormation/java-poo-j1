package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void direBonjour() {
		System.out.println("Bonjour je m'apelle "+nom+" "+prenom);
	}
}
