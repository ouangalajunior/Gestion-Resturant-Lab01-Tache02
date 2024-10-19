package tache02;

import tache02.Boisson.Boisson;
import tache02.Boisson.BoissonAlcoolisee;
import tache02.Boisson.TypeBoisson;
import tache02.Plat.Plat;
import tache02.Plat.PlatRiche;
import tache02.Plat.TypePlat;

import java.util.ArrayList;
import java.util.List;

// Createur Produit concret Plaisir implémentant l'interface CreateurProduit
public class CreateurPlaisir implements CreateurProduit{
    private List<PlatRiche> platsRiche = new ArrayList<>();
    private List<BoissonAlcoolisee> boissonAlcoolisee = new ArrayList<>();



    @Override
    public Plat creerPlat(String nom_plat, double prix_plat, TypePlat type_plat) {
        return new PlatRiche(nom_plat, prix_plat, type_plat);
    }

    @Override
    public Boisson creerBoisson(String nom_boisson, double prix_boisson, TypeBoisson type_boisson) {
        return new BoissonAlcoolisee(nom_boisson, prix_boisson, type_boisson) ;
    }


}
