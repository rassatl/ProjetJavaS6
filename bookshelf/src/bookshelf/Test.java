package bookshelf;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usager> usagers;
        List<Livre> livres;
        List<Pret> prets;

    	usagers = new ArrayList<Usager>();
    	livres = new ArrayList<Livre>();
    	prets = new ArrayList<Pret>();
    	
        boolean continuer = true;

        while (continuer) {
        	int id;
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ajouter un Usager");
            System.out.println("2. Ajouter un Livre");
            System.out.println("3. Créer un Prêt");
            System.out.println("4. Quitter");
            System.out.println("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                	// Ajouter un usager

                    System.out.println("Identifiant : ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Nom : ");
                    String nom = scanner.nextLine();

                    System.out.println("Prénom : ");
                    String prenom = scanner.nextLine();
                    
                    System.out.println("Année de naissance (YYYY) : ");
                    int anneeNaissance = scanner.nextInt();
                    scanner.nextLine();
                    
                    String tarifReduitStr;
                    do {
                    	System.out.println("Tarif réduit ? (Y/N) : ");
                        tarifReduitStr = scanner.nextLine().toLowerCase();
                    }while (tarifReduitStr == "y" ||  tarifReduitStr == "n");
                    Boolean tarifReduitBool = false;
                    if (tarifReduitStr.toLowerCase() == "y")
                    	tarifReduitBool = true;       
                    
                    usagers.add(new Usager(id, nom, prenom, anneeNaissance, tarifReduitBool));
                    break;

                case 2:
                    // Ajouter un livre
                    System.out.println("Identifiant (isbn) : ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Titre : ");
                    String titre = scanner.nextLine();
                    
                    System.out.println("Auteur : ");
                    String auteur = scanner.nextLine();
                                        
                    int nbPages = 0;
                    do{
                    	System.out.println("Nombre de pages : ");
                    	nbPages = scanner.nextInt();
                    	scanner.nextLine();
                    }while(nbPages <= 0);
                    
                    System.out.println("Genre : ");
                    scanner.nextLine();
                    String genre = scanner.nextLine();
                    
                    int nbExemplaires = 0;
                    do{
                    	System.out.println("Nombre d'exemplaires : ");
                        nbExemplaires = scanner.nextInt();
                        scanner.nextLine();
                    }while(nbExemplaires <= 0);
                    
                    livres.add(new Livre(isbn, titre, auteur, nbPages, genre, nbExemplaires));
                    break;

                case 3:
                    LocalDate dateEmprunt = null;
                    LocalDate dateRetourEffective = null;

                    // Créer un prêt
                	System.out.println("Identifiant : ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    
                    do {
                    	System.out.println("Date de l'emprunt (yyyy-MM-dd) : ");
                        String dateEmpruntStr = scanner.nextLine();
                        try {
                        	dateEmprunt = LocalDate.parse(dateEmpruntStr);
                        } catch (Exception e) {
                            System.out.println("Mauvais format !");
                        }
                    } while (dateEmprunt == null);
                    
                    System.out.println("Durée de l'emprunt : ");
                    int dureeEmprunt = scanner.nextInt();
                    scanner.nextLine();
                    
                    do {
                    	System.out.println("Date de retour effective (yyyy-MM-dd) : ");
                        String dateRetourEffectiveStr = scanner.nextLine();
                        try {
                        	dateRetourEffective = LocalDate.parse(dateRetourEffectiveStr);
                        } catch (Exception e) {
                            System.out.println("Mauvais format !");
                        }
                    } while (dateRetourEffective == null);
                    
                    System.out.println("Identifiant de l'usager : ");
                    int idUsager = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Identifiant du livre : ");
                    int idLivre = scanner.nextInt();
                    scanner.nextLine();
                    
                    Usager usager = new Usager(idUsager);
                    Livre livre = new Livre(idLivre);
                    
                    prets.add(new Pret(id, dateEmprunt, dureeEmprunt, dateRetourEffective, usager, livre));
                    System.out.println("---> : " + prets.size());
                    break;

                case 4:
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        scanner.close();
    }
}
