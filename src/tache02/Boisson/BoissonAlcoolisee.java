package tache02.Boisson;

//Classe concrete Boisson alcoolisée avec heritage de la classe abstraite Boisson
public class BoissonAlcoolisee extends Boisson {
    public BoissonAlcoolisee(String nomBoisson, double prixBoisson, TypeBoisson typeBoisson) {
        super(nomBoisson, prixBoisson, typeBoisson);
    }
}
