import java.util.Scanner;

public class Suite2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = largestSquareLessThan(n);
        
        System.out.println("Le plus grand carré inférieur à " + n + " est " + result);
    }

    public static int largestSquareLessThan(int n) {
        int i = 0;
        while ((i + 1) * (i + 1) < n) {
            i++;
        }
        return i * i;
    }
}