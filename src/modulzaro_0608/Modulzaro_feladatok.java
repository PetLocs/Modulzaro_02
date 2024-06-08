//Locsmándi Péter
package modulzaro_0608;

public class Modulzaro_feladatok {

    static int[] tomb;
    static int db = 5;
    static int also = 0;
    static int felso = 10;
    static int oszlop = 2;
    
    public static void main(String[] args) {
        programozoiTetelek();
        adatszerkezetTomb();
    }

    private static void programozoiTetelek() {
        feltolt(db);
        osszegzes();
        megszamlalas();
        minHely();
        maxHely();
        kivalasztas();
        eldontesEgy();
        eldontesMind();
        linKer();
        kiir(oszlop);
    }

    private static int[] feltolt(int db) {
        tomb = new int[db];
        for (int elem : tomb) {
            elem = velSzam(also, felso);
        }
        return tomb;
    }

    private static int velSzam(int also, int felso) {        
        return (int)(Math.random()*(felso - also) + also);
    }

    private static void kiir(int oszlop) {
        
    }
    
    private static void adatszerkezetTomb() {
        
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

    private static int minHely() {
        int min = tomb[0];
        for (int elem : tomb) {
            if (elem < min) {
                min = elem;
            }
        }
        return min; 
    }

    private static int maxHely() {
        int max = tomb[0];
        for (int elem : tomb) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    private static void kivalasztas() {
        
    }

    private static void eldontesEgy() {
        
    }

    private static void eldontesMind() {
        
    }

    private static void linKer() {
        
    }
    
}
