/**
 * 1.1.6 下面这段程序会打印出什么？
 *
 * @author 2bab
 */
public class Ex_1_1_06 {

    public static void main(String[] args) {

        //斐波那契数列

        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }

    }

}
