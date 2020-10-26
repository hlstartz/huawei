package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * created by hlzMaster2020-16:29
 *
 *
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i=0;i<num;i++){
                int key=scanner.nextInt();
                int value=scanner.nextInt();
                if (map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }

            }
            for (Map.Entry<Integer,Integer> integerIntegerEntry:map.entrySet()){
                System.out.println(integerIntegerEntry.getKey()+" "+integerIntegerEntry.getValue());
            }
        }
        }



    }

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in))) {
            String str = null;

            while ((str = br.readLine()) != null) {
                int num = Integer.parseInt(str);
                TreeMap<Integer, Integer> tm = new TreeMap<>();
                for (int i = 0; i < num; i++) {
                    str = br.readLine();
                    String[] strArr = str.split(" ");
                    Integer key = Integer.valueOf(strArr[0]);
                    Integer value = Integer.valueOf(strArr[1]);
                    if(!tm.containsKey(key)) {
                        tm.put(key,value);
                    } else {
                        tm.put(key,tm.get(key) + value);
                    }
                }
                Set<Integer> keySet = tm.keySet();
                for (Integer i : keySet) {
                    System.out.println(i + " " + tm.get(i));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/

/*
* import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 *
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 *
 * 输出描述:
 * 输出合并后的键值对（多行）

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i = 0;i<num;i++){
                int key =scanner.nextInt();
                int value =scanner.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else {
                    map.put(key,value);
                }
            }
            for(Map.Entry<Integer,Integer> integerEntry :map.entrySet()){
                System.out.println(integerEntry.getKey()+" "+integerEntry.getValue());
            }
        }
    }
}
*/