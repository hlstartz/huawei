package day2;

import java.util.HashMap;
import java.util.Scanner;

/**TODO 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

 输入描述:
 输入一个整数（int类型）

 输出描述:
 这个数转换成2进制后，输出1的个数
 * created by hlzMaster2020-10:19
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();// 放在循环里面?
        while (sc.hasNext()){
            int a = sc.nextInt();

            String s = Integer.toBinaryString(a);
            char[] chars = s.toCharArray();
            for (int i=0;i<chars.length;i++){
                if(map.containsKey(chars[i])){
                    map.put(chars[i],map.get(chars[i])+1);
                }
                else {
                    map.put(chars[i],1);
                }
            }
            System.out.println(map.get('1'));
        }

        sc.close();
    }
}
