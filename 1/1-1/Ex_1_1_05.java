/**
 * 编写一段程序，如果double类型的变量x和y都严格位于0，1之间则打印 true，否则打印 false。
 *
 * @author 2bab
 */
public class Ex_1_1_05 {

    public static void main(String[] args) {

        double x, y;

        x = StdRandom.uniform(0.0, 2.0);
        y = StdRandom.uniform(0.0, 2.0);

        StdOut.println("x = " + x + ", y = " + y);
        StdOut.print((x > 0) && (x < 1) && (y > 0) && (y < 1)
                ? "true" : "false");

    }

}
