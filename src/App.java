public class App {
    public static void main(String[] args) {
        enumerate_while();
    }

    public static void enumerate_while() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println("i = " + i);
        }
    }
}