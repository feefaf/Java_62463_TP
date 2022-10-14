import java.util.Scanner;

public class TP2 {
    public static void main(String[] args){
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteSTR();
        //factorielle();
        //countdown();
        //carre();
        //tableMultiplication();
        //division();
        regle();
        /**
        String val = "WEI";
        switch(val){
            case "BOI":
                System.out.println("oui");
                break;
            case "NO":
                System.out.println("oui");
                break;
            case "WEI":
                System.out.println("ouiii");
                break;
            default:
                System.out.println("non");
         }
        int[][] matrice = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
                } ;
        int[] secondeLigne = matrice[1] ;
        int elementRecherche = secondeLigne[2] ;
        int autreFacon = matrice[1][2] ;
         **/
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta == 0) {
            double x0 = -b/(2*a);
            System.out.println("le seul résulat possible x0= "+x0);
        }else if(delta > 0){
            double x1 = (-b+Math.sqrt(delta))/2*a;
            double x2 = (-b-Math.sqrt(delta))/2*a;
            System.out.println("La fonction a 2 solutions possible: x1= "+x1+" et x2= "+x2);
        }else{
            System.out.println("Ce polynome n’a pas de racine reelle, on dois donc utiliser les formules: \nx1= ("+
                            -b+"+i*Math.sqrt("+delta+"))/2*"+a+")\n"+"et\nx2= ("+
                    -b+"-i*Math.sqrt("+delta+"))/2*"+a+")");
        }
    }
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier :");
        int val = scanner.nextInt();
        if(val%2 == 0){
            System.out.println("la valeur entrée "+val+" est paire");
        }else{
            System.out.println("la valeur entrée "+val+" n'est pas paire");
        }
    }
    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int val1 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int val2 = scanner.nextInt();
        if(val1 > val2) {
            System.out.println("la valeure maximale est " + val1);
        }else{
            System.out.println("la valeure maximale est "+ val2);
        }
    }
    public static void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier");
        int val1 = scanner.nextInt();
        System.out.println("Entrez un entier");
        int val2 = scanner.nextInt();
        if(val1 < val2) {
            System.out.println("la valeure minimale est " + val1);
        }else{
            System.out.println("la valeure minimale est "+ val2);
        }
    }
    public static void egaliteSTR(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractère :");
        String firstchr = scanner.nextLine();
        System.out.println("Saisissez une autre chaine de caractère :");
        String secondchr = scanner.nextLine();
        if(firstchr.equals(secondchr)){
            System.out.println("les chaines de caractère sont identiques");
        }else{
            System.out.println("les chaines de caractère sont différentes");
        }
    }
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void countdown() {
        for (int i = 10; i >=0; i--){
            System.out.println(i);
        }
        System.out.println("BOOM");
    }
    public static void carre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int x = scanner.nextInt();
        int xcarre = x*x;
        System.out.println("x = "+x+" x² = "+ xcarre);
    }

    public static void tableMultiplication() {
        String table = "";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <=10; j++){
                table += Integer.toString(i*j)+" ";
            }
            table += "\n";
        }
        System.out.println(table);
    }

    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        double entier1 = scanner.nextInt();
        double entier2;
        do {
            System.out.println("Veuillez saisir un entier non nul");
            entier2 = scanner.nextInt();
        } while (entier2 == 0);
        double divise = entier1/entier2;
        System.out.println(entier1+" divisé par "+ entier2+" = "+divise);
    }
    public static void regle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la règle");
        int longueur = scanner.nextInt();
        String ruler = "|";
        int nombreDeSerie = ((longueur - (longueur%10))/10);
        for(int i = 0; i < nombreDeSerie; i++){
            ruler += "---------|";
        }
        for(int i = 0; i < longueur%10; i++){
            ruler += "-";
        }
        System.out.println(ruler);

    }
    public static void nombrepremier(){
        Scanner scanner = new Scanner(System.in);
        int cpt = 0;
        int nb;
        do{
            System.out.print("Veuillez bien saisir un entier positif");
            nb = scanner.nextInt();
        } while (nb<=0);

        for (int i = 2; i<nb;i+=1){
            if (nb%i==0){
                cpt+=1;
            }
        }
        if (cpt>=1){
            System.out.print("Ce chiffre n'est pas un nombre premier");
        }
        else {
            System.out.print("Ce chiffre est un nombre premier");
        }
    }

    //3.4.1
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        int somme = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
            somme+=entier;
        }
        System.out.println("La somme des éléments du tableau est "+somme);

        int min = tableau[0], max = tableau[0];
        for (int nb : tableau){
            if (nb<min){
                min = nb;
            }
            else if (nb>max) {
                max = nb;
            }

        }
        System.out.println("Le minimum du tableau est "+min);
        System.out.println("Le maximum du tableau est "+max);


        for (int i = 0; i<tableau.length;i++){
            if (tableau[i]%2==0){
                System.out.println("Les nombres pairs sont "+tableau[i]);
            }
            else if (i%2==0){
                System.out.println("Les nombres avec un indice pairs sont "+tableau[i]);
            }
        }
    }
    public static int[] inverseTableau(int[] tableau){
        int idx = tableau.length-1;
        int[] inversed = new int[tableau.length];
        int i = 0;
        while (idx>=0){
            inversed[i] = tableau[idx];
            idx-=1;
            i+=1;
        }
        return inversed;

    }
}
