/**
 * 1.1.2 给出以下表达式的类型和值
 * <p>a.(1 + 2.236) / 2</p>
 * <p>b.1 + 2 + 3 + 4.0</p>
 * <p>c.4.1 >= 4</p>
 * <p>d.1 + 2 + "3"</p>
 *
 * @author 2bab
 */
public class Ex_1_1_02 {

    public static void main(String[] args) {

        //四个自动类型转换
        //Java 没有 typeof 运算，只能使用 instanceof 判断其包装类类型

        //所有浮点数默认 double 类型（可尝试替换 Double 为 Float）
        Object temp = (1 + 2.236) / 2;
        StdOut.print(temp instanceof Double);
        StdOut.println(" " + temp);

        //10.0
        temp = 1 + 2 + 3 + 4.0;
        StdOut.print(temp instanceof Double);
        StdOut.println(" " + temp);

        //true
        temp = 4.1 >= 4;
        StdOut.print(temp instanceof Boolean);
        StdOut.println(" " + temp);

        //33
        temp = 1 + 2 + "3";
        StdOut.print(temp instanceof String);
        StdOut.println(" " + temp);

    }


}
