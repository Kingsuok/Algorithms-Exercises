/**
 * 1.1.14 编写一个静态方法 lg(), 接受一个整型参数 N，返回不大于 log2N 的最大整数。
 * 不要使用 MATH 库。
 *
 * @author 2bab
 */
public class Ex_1_1_14 {

    public static void main(String[] args) {

        //此处的所有实现只考虑了 int 范围内的正整数
        int result = lg(Integer.MAX_VALUE / 2);
        StdOut.print(result);

    }

    /**
     * 最容易想到的无脑遍历
     */
    /*public static int lg(int N){
        int num = 1;
        int count = 0;
        while (num * num < N){
            num++;
            count++;
        }
        StdOut.println(count);// 32767次循环
        return --num;
    }*/

    /**
     * 相对高效的步进增长型遍历
     */
    /*public static int lg(int N) {
        int num = 1;
        int step = 0;
        int count = 0;
        while (num * num < N) {
            num += ++step;
            count++;
        }

        for (int i = num - step; i < num; i++) {
            count++;
            if (i * i > N) {
                num = i - 1;
                break;
            }
        }

        StdOut.println(count);// 384次循环
        return num;
    }*/

    /**
     * 速度最快的牛顿迭代法
     *
     * @param N 待求平方根的整数（这里只考虑正数）
     * @return 不大于 N 的平方根的最大整数
     */
    public static int lg(int N) {

        if (N == 1) {
            return 1;
        } else {
            double x;
            x = N;
            int count = 0;
            while (x * x - N > 0.01 || x * x - N < -0.01) {
                x = (x + N / x) / 2;
                count++;
            }
            StdOut.println(count);// 19次循环
            return (int) x;
        }
    }
}
