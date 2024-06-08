//Locsmándi Péter
package modulzaro_0608;
import java.util.Scanner;

public class Modulzaro_jatek {
    static final String X = "X";
    static final String O = "O";
    static final String URES = " ";
    static int [] magyarazat = new int[] {1,2,3,4,5,6,7};
    static String [] mezok = new String[] {X, X, X, X, X, URES, O, O, O, O, O};
    static final Scanner SC = new Scanner(System.in);
    static String csapat;
    static int mezo;
    
    public static void main(String[] args) {
        jatekmenet();
    }

    private static void jatekmenet() {
        kezdes();
    }

    private static void kezdes() {
        megjelenites();
        bekeres();
    }

    private static void megjelenites() {
        for (int i = 0; i < magyarazat.length; i++) {
            System.out.printf("%s ", magyarazat[i]);
        }
        System.out.printf("\n");
        for (int i = 2; i < mezok.length - 2; i++) {
            System.out.printf("%s ", mezok[i]);
        }
        System.out.printf("\n");
    }

    private static void bekeres() {          
        System.out.print("Kérem válasszon mezőt!");
        mezo = SC.nextInt() +2; 
        lepes();
        bekeres();
    }

    private static void lepes() {        
        if (mezok[mezo] == URES && mezok[mezo - 1] == X) {
            mezok[mezo - 1] = URES;
            mezok[mezo] = X;
            csapat = O;
        }
        if (mezok[mezo] != URES && mezok[mezo + 1] == URES && mezok[mezo - 1] == X) {
            mezok[mezo - 1] = URES;
            mezok[mezo + 1] = X;
            csapat = O;
        }
        if (mezok[mezo - 2] == URES && mezok[mezo - 1] == O) {
            mezok[mezo - 1] = URES;
            mezok[mezo - 2] = O;
            csapat = X;
        }
        if (mezok[mezo - 2] != URES && mezok[mezo - 3] == URES && mezok[mezo - 1] == O) {
            mezok[mezo - 1] = URES;
            mezok[mezo - 3] = O;
            csapat = X;
        }
        megjelenites();
    }
}
