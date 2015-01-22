/**
 * 1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值
 *
 * @author 2bab
 */
public class Ex_1_1_9 {

    public static void main(String[] args) {

        int origin = 32;
        StdOut.println(integerToBinaryString(origin));//输出 100000

    }

    //书本参考答案
    public static String integerToBinaryString(int N) {
        String s = "";
        for (long n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    /**
     * 自己实现，因为习惯 StringBuilder 拼字符串，但其实十进制转二进制在int范围内
     * 甚至是long范围内都不需要多少次计算，如Long.MAX_VALUE也只需要31次循环，
     * 所以书本答案的简洁程度简直一流
     */
    /*public static String integerToBinaryString(int origin) {

        //int转二进制存入StringBuilder（此时是逆序）
        StringBuilder binary = new StringBuilder();
        while (origin != 1) {
            binary.append(String.valueOf(origin % 2));
            origin /= 2;
        }
        binary.append("1");

        //StringBuilder 转 char[] 方便再逆序
        char[] temp = binary.toString().toCharArray();
        binary = new StringBuilder();

        //将逆序StringBuilder反转成顺序
        for (int i = temp.length - 1; i >= 0 ; i--) {
            binary.append(temp[i]);
        }
        return binary.toString();

    }*/


}
