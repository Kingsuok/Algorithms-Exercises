/**
 * 1.1.16 给出exR1(6)的返回值
 *
 * @author 2bab
 */
public class Ex_1_1_16 {

    public static void main(String[] args) {

        StdOut.print(exR1(6));//311361142246

    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }


}
