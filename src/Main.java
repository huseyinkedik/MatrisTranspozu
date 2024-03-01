public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4},
        };

        int[][] transpoz = new int[3][2];

        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                transpoz[i][j] = matris[j][i];
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

    }
}