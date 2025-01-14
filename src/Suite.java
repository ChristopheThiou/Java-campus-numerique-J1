import java.util.Scanner;

public class Suite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = smallestSquareGreaterThan(n);
        
        System.out.println("Le plus petit carré supérieur à " + n + " est " + result);
    }

    public static int smallestSquareGreaterThan(int n) {
        int i = 0;
        while (i * i <= n) {
            i++;
        }
        return i * i;
    }
}