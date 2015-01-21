/**
 *
 * 1.1.7 分别给出以下各段代码打出的值
 *
 * @author 2bab
 */
public class Ex_1_1_7 {

    public static void main(String[] args) {

        //a，结果 3.00009，保留小数点后五位
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        StdOut.printf("%.5f\n", t);

        //b，结果 499500
        //等价于 1 + 2 + ... + 999
        //for (int i = 1; i < 1000; i++) sum += i;
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        //c，结果 1023
        //等价于 1 + 2 + 4 + ... + 512
        //for (int i = 1; i < 1000; i *= 2) sum += i;
        sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);


    }

}
