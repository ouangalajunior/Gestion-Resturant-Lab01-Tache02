package tache02.Boisson;

//Classe concrete boisson gazeuse avec heritage de la classe abstraite Boisson
public class BoissonGazeuse extends Boisson{
    public BoissonGazeuse(String nomBoisson, double prixBoisson, TypeBoisson typeBoisson) {
        super(nomBoisson, prixBoisson, typeBoisson);
    }
}
