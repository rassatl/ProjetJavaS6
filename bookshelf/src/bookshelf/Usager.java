package bookshelf;

import java.util.ArrayList;

public class Usager {
	private int id;
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private Boolean tarifReduit;
	
	private ArrayList<Pret> listLivrePrete;
	
	public Usager(int id) {
		this.id = id;
	}
	
	public Usager(int id, String nom, String prenom, int anneeNaissance, Boolean tarifReduit) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
		this.tarifReduit = tarifReduit;
		this.listLivrePrete = new ArrayList<Pret>();
	}
	
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getNom() {
	    return nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}

	public String getPrenom() {
	    return prenom;
	}

	public void setPrenom(String prenom) {
	    this.prenom = prenom;
	}

	public int getAnneeNaissance() {
	    return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
	    this.anneeNaissance = anneeNaissance;
	}

	public Boolean getTarifReduit() {
	    return tarifReduit;
	}

	public void setTarifReduit(Boolean tarifReduit) {
	    this.tarifReduit = tarifReduit;
	}
	
	public void afficher() {
		System.out.println("--- Informations Usager --- " + "\n" +
				"Identifiant : " + this.id + "\n" +
				"Nom : " + this.nom + "\n" +
				"Prénom : " + this.prenom + "\n" +
				"Année de naissance : " + this.anneeNaissance + "\n" +
				"Possède un tarif réduit : " + this.tarifReduit +  "\n"
				);
		
		if (!listLivrePrete.isEmpty())
			System.out.println("Liste des livres emprunté \n");
		
		for (Pret currPret : listLivrePrete) {
            System.out.println(currPret.getLivreEmprunte().getTitre() +  "\n");
        }
		System.out.println("----------------------------");
	}

}
