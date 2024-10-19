package tache02.Plat;

import tache02.Produit;

//Classe abstraite Plat implementant l'interface Produit
public  abstract class  Plat implements Produit {
//Déclaration des attributs plat
   private String nomPlat;
    private double prixPlat;
    private TypePlat typePlat;

    // Constructeur Plat
    public Plat(String nomPlat, double prixPlat, TypePlat typePlat) {
        this.nomPlat = nomPlat;
        this.prixPlat = prixPlat;
        this.typePlat = typePlat;
    }


    @Override
    public double afficherPrixProduit() {
        return prixPlat;
    }

    @Override
    public void afficherDetailsProduit() {
System.out.println("Nom plat: " + nomPlat+", prix plat: " + prixPlat + " CHF"+", type boisson: " + typePlat);

    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return typePlat + ": " + nomPlat + " - " + prixPlat + "CHF";
    }
}
