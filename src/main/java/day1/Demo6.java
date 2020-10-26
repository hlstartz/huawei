package day1;

import  java.util.*;
/**
 * created by hlzMaster2020-16:03
 *
 * TODO 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s="";
        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            s+=c;
        }
        System.out.println(s);
    }
}
