/**
 * 1.1.27 二项分布。估计用一下代码计算 binomial(100, 50) 将会产生的递归调用次数
 *
 * @author 2bab
 */
public class Ex_1_1_27 {

    public static void main(String[] args) {

        int n = 20;
        int k = 10;
        double p = 0.5;
        Counter count = new Counter("times");

        StdOut.print(binomial(count, n, k, p) + "  ");
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
}
