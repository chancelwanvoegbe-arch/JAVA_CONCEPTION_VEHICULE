public class Main {
    public static void main(String[] args) {
        Voiture v = new Voiture("AA-123-BB", "Renault", 2018, 45000, 5);
        Moto m = new Moto("CC-456-DD", "Yamaha", 2020, 12000, 650);
        Camion c = new Camion("EE-789-FF", "Volvo", 2015, 250000, 12.0);

        // Faire rouler
        v.rouler(150);
        m.rouler(80);
        c.rouler(500);

        // Test du refus de km négatif
        System.out.println("--- Test km négatif ---");
        c.rouler(-10);

        // Affichage complet
        System.out.println("\n--- Voiture ---");
        v.afficher();
        System.out.println("Vignette : " + v.calculerVignette() + " DH");

        System.out.println("\n--- Moto ---");
        m.afficher();
        System.out.println("Vignette : " + m.calculerVignette() + " DH");

        System.out.println("\n--- Camion ---");
        c.afficher();
        System.out.println("Vignette : " + c.calculerVignette() + " DH");
    }
}