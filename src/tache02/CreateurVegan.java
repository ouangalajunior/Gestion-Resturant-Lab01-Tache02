package tache02;

import tache02.Boisson.Boisson;
import tache02.Boisson.BoissonGazeuse;
import tache02.Boisson.TypeBoisson;
import tache02.Plat.Plat;
import tache02.Plat.PlatVegan;
import tache02.Plat.TypePlat;

// Createur Produit concret Vegan implémentant l'interface CreateurProduit
public class CreateurVegan implements CreateurProduit{
    @Override
    public Plat creerPlat(String nom_plat, double prix_plat, TypePlat type_plat) {
        return new PlatVegan(nom_plat, prix_plat, type_plat);
    }

    @Override
    public Boisson creerBoisson(String nom_boisson, double prix_boisson, TypeBoisson type_boisson) {
        return new BoissonGazeuse(nom_boisson, prix_boisson, type_boisson);
    }
}
