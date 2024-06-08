//Locsmándi Péter
package modulzaro_0608;

public class Modulzaro_feladatok {

    static int[] tomb;
    static int also = 0;
    static int felso = 10;
    static int oszlop = 2;
    
    public static void main(String[] args) {
        programozoiTetelek();
        adatszerkezetTomb();
    }

    private static void programozoiTetelek() {
        feltolt(velSzam(also, felso));
        kiir(oszlop);
    }

    private static void feltolt(int db) {
        tomb = new int[db];
    }

    private static int velSzam(int also, int felso) {
        return 0;
    }

    private static void kiir(int oszlop) {
        
    }
    
    private static void adatszerkezetTomb() {
        
    }
    
}
