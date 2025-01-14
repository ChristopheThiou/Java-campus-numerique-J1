public class Pair {
    public static void main(String[] args) {
        enumerate_even();
    }
    public static void enumerate_even() {
    int i = 0;
        while ( i < 100) {
            i += 2;
            System.out.println("i = " + i);
        }
    }
}
