package h2;

public class H3_main {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(a, b));
    }
    public static boolean compareArrays(int[] x, int[] y) {
        int d = 0;
        if (x.length >= y.length) {
            d = x.length;
        } else {
            d = y.length;
        }
        for (int i = 0; i < d; i++){
            int a = 0;
            if (x.length >= y.length) {
                a = x[i];
            } else {
                a = y[i];
            }
            int anzahlX = 0;
            int anzahlY = 0;
            for (int j = 0; j < x.length; j++) {
                if (a == x[j]) {
                    anzahlX++;
                }
            }
            for (int j = 0; j < y.length; j++) {
                if (y[j] == a) {
                  anzahlY++;
                }
            }
            boolean b = (anzahlX == anzahlY);
            if (b){
            } else {
                return false;
            }
        }
        return true;
    }
}
