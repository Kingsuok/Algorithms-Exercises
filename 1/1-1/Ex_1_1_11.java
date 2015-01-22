/**
 * 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。
 * 其中包括使用 * 表示真，空格表示假。打印出行号和列号。
 *
 * @author 2bab
 */
public class Ex_1_1_11 {

    public static void main(String[] args) {

        final int ROW = 10;
        final int COL = 10;
        boolean[][] array = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = StdRandom.bernoulli();
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i][j]) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.println();
        }

    }

}
