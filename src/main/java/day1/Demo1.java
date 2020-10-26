package day1;
import  java.util.Scanner;


/**
 * //java代码
 * *方式一：直接加0.5然后取整，可以参考Math.round()源码
 * *方式二：对小数部分判断是否大于0.5，大于加0.5，不大于直接返回结果
 *
 * created by hlzMaster2020-15:47
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入参数
        double a = in.nextDouble();
        //取整数部分
        int b = (int)a;
        //判断
        if((a - b) >= 0.5){
            b=(int)(a + 0.5);
        }
        System.out.println(b);
    }
}
