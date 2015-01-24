/**
 * 1.1.18 请看一下递归函数
 * <p/>
 * mystery(2, 25) 和 mystery(3, 11) 的返回值是多少？给定正整数 a 和 b，
 * mystery(a, b)计算的结果是什么？将代码中的+替换为*并将 return 0 改为
 * return 1，然后回答相同的问题。
 *
 * @author 2bab
 */
public class Ex_1_1_18 {

    public static void main(String[] args) {

        StdOut.println(mystery(2, 25));// 50
        StdOut.println(mystery(3, 11));// 33
        // + 号情况下，结果为 a * b
        // * 号情况下，结果为 a ^ b

    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    /*public static int mystery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a * a, b / 2);
        return mystery(a * a, b / 2) * a;
    }*/

}
