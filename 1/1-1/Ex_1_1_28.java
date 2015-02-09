import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.1.28 删除重复元素。修改 BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。
 *
 * @author 2bab
 */
public class Ex_1_1_28 {

    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        // sort the array
        Arrays.sort(whiteList);

        List<Integer> tempList = new ArrayList<Integer>();
        int temp = whiteList[0];
        tempList.add(temp);
        for (int i = 1; i < whiteList.length; i++) {
            if (temp != whiteList[i]) {
                temp = whiteList[i];
                tempList.add(temp);
            }
        }

        int size = tempList.size();
        whiteList = new int[size];
        for (int i = 0; i < size; i++) {
            whiteList[i] = tempList.get(i);
        }

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1)
                StdOut.println(key);
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
