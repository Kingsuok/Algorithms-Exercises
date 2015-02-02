import java.util.Arrays;

/**
 * 1.1.22 使用1.1.6.4节中的 rank() 递归方法重新实现 BinarySearch
 * 并跟踪该方法的调用。每当该方法被调用时，打印出它的参数lo和hi并按照递归
 * 的深度缩进。提示：为递归方法添加一个参数来保存递归的深度。
 *
 * @author 2bab
 */
public class Ex_1_1_22 {

    public static void main(String[] args) {

        int[] array = StdIn.readAllInts();

        Arrays.sort(array);

        int key = StdIn.readInt();

        if (rank(key, array) != -1){
            StdOut.println(key + " is in the array.");
        }

    }

    public static int rank(int key, int[] a) {
        return rank(0, key, a, 0, a.length - 1);
    }

    public static int rank(int depth, int key, int[] a, int lo, int hi) {
        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        StdOut.println(lo + " " + hi);

        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return rank(depth + 1, key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(depth + 1, key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

}
