/**
 * 1.1.1 给出以下表达式的值：
 * <p>a.(0 + 15) / 2</p>
 * <p>b.2.0e-6*100000000.1</p>
 * <p>c.true && false || true && true</p>
 *
 * @author 2bab
 */

public class Ex_1_1_1 {

    public static void main(String[] args) {

        StdOut.println((0 + 15) / 2);// 7，整数相除取整（可尝试替换0为0.0）

        StdOut.println(2.0e-6 * 100000000.1);// 200.0000002

        StdOut.println(true && false || true && true);// true，"&&"运算符的优先级高于"||"

    }

}