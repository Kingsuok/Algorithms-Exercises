/**
 * 
 * 1.1.8 下列语句会打印出什么结果？给出解释。
 *
 * @author 2bab
 */
public class Ex_1_1_8 {

    public static void main(String[] args) {

        //'a'的ASCII是97，'b' 是 98，'c' 是 99，'e' 是 101

        //a，结果 b ，单字符直接打印
        System.out.println('b');

        //b，结果 197，两字符相加，加号重载，自动转换 char 为 int
        System.out.println('b' + 'c');

        //c，结果 e ，'a' + 4 为 101，转换成 char 为 e
        System.out.println((char) ('a' + 4));

    }

}
