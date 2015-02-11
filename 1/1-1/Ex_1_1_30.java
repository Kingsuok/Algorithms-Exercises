/**
 * 1.1.30 数组练习。编写一段程序，创建一个 N * N 的布尔数组 a[][]。其中当 i 和 j
 * 互质时（没有相同的因子），a[i][j]为true，否则为false。
 *
 * @author 2bab
 */
public class Ex_1_1_30 {

    public static void main(String[] args) {

        int N = StdIn.readInt();

        if (N < 2) {
            return;
        }

        boolean a[][] = new boolean[N][N];
        for (int i = 1; i <= N; i++) { //此处依题目之意的 i 和 j 应该不能为 0（因为0既不是质数也不是合数）
            for (int j = 1; j <= N; j++) {

                if (i % 2 == 0 && j % 2 == 0) {
                    a[i - 1][j - 1] = false;
                    continue;
                }

                if (euclid(i, j) == 1) {
                    a[i - 1][j - 1] = false;
                    continue;
                }

                a[i - 1][j - 1] = true;

            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%-7s", a[i][j]);
            }
            StdOut.println();
        }
    }

    public static int euclid(int p, int q) {
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }
        if (p % q != 0) return euclid(q, p % q);
        else return q;
    }

}
