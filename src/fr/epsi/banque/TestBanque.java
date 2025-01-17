package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;
import fr.epsi.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {
        Compte compte1 = new Compte(1, 1000);

        System.out.println(compte1);

        CompteTaux compte2 = new CompteTaux(3, 3000, 0.2);

        Compte[] listeComptes = new Compte[2];

        listeComptes[0] = compte1;
        listeComptes[1] = compte2;

        for (Compte compte : listeComptes) {
            System.out.println(compte);
        }
    }
}
