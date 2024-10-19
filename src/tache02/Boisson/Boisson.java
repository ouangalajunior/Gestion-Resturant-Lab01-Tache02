package tache02.Boisson;


import tache02.Produit;

//Classe abstraite Boisson emplementant l'interface Produit
public abstract class Boisson  implements Produit {
    //Attributs
    private String nomBoisson;
    private double prixBoisson;
    private TypeBoisson typeBoisson;

    //Constructeur
    public Boisson(String nomBoisson, double prixBoisson, TypeBoisson typeBoisson  ) {
        this.nomBoisson = nomBoisson;
        this.prixBoisson = prixBoisson;
        this.typeBoisson = typeBoisson;
    }


    @Override
    public double afficherPrixProduit() {
        return prixBoisson;
    }

    @Override
    public void afficherDetailsProduit() {
        System.out.println("Nom Boisson: " + nomBoisson+", prix boisson: " + prixBoisson + " CHF"+", type boisson: " + typeBoisson);


    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return typeBoisson + ": " + nomBoisson + " - " + prixBoisson + "CHF";
    }
}

