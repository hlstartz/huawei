package day2;

import java.util.Arrays;
import java.util.Scanner;

/**TODO 给定n个字符串，请对n个字符串按照字典序排列。
 *
 * created by hlzMaster2020-10:08
 * 输入描述:
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述:
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String[] strings=new String[num];
            for (int i=0 ;i<num;i++){
                String s = sc.next();
                strings[i]=s;
            }
            Arrays.sort(strings);
            for (int i=0 ;i<strings.length;i++){
                System.out.println(strings[i]);
            }
        }
        sc.close();

    }
}
