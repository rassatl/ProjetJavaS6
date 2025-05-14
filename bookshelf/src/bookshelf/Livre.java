package bookshelf;

public class Livre {
	private int isbn;
	private String titre;
	private String auteur;
	private int nbPages; 
	private String genre;
	private int nbExemplaires;

	public Livre(int isbn) {
		this.isbn = isbn;
	}
	
	public Livre(int isbn, String titre, String auteur, int nbPages, String genre, int nbExemplaires) {
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.nbPages = nbPages;
		this.genre = genre;
		this.nbExemplaires = nbExemplaires;
	}
	
	public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public void setNbExemplaires(int nbExemplaires) {
        this.nbExemplaires = nbExemplaires;
    }
	
	public void afficher() {
		System.out.println("--- Informations Livre --- " + "\n" +
				"Identifiant du livre : " + this.isbn + "\n" +
				"Titre : " + this.titre + "\n" +
				"Auteur : " + this.auteur + "\n" +
				"Nombre de pages : " + this.nbPages + "\n" +
				"Genre : " + this.genre + "\n" +
				"Nombre d'exemplaires" + this.nbExemplaires + "\n"
				);
		System.out.println("----------------------------"); 
	}
}
