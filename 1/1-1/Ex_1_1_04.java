/**
 * 1.1.4 下列语句各有什么问题（如果有的话）？
 * <p>a.if(a > b) then c = 0;</p>
 * <p>if a > b { c = 0 }</p>
 * <p>if (a > b) c = 0;</p>
 * <p>if (a > b) c = 0 else b = 0;</p>
 *
 * @author 2bab
 */
public class Ex_1_1_04 {

    public static void main(String[] args) {

        int a = 3, b = 2, c;

        //if (a > b) then c = 0;          Java没有 then

        //if a > b { c = 0}               Java的 if 语句需要添加 ()

        if (a > b) c = 0;

        //if (a > b) c = 0 else b = 0;    Java的 if 和 else 之间需要分号
    }

}
