/**
 * 1.1.26 将三个数字排序。假设a、b、c和t都是同一种原始数字类型的变量。
 * 证明以下代码能够将a、b、c按照升序排列。
 * <p/>
 * if (a > b) {t = a; a = b; b = t;}
 * if (a > c) {t = a; a = c; c = t;}
 * if (b > c) {t = b; b = c; c = t;}
 *
 * @author 2bab
 */
public class Ex_1_1_26 {

    /*
      由 if (a > b) {t = a; a = b; b = t;} 则必有 a < b，
      同理得 a < c， b < c，三个联合得 a < b < c
    */
}
