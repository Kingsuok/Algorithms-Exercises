import java.util.Arrays;

/**
 * 1.1.29 等值键。为 BinarySearch 类添加一个静态方法 rank()，它接受一个键和一个整型有序数组
 * (可能存在重复键) 作为参数并返回数组中小于该键的元素数量，以及一个类似的方法 count() 来返回
 * 数组中等于该键的元素的数量。注意：如果i和j分别是 rank(key, a) 和 count(key, a) 的返回值
 * 那么a[i..i+j-1]就是数组中所有和key相等的元素。
 *
 * @author 2bab
 */
public class Ex_1_1_29 {

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int i = rank(key, whiteList);
            int j = count(key, whiteList);
            StdOut.println(whiteList[i - 1] + ","
                    + whiteList[i] + "..."
                    + whiteList[i + j - 1] + ","
                    + whiteList[i + j]);
        }
    }

    //由于参数相同，此处图方便去掉了原二分查找的方法
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                while (--mid >= 0 && a[mid] == key) ;
                return mid + 1;
            }
        }
        return 0;
    }

    public static int count(int key, int[] a) {
        int begin = rank(key, a);
        int count = 0;
        for (int i = begin + 1; a[i] <= key; i++) {
            count++;
        }
        return count;
    }

}
