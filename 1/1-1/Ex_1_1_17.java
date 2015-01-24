/**
 * 1.1.17 找出以下递归函数的问题
 *
 * @author 2bab
 */
public class Ex_1_1_17 {

    public static void main(String[] args) {

        StdOut.print(exR2(6));//StackOverflowError, exR2(n-3)无限递归

    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
