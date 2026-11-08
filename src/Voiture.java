public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String immatriculation, String marque, int annee, int kilometrage, int nombrePortes) {
        super(immatriculation, marque, annee, kilometrage);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void afficher() {
        super.afficher(); // Appel de la méthode du parent
        System.out.println("Nombre de portes: " + nombrePortes);
    }

    @Override
    public double calculerVignette() {
        return 800.0;
    }
}