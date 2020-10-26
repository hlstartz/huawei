package day1;
import  java.util.* ;
/**
 * created by hlzMaster2020-13:03
 */
/*编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
输入
abaca
输出
3*/
public class Demo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
    System.out.println(getRuslt(str));
    }

    private static int getRuslt(String input) {

        HashMap<Character, Object> map = new HashMap<>();
        for (int i=0 ;i<input.length();i++){
            char c =input.charAt(i);
            if (0<c && c<127){
                map.put(c, new Object());
            }
        }
        return  map.keySet().size();
    }

}
/*
* import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(getResult(input));
    }

    public static int getResult(String input){
        Map<Character,Object> map = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(0<c &&c<127){
                map.put(c,new Object());
            }
        }
        return map.keySet().size();
    }
}*/

/*
凡是涉及到去重统计都可以用位图实现。因为每一个不同的数据只需要用二进制的一位存储即可，大大减小了统计所使用的存储空间
import java.util.Scanner;
import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        //总共有128个字符。字需要用128位
        BitSet bitSet = new BitSet(128);
        for (char c : line.toCharArray()) {
            //判断字符c是否已出现
            if (!bitSet.get(c)) {
                //未出现就设置为已出现
                bitSet.set(c);
            }
        }
        //统计有多少字符已出现过
        System.out.println(bitSet.cardinality());
    }
}
* */