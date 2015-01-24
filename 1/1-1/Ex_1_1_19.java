/**
 * 1.1.19 在计算机上运行以下程序：
 *
 * public class Fibonacci
 * {
 *     public static long F(int N)
 *     {
 *         if (N == 0) return 0;
 *         if (N == 1) return 1;
 *         return F(N-1) + F(N-2);
 *     }
 *
 *     public static void main(String[] args)
 *     {
 *         for(int N = 0; N < 100; N++)
 *          StdOut.println(N + " " + F(N));
 *     }
 * }
 *
 * 计算机用这段程序在一个小时之内能够得到的 F(N) 结果的最大 N 值是多少？
 * 开发 F(N) 的一个更好的实现，用数组保存已经计算过的值。
 *
 * @author 2bab
 */
public class Ex_1_1_19 {

    public static void main(String[] args) {

        StdOut.print(fibonacci(10));//55

    }

    static long fibonacci(int N) {
        long[] fibResult = new long[N + 1];

        fibResult[0] = 0;//为了符合题目保存在数组里的要求..
        if (N == 0) {
            return 0;
        }

        fibResult[1] = 1;
        if (N == 1) {
            return 1;
        }

        for (int i = 2; i <= N; i++) {
            fibResult[i] = fibResult[i - 1] + fibResult[i - 2];
        }

        return fibResult[N];
    }

}
