/**
 * 编写一个静态方法 histogram()，接受一个整型参数 a[] 和一个整数 M 为参数
 * 并返回一个大小为 M 的数组，其中第 i 个元素的值为整数 i 在参数数组中出现的
 * 次数。如果 a[] 中的值均在 0 到 M - 1 之间，返回数组中所有元素之和应该和
 * a.length 相等。
 *
 * @author 2bab
 */
public class Ex_1_1_15 {

    public static void main(String[] args) {
        final int LENGTH = 100;
        final int M = 50;
        int[] a = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            a[i] = StdRandom.uniform(M);//随机a[]，使 a[] 中的值均在 0 到 M - 1 之间
        }

        int[] result = histogram(a, M);//统计结果

        //打印出分布表以及 a.length 与 result数组所有元素之和的对比
        for (int i = 0; i < M; i++) {
            StdOut.printf("%-4d", i);
        }
        StdOut.println();
        int resultTotal = 0;
        for (int i = 0; i < M; i++) {
            StdOut.printf("%-4d", result[i]);
            resultTotal += result[i];
        }
        StdOut.println();
        StdOut.print("Length: " + LENGTH + "  Result Total: " + resultTotal);

    }

    public static int[] histogram(int[] a, int M) {
        int[] count = new int[M];
        for (int temp : a) {
            if (temp < M) {
                count[temp]++;
            }
        }
        return count;
    }
}
