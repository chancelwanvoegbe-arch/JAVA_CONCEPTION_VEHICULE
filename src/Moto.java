public class Moto extends Vehicule {
    private int cylindree; // en cm³

    public Moto(String immatriculation, String marque, int annee, int kilometrage, int cylindree) {
        super(immatriculation, marque, annee, kilometrage);
        this.cylindree = cylindree;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Cylindrée       : " + cylindree + " cm³");
    }

    @Override
    public double calculerVignette() {
        if (cylindree <= 125) {
            return 300.0;
        } else {
            return 600.0;
        }
    }
}