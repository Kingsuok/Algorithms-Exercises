/**
 * 1.1.27 二项分布。估计用一下代码计算 binomial(100, 50) 将会产生的递归调用次数
 * 将已经计算过的值保存在数组中兵给出一个更好的实现。
 *
 * @author 2bab
 */
public class Ex_1_1_27 {

    /*参考 https://github.com/aistrate/AlgorithmsSedgewick/blob/master/1-Fundamentals/1-1-BasicProgModel/Ex_1_1_27b.java*/

    public static void main(String[] args) {

        int n = 10;
        int k = 5;
        double p = 0.5;
        Counter count = new Counter("times");

        StdOut.print(binomial(count, n, k, p) + "  ");
        StdOut.println(count);

        count = new Counter("times");
        StdOut.print(myBinomial(count, n, k, p) + "  ");
        StdOut.println(count);
    }

    public static double binomial(Counter count, int n, int k, double p) {
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }

        count.increment();

        return (1.0 - p) * binomial(count, n - 1, k, p) + p * binomial(count, n - 1, k - 1, p);
    }

    public static double myBinomial(Counter count, double[][] values, int n, int k, double p) {
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }

        if (values[n][k] == -1) {
            count.increment();
            values[n][k] = (1.0 - p) * myBinomial(count, values, n - 1, k, p) + p * myBinomial(count, values, n - 1, k - 1, p);
        }

        return values[n][k];
    }

    public static double myBinomial(Counter count, int n, int k, double p) {
        double[][] values = new double[n + 1][k + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= k; j++)
                values[i][j] = -1;

        return myBinomial(count, values, n, k, p);
    }
}
