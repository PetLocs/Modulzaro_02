//Locsmándi Péter
package modulzaro_0608;

public class Modulzaro_feladatok {

    static int[] tomb;
    static int db = 5;
    static int also = 0;
    static int felso = 20;
    static int oszlop = 1;
    
    static final int MERET = 4;
    static int[][] matrix = new int[MERET][MERET];
    static int[] foatloTomb = new int[MERET];
    
    public static void main(String[] args) {
        programozoiTetelek();
        adatszerkezetTomb();
    }

    private static void programozoiTetelek() {
        //tomb = feltolt(db);
        /* DEBUG */
        tomb = new int[] {0, 1, 2, 3, 4, 5};
        /* DEBUG VÉGE */        
        kiir(oszlop);
    }

    private static int[] feltolt(int db) {
        int[] tomb = new int[db];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = velSzam(also, felso);
        }
        return tomb;
    }

    private static int velSzam(int also, int felso) {        
        return (int)(Math.random()*(felso - also) + also);
    }

    private static void kiir(int oszlop) {
        System.out.print("A tömb elemei: [ ");
        for (int elem : tomb) {
            System.out.print(elem + " ");
        }
        System.out.print("]\n");
        String osszeg = "Tömb összege: " + osszegzes();
        String megszam = "Nullák száma: " + megszamlalas();
        String min = "Legkisebb érték: " + minHely(tomb);
        String max = "Legnagyobb érték: " + maxHely(tomb);
        String kivalaszt = "Első 5-el osztható elem helye: ";
        kivalaszt += kivalasztas() == -1 ? "Nincs ilyen szám!" : kivalasztas() + ". helyen";
        String eldont1 = "Van-e tökéletes szám? ";
        eldont1 += eldontesEgy() ? "Van" : "Nincs";
        String eldontMind = "Növekvő sorrendben vannak? ";
        eldontMind += eldontesMind() ? "Igen" : "Nem";
        String keres = "Hol található a 13-as szám a tömbben? ";
        keres += linKer() == -1 ? "Nincs ilyen szám!" : linKer() + ". helyen";
        String[] kimenet = new String[]{osszeg, megszam, min, max, kivalaszt, eldont1, eldontMind, keres};
        for (int i = 0; i < kimenet.length; i++) {
            if (i%oszlop == oszlop -1) {
                System.out.println(kimenet[i] + " ");
            }else{
                System.out.print(kimenet[i] + " ");                
            }
        }
        System.out.println("");
    }

    private static int osszegzes() {
        int sum = 0;
        for (int elem : tomb) {
            sum += elem;
        }
        return sum;
    }

    private static int megszamlalas() {
        int szamlalo = 0;
        for (int elem : tomb) {
            if (elem == 0) {
                szamlalo++;
            }
        }
        return szamlalo;
    }

    private static int minHely(int [] tomb) {
        int min = tomb[0];
        for (int elem : tomb) {
            if (elem < min) {
                min = elem;
            }
        }
        return min; 
    }

    private static int maxHely(int [] tomb) {
        int max = tomb[0];
        for (int elem : tomb) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    private static int kivalasztas() {
        if (maxHely(tomb) >= 5) {
            int i = 0;
            while (!(tomb[i] % 5 == 0)) {
                i++;
            }
            return i + 1;
        }else{
            return -1;
        }
    }

    private static boolean eldontesEgy() {
        int i = 0;
        while (i < db && !tokeletesSzam(tomb[i])) {
            i++;
        }
        return i < db;
    }

    private static boolean eldontesMind() {
        int i = 1;
        while (i < db && tomb[i] >= tomb[i-1]) {
            i++;
        }
        return i >= db;
    }

    private static int linKer() {
        int i = 0;
        while (i < db && !(tomb[i] == 13)) {
            i++;
        }
        if (i < db) {
            return i + 1;
        }else{
            return -1;            
        }
    }

    private static boolean tokeletesSzam(int szam) {
        int sum = 0;
        int i = 1;
        while (i <= szam/2) {            
            if (szam % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == szam) {
            return true;
        }else{
            return false;            
        }
    }
    
    private static void adatszerkezetTomb() {        
        kimenet(foatlo());
        foatloFeltolt();
        kimenet(invertalo());
    }

    private static int [][] foatlo() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = velSzam(also, felso);
                }
            }
        }
        return matrix;
    }

    private static void kimenet(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j%MERET == MERET - 1) {
                    System.out.printf("%2d\n",matrix[i][j]);
                }else{
                    System.out.printf("%2d ",matrix[i][j]);                    
                }
            }
        }
        System.out.println("");
    }

    private static int[][] invertalo() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    matrix[i][j] = velSzam(minHely(foatloTomb), maxHely(foatloTomb));
                }else{
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private static void foatloFeltolt() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < foatloTomb.length; k++) {
                    if (matrix[i][j] > 0) {
                        foatloTomb[k] = matrix[i][j];
                    }
                }
            }
        }
    }
}
