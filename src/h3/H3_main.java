package h3;

public class H3_main {
    public static void main(String[] args){
        int[] a = {1,2,3}, b = {1,2,4}, c = {1,3,2}, d = {1,2}, e = {1,2,3}, f = {1,1,2};
        System.out.println(compareArraysVal(a,b));
        System.out.println(compareArraysVal(a,c));
        System.out.println(compareArraysVal(e,c));
        System.out.println(compareArraysVal(d,f));
    }

    public static boolean compareArraysVal(int[] a, int[] b){
        int x = 0;
        if (a.length >= b.length) {
            x = a.length;
        } else {
            x = b.length;
        }
        for (int i = 0; i < x; i++){
            int y = 0;
            if (a.length >= b.length) {
                y = a[i];
            } else {
                y = b[i];
            }
            int anzahlA = 0;
            int anzahlB = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == y) {
                    anzahlA++;
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (b[j] == y) {
                    anzahlB++;
                }
            }
            if (anzahlA != anzahlB){
               return false;
            }
        }
        return true;
    }
}
