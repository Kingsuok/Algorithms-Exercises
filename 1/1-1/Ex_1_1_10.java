/**
 * 1.1.10 下面这段代码有什么问题？
 *     int[] a;
 *     for(int i = 0; i < 10; i++){
 *         a[i] = i * i;
 *     }
 *
 * @author 2bab
 */
public class Ex_1_1_10 {

    public static void main(String[] args) {
        int[] a;
        for(int i = 0; i < 10; i++){
        //    a[i] = i * i; // Variable 'a' might not have been initialized
        }
    }

}
