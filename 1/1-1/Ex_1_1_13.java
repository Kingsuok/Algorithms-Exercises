/**
 * 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）
 *
 * @author 2bab
 */
public class Ex_1_1_13 {

    public static void main(String[] args) {

        final int M = StdIn.readInt();
        final int N = StdIn.readInt();
        int[][] array = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = StdRandom.uniform(100);
            }
        }

        int[][] newArray = transPosition(array);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                StdOut.printf("%-5d", newArray[i][j]);
            }
            StdOut.println();
        }

    }

    public static int[][] transPosition(int[][] array) {

        final int ROW = array.length;
        final int COL = array[0].length;
        int[][] newArray = new int[COL][ROW];

        for (int i = 0; i < COL; i++) {
            for (int j = 0; j < ROW; j++) {
                newArray[i][j] = array[j][i];
            }
        }

        return newArray;
    }

}
