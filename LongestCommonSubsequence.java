public class LongestCommonSubsequence {

    int lcs(int[] X, int[] Y, int m, int n) {
        int L[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[m][n];
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        int[] array = new int[8];
        int[] array1 = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 3) + 5);
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 3) + 5);
            System.out.print(array1[i]);
            System.out.print(" ");
        }

        int m = array.length;
        int n = array1.length;

        System.out.println(" ");
        System.out.println("Длина найбольшей общей подпоследовательности: "
                + " " + lcs.lcs(array, array1, m, n));

    }
}
