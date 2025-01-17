package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // Création des adresses postales
        AdressePostale adresse1 = new AdressePostale(1, "rue de la Paix", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(2, "rue de la Liberté", 69000, "Lyon");

        // Création des personnes
        Personne personne1 = new Personne("Doe", "John", adresse1);
        Personne personne2 = new Personne("Doe", "Jane", adresse2);

        // Modification des adresses postales
        personne1.setAdresse(adresse1);
        personne2.setAdresse(adresse2);

        // Affichage des personnes
        System.out.println(personne1);
        System.out.println(personne2);
    }
}
