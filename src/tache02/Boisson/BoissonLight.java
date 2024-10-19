package tache02.Boisson;

//Classe abstraite boisson light avec heritage de la classe abstraite Boisson
public class BoissonLight extends Boisson {

    public BoissonLight(String nomBoisson, double prixBoisson, TypeBoisson typeBoisson) {
        super(nomBoisson, prixBoisson, typeBoisson);
    }
}
