/**
 * 1.1.25 使用数学归纳法正面欧几里得算法能够计算任意一对非负整数 p 和 q 的最大公约数
 *
 * @author 2bab
 */
public class Ex_1_1_25 {
    /*
      (原答案采自 http://course.onlinesjtu.com/mod/page/view.php?id=14462，此处经过整理)

      欧几里得算法：
          如果a是一个非负整数，b是一个正整数，r = a mod b，
          那么 a 和 b 的最大公约数等价于 b 和 r 的最大公约数
          即  gcd(a, b) = gcd(b, r)

      证明：
          依商和余数定理，存在q和r，满足：
              a = bq + r , 0 £ r < b
          如果可以证明a和b的公因子集合等于b和r公因子集合，就可以证明这个定理了。

          令c是a和b的一个公因子。
          有 c|bq，由于 c|a 且 c|bq，则 c|a-bq(=r)，即c|r。
          所以c是b和r的一个公因子。

          反之，如果c是b和r的一个公因子，那么 c|bq 且 c|bq+r(=a)，所以c是a和b的一个公因子。
          因此a和b的公因子集合等于b和r的公因子集合。

          因此gcd(a,b)=gcd(b,r)。
    */
}
