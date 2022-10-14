import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        chat();
    }
    public static void chat() {
        Scanner sc = new Scanner(System.in);
        int longueur;
        do{
            System.out.print("Veuillez entrer la longueur du chat\nCette dernière dois être positive et supérieure a 1\n");
            longueur = sc.nextInt();
        } while (longueur <1);
        int largeur;
        do{
            System.out.print("Veuillez entrer la largeur du chat\nCette dernière dois être positive et supérieure a 1\n");
            largeur = sc.nextInt();
        } while (largeur <1);

    String topleft = "|\\";
    String topright = "/|";
    String bottomleft = "\\_";
    String bottomright = "_/";

    String toptop = "-";
    String bottombottom = "^";

    String top = topleft + toptop.repeat(longueur)+ topright;
    String bottom = bottomleft + bottombottom.repeat(longueur) + bottomright;
    String mid = "";
    for(int i = 0; i<largeur; i++){
        if(i == (int)((double)largeur/(double)2)){
            mid += "|0"+ "_".repeat(longueur) + "0|\n";
        }else{
            mid +="| " + " ".repeat(longueur)+" |\n";
        }
        }
    String completeCat = top+"\n"+mid+bottom;
    System.out.println(completeCat);
    }
}
