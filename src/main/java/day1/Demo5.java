package day1;
import  java.util.*;
/**
 * TODO 输入一个整数，将这个整数以字符串的形式逆序输出
 *  程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 * created by hlzMaster2020-15:55
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s1="";
        String str = num + "";
        for (int i=str.length()-1;i>=0;i--){
            char c =str.charAt(i);
            s1+=c;
        }
        System.out.println(s1);
    }
}
/*
* import java.util.Scanner;

public class Main {

    private static String getString(int number) {
        StringBuilder s = new StringBuilder();
        while (number != 0) {
            s.append(number % 10);
            number /= 10;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result = getString(number);
        System.out.println(result);
    }
}*/