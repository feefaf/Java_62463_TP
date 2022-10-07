import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        //somme();
        //division();
        pavedroit();
    }
    public static void somme() {
        System.out.println("Veuillez saisir le premier entier");
        Scanner scanner = new Scanner(System.in);
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + somme);
    }
    public static void division() {
        System.out.println("Veuillez saisir le premier entier");
        Scanner scanner = new Scanner(System.in);
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + division);

    }
    public static void pavedroit() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur du pave droit");
        int longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur du pave droit");
        int largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur du pave droit");
        int hauteur = scanner.nextInt();
        int volume = longueur * largeur * hauteur;
        System.out.println("le volume d'un pavé de dimension "
                + longueur + " * "+ largeur + " * "+ hauteur + " est de " + volume);

    }
}


