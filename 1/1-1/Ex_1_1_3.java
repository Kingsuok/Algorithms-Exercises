/**
 *
 * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal ，否则打印 not equal
 *
 * @author 2bab
 */
public class Ex_1_1_3 {

    public static void main(String[] args) {

        int[] input = new int[3];
        for (int i = 0; i < 3; i++ ){
            input[i] = StdIn.readInt();
        }

        System.out.println((input[0]==input[1])&&(input[1]==input[2])
                ?"equal":"not equal");

    }

}
