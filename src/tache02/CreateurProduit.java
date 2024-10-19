package tache02;

import tache02.Boisson.Boisson;
import tache02.Boisson.TypeBoisson;
import tache02.Plat.Plat;
import tache02.Plat.TypePlat;

//Interface Abstract Factory, CreateurProduit pour la création des plats et boissons
interface CreateurProduit {
    Plat creerPlat(String nom_plat, double prix_plat, TypePlat type_plat);
    Boisson creerBoisson(String nom_boisson, double prix_boisson, TypeBoisson type_boisson);

}
