package tache02;

import tache02.Boisson.Boisson;
import tache02.Boisson.TypeBoisson;
import tache02.Plat.Plat;
import tache02.Plat.TypePlat;
import tache02.Table.Table;
import tache02.Table.TypeTable;
import java.time.LocalDate;

import java.util.Scanner;

public class Restaurant {

    //Fabrique Method pour le choix de la Fabrique Factory
    public static CreateurProduit choisirCreateurProduit(TypeTable type_table) {
        switch (type_table) {
            case PLAISIR:
                return new CreateurPlaisir();
            case DIET:
                return new CreateurDiet();
            case VEGAN:
                return new CreateurVegan();
            default:
                throw new IllegalArgumentException("Type de table inconnu.");
        }
    }



    public static void main(String[] args) {
/*

        // Table  Plaisir
        Table tablePlaisir1 = new Table("Table Plaisir 01", "Stephane", LocalDate.now(),TypeTable.PLAISIR);
        CreateurProduit createurPlaisir = new CreateurPlaisir();
        Plat platRiche1 = createurPlaisir.creerPlat("Steak frite", 12.49,TypePlat.PRINCIPAL);
        Plat platRiche2 = createurPlaisir.creerPlat("Salade Cesar", 4.5, TypePlat.ENTREE);
        Plat platRiche3 = createurPlaisir.creerPlat("Tarte à la pomme",4,TypePlat.DESSERT);

        Boisson boissonAlcoolisee1 = createurPlaisir.creerBoisson("Heineken 33cl",3,TypeBoisson.ALCOOLISEE);
        tablePlaisir1.ajouterProduit(platRiche1);
        tablePlaisir1.ajouterProduit(platRiche2);
        tablePlaisir1.ajouterProduit(platRiche3);
        tablePlaisir1.ajouterProduit(boissonAlcoolisee1);
        tablePlaisir1.afficherDetailsTable();
        tablePlaisir1.afficherProduitsConsommes();
        tablePlaisir1.calculerEtAfficherPrixTotal();
*/

        Scanner scanner = new Scanner(System.in);

        // Demander au client de choisir le type de table
        System.out.println("Veuillez choisir un type de table (PLAISIR, DIET, VEGAN) : ");
        String choixTypeTable = scanner.nextLine().toUpperCase();

        // Création de la table selon le choix du client
        TypeTable typeTable = TypeTable.valueOf(choixTypeTable);
        Table tableClient = new Table("Table " + typeTable + " 01", "Stephane", LocalDate.now(), typeTable);

        // Fabrique méthode pour obtenir le créateur de produit en fonction du type de table
        CreateurProduit createurProduit = choisirCreateurProduit(typeTable);

        // Création des plats et boissons en fonction du type de table
        if (createurProduit != null) {
            Plat plat1 = createurProduit.creerPlat("Steak frite", 12.49, TypePlat.PRINCIPAL);
            Plat plat2 = createurProduit.creerPlat("Salade Cesar", 4.5, TypePlat.ENTREE);
            Plat plat3 = createurProduit.creerPlat("Tarte à la pomme", 4.0, TypePlat.DESSERT);
            Boisson boisson1 = createurProduit.creerBoisson("Boisson spéciale", 3.0, TypeBoisson.ALCOOLISEE); // ou autre selon le type

            // Ajout des produits à la table
            tableClient.ajouterProduit(plat1);
            tableClient.ajouterProduit(plat2);
            tableClient.ajouterProduit(plat3);
            tableClient.ajouterProduit(boisson1);

            // Affichage des détails de la table et des produits consommés
            tableClient.afficherDetailsTable();
            tableClient.afficherProduitsConsommes();
            tableClient.calculerEtAfficherPrixTotal();
        } else {
            System.out.println("Type de table non reconnu !");
        }

    }
}
