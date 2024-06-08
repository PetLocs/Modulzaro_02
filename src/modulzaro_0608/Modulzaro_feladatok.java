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
        tomb = feltolt(db);
        
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

    
}
