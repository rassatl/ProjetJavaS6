package bookshelf;

import java.util.Date;

public class Pret {
	private int id;
	private Date dateEmprunt;
	private int dureeEmprunt;
	private Date dateRetourEffective; 
	
	private Usager emprunteur;
	private Livre livreEmprunte;
	
		
	public Pret(int id, Date dateEmprunt, int dureeEmprunt, Date dateRetourEffective, Usager personne, Livre livre) {
		this.id = id;
		this.dateEmprunt = dateEmprunt;
		this.dureeEmprunt = dureeEmprunt;
		this.dateRetourEffective = dateRetourEffective;
		this.emprunteur = personne;
		this.livreEmprunte = livre;
	}
	
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public Date getDateEmprunt() {
	    return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
	    this.dateEmprunt = dateEmprunt;
	}

	public int getDureeEmprunt() {
	    return dureeEmprunt;
	}

	public void setDureeEmprunt(int dureeEmprunt) {
	    this.dureeEmprunt = dureeEmprunt;
	}

	public Date getDateRetourEffective() {
	    return dateRetourEffective;
	}

	public void setDateRetourEffective(Date dateRetourEffective) {
	    this.dateRetourEffective = dateRetourEffective;
	}
	
	public Livre getLivreEmprunte() {
	    return livreEmprunte;
	}	

	
	public void afficher() {
		System.out.println("--- Informations Pret --- " + "\n" +
				"Identifiant de l'emprunt : " + this.id + "\n" +
				"Titre du livre : " + this.livreEmprunte.getTitre() + "\n" +
				"Emprunté par (Nom Prenom) : " + this.emprunteur.getNom() + " " + this.emprunteur.getPrenom() + "\n" +
				"Date d'emprunt : " + this.dateEmprunt + "\n" +
				"Durée de l'emprunt : " + this.dureeEmprunt + "\n" +
				"Date de retour effective : " + this.dateRetourEffective
				);
		System.out.println("----------------------------");
	}
}
