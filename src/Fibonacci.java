public class Fibonacci {
    public static void main(String[] args) {
        /* fibo(); */
        double epsilon = 0.00001;
        double[] result = approximation_fibo(epsilon);
        System.out.println("Les deux derniers entiers de la suite de Fibonacci sont : " + result[1] + " et " + result[0] + " le nombre d'or est " + (result[1]/result[0]));
    }


    public static void fibo() {
        int a = 0, b = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static double[] approximation_fibo(double epsilon) {
        int a = 1;
        int b = 1;
        double nbOr = 0;
        while (Math.abs((double) b / a - nbOr) > epsilon) {
            System.out.println("nombre d'or = " + (double) b / a);
            nbOr = (double) b / a;
            int next = a + b;
            a = b;
            b = next;
        }
        return new double[]{a, b};
    }
}