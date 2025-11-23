package h2;

public class H2_main {
    public static void main(String[] args) {
        int [] a = {1, 2};
        int [] b = {1, 3};
        System.out.println(compareArrays(a, b));
    }
    public static boolean compareArrays(int[] x, int[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++){
            if (x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
}
