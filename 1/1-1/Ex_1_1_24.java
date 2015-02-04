/**
 * 1.1.24 给出欧几里得算法计算 105 和 24 的最大公约数的过程中得到的一系列 p 和
 * q 的值。扩展该算法中的代码得到一个程序 Euclid，从命令行接受两个参数，计算它们的
 * 最大公约数并打印出每次调用递归方法时的两个参数。使用你的程序计算 1111111 和
 * 1234567的最大公约数。
 *
 * @author 2bab
 */
public class Ex_1_1_24 {

    public static void main(String[] args) {

        StdOut.println("105 和 24 的最大公约数是：" + euclid_1(105, 24));

        StdOut.println(Euclid());//1111111 和 1234567 的最大公约数是 1
    }

    /**
     * 计算 105 和 24 的最大公约数的过程中得到的一系列 p 和 q 的值
     */
    public static int euclid_1(int p, int q) {
        StdOut.println("p:" + p + " q:" + q);
        if (p % q != 0) return euclid_1(q, p % q);
        else return q;
    }

    public static int Euclid() {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        return euclid_1(p, q);
    }

}
