public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int[][] ans = new int[Matrix.length][Matrix[0].length];

        for (int i=0; i<Matrix.length; i++)
            for (int j=0; j<Matrix[0].length; j++)
                ans[j][i] = Matrix[i][j];
                
        for (int[] a: ans) 
            for (int v: a)
                System.out.print(v + " ");

    }
}
