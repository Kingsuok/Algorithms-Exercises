/**
 * 1.1.20 编写一个递归的静态方法计算 ln(N!) 的值
 *
 * @author 2bab
 */
public class Ex_1_1_20 {


    public static void main(String[] args) {

        int N = StdIn.readInt();
        double result = lnFactorial(N);
        StdOut.println(result);
        StdOut.print(Math.pow(Math.E, result)); //例如输入为4，检验结果为23.99999999999999 ≈ 24

    }

    public static double lnFactorial(int n) {
        if (n == 1) {
            return 0;
        }
        return Math.log(n) + lnFactorial(n - 1);
    }

}
