package day2;
import  java.util.*;
/**
 * TODO
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 *接口说明  反转句子
 *  * @param sentence 原句子
 *  * @return 反转后的句子
 *
 *public String reverse(String sentence);
 * created by hlzMaster2020-9:45
 */
public class Demo1 {
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split("\\s");
        String resStr="";
        for (int i=s.length-1;i>=0;i--){
            resStr+=s[i]+" ";
        }
        System.out.println(resStr);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> words = new LinkedList<>();
        for (String word : scanner.nextLine().split("\\s+")) {
            words.addFirst(word);
        }
        System.out.println(String.join(" ", words));
    }

}

/*import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(getResult(input));
    }

    public static String getResult(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] arr = input.split("\\s");
        for (String str : arr) {
            stack.push(str);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        return sb.toString();
    }
}*/