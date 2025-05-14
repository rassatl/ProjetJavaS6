package bookshelf;

import java.time.LocalDate;

public class Pret {
	private int id;
	private LocalDate dateEmprunt;
	private int dureeEmprunt;
	private LocalDate dateRetourEffective; 
	
	private Usager emprunteur;
	private Livre livreEmprunte;
	
	public Pret(int id, LocalDate dateEmprunt, int dureeEmprunt, LocalDate dateRetourEffective, Usager personne, Livre livre) {
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

	public LocalDate getDateEmprunt() {
	    return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
	    this.dateEmprunt = dateEmprunt;
	}

	public int getDureeEmprunt() {
	    return dureeEmprunt;
	}

	public void setDureeEmprunt(int dureeEmprunt) {
	    this.dureeEmprunt = dureeEmprunt;
	}

	public LocalDate getDateRetourEffective() {
	    return dateRetourEffective;
	}

	public void setDateRetourEffective(LocalDate dateRetourEffective) {
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
