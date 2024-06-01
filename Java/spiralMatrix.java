public class spiralMatrix {
    public static void main(String[] args) {
        int[][] Matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int M = Matrix.length;
        int N = Matrix[0].length;

        int[] ans = new int[M * N];

        int rowCountCondition[] = {0, 1, 0, -1};
        int columnCountCondition[] = {1, 0, -1, 0};
        int currentIndex = 0;

        int x = 0, y = 0, m = 0, n = 0;
        int current_XCount, current_YCount;

        for (int i=0; i<ans.length; i++) {

            ans[i] = Matrix[x][y];

            current_XCount = rowCountCondition[currentIndex];
            current_YCount = columnCountCondition[currentIndex];

            x += current_XCount;
            y += current_YCount;

            if (!(m <= x && x < M && n <= y && y < N)) {

                x -= current_XCount;
                y -= current_YCount;
        
                if (current_YCount + current_XCount > 0) {
                    m += current_XCount;
                    n += current_YCount;
                } else {
                    M += current_XCount;
                    N += current_YCount;
                }

                currentIndex = (currentIndex + 1) % 4;
        
                x += rowCountCondition[currentIndex];
                y += columnCountCondition[currentIndex];
            }

        } 

        for (int j: ans) {
            System.out.print(j + " ");
        }
    }
}
