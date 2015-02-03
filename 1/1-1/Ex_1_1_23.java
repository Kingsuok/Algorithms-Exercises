import java.util.Arrays;

/**
 * 1.1.23 为 BinarySearch的测试用例添加一个参数：+ 打印出标准输入中不在
 * 白名单上面的值；- 则打印出标准输入中在白名单上的值
 *
 * @author 2bab
 */
public class Ex_1_1_23 {

    public static void main(String[] args) {

        //白名单数列
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniform(10);
        }
        Arrays.sort(array);

        //接受 + 或 - 的参数
        boolean printFlag = args[0].equals("+");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int result = rank(key, array);
            if (result != -1 && !printFlag) {
                StdOut.println(key + " is in the array.");
            } else if (result == -1 && printFlag) {
                StdOut.println(key + " isn't in the array.");
            }
        }

    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

}
