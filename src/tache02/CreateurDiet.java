package tache02;

import tache02.Boisson.Boisson;
import tache02.Boisson.BoissonLight;
import tache02.Boisson.TypeBoisson;
import tache02.Plat.Plat;
import tache02.Plat.PlatDiet;
import tache02.Plat.TypePlat;

// Createur Produit concret Diet implémentant l'interface CreateurProduit
public class CreateurDiet implements CreateurProduit{
    @Override
    public Plat creerPlat(String nom_plat, double prix_plat, TypePlat type_plat) {
        return new PlatDiet(nom_plat, prix_plat, type_plat);
    }

    @Override
    public Boisson creerBoisson(String nom_boisson, double prix_boisson, TypeBoisson type_boisson) {
        return new BoissonLight(nom_boisson, prix_boisson, type_boisson);
    }
}
