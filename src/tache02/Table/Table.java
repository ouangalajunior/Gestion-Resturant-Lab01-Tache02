package tache02.Table;

import tache02.Produit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  class Table {
    private String nomTable;
    private String client;
    private LocalDate date;
    private List<Produit> produitsConsommes =new ArrayList<>();
    private TypeTable typeTable;

    //Constructeur

    public Table(String nomTable, String client, LocalDate date, TypeTable typeTable) {
        this.nomTable = nomTable;
        this.client = client;
        this.date = date;
        this.typeTable = typeTable;


    }

    //Méthode pour ajouter un produit
    public void ajouterProduit(Produit produit) {
        produitsConsommes.add(produit);
    }
    // Méthode pour calculer et afficher le prix total des produits consommés
    public void calculerEtAfficherPrixTotal(){
        double prixTotal = 0;
        for (Produit produit : produitsConsommes) {
            prixTotal +=produit.afficherPrixProduit();
        }
        System.out.println("Prix Total: " + prixTotal);
    }

    // Méthode pour afficher la liste des produits consommés
    public void afficherProduitsConsommes(){
        System.out.println("Produits consommés à la table " + nomTable + " :");
        for (Produit produit : produitsConsommes) {
            System.out.println(produit.toString());

        }
    }

    // Méthode pour afficher les détails de la table
    public void afficherDetailsTable() {
        System.out.println("Table: " + nomTable + " | Client: " + client + " | Date: " + date + " | Type: " + typeTable);
    }
}
