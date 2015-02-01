import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.1.21 编写一个程序，从标准输入按行读取数据，其中每行都包括一个名字和两个整数。
 * 然后用 printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数
 * 除以第二个整数的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中率
 * 或者学生的考试分数制成表格。
 *
 * @author 2bab
 */
public class Ex_1_1_21 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> score = new ArrayList<Integer>();

        String nameRegex = "[\\u4E00-\\u9FA5]{2,}|\\b\\w+\\b";//匹配中文名字或者英文名字
        String intRegex = "\\d+";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern intPattern = Pattern.compile(intRegex);
        Matcher nameMatcher;
        Matcher intMatcher;

        // Intellij IDEA 的 console 使用 ctrl/command +d 结束输入
        while (StdIn.hasNextLine()) {
            String data = StdIn.readLine();
            nameMatcher = namePattern.matcher(data);
            if (nameMatcher.find()) {
                names.add(nameMatcher.group());
            }
            intMatcher = intPattern.matcher(data);
            while (intMatcher.find()) {
                score.add(Integer.parseInt(intMatcher.group()));
            }
        }

        //输入只有类型限制的情况下，只能在输出做长度限制，这里假设名字都在10个字符内，分数都在100以内
        int length = names.size();
        for (int i = 0; i < length; i++) {
            int first = score.get(2 * i);
            int second = score.get(2 * i + 1);
            StdOut.printf("%-11s%-4d%-4d", names.get(i), first, second);
            StdOut.printf("%.3f", (double) first / second);
            StdOut.println();
        }

    }


}
