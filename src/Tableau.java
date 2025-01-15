public class Tableau {
    public static void main(String[] args) {
        int[] tab1 = {0, 1};
        print1d(tab1);

        int[][] tab2 = { {0, 1}, {2, 3}, {4, 5} };
        print2D(tab2);

        int size = 4;
        int[][] tab3 = diagonal(size);
        print2D(tab3);

        int[][] tab = triangle(size);
        print2D(tab);

        int taille = 4;
        int[][] tab4 = super_diagonal(taille);
        print2D(tab4);

        int taille2 = 3;
        int[][] tab5 = super_diagonal(taille2);
        print2D(tab5);

        int[] flat = flatten(tab5);
        print1d(flat);
    }

    public static void print1d(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println();
    }

    public static void print2D(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] diagonal(int size) {
        int[][] tab = new int[size][size];
        for (int i = 0; i < size; i++) {
            tab[i][i] = 1;
        }
        return tab;
    }

    public static int[][] triangle(int size) {
        int[][] tab = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j >= i) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }
        return tab;
    }

    public static int[][] super_diagonal(int taille) {
        int[][] tab = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (i >= j) {
                    tab[i][j] = i - j;
                } else {
                    tab[i][j] = j - i;
                }
            }
        }
        return tab;
    }

    public static int[] flatten(int[][] tab) {
        int size = 0;
        for (int i = 0; i < tab.length; i++) {
            size += tab[i].length;
        }
        int[] flat = new int[size];
        int k = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                flat[k] = tab[i][j];
                k++;
            }
        }
        return flat;
    }
}