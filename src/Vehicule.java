public class Vehicule {
    protected String immatriculation; // Modifié de private à protected (Expérience 1)
    protected String marque;
    protected int annee;
    protected int kilometrage;

    public Vehicule(String immatriculation, String marque, int annee, int kilometrage) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.annee = annee;
        this.kilometrage = kilometrage;
    }

    public void rouler(int km) {
        if (km < 0) {
            System.out.println("Erreur : impossible de rouler un nombre de km négatif.");
        } else {
            this.kilometrage += km;
        }
    }

    public int age(int anneeCourante) {
        return anneeCourante - this.annee;
    }

    public void afficher() {
        System.out.println("Immatriculation : " + immatriculation);
        System.out.println("Marque          : " + marque);
        System.out.println("Année           : " + annee);
        System.out.println("Kilométrage     : " + kilometrage + " km");
    }

    public double calculerVignette() {
        return 500.0;
    }
}