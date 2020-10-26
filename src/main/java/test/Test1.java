package test;
import  java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer > map = new HashMap<>();

        while (sc.hasNext()){
            int num = sc.nextInt();
            Long l=0L;
            Long[] longs=new Long[num];
            String[] strs=new String[num];
            for (int i=0;i<num;i++){
                strs[i]=sc.nextLine();
            }
            for (int i=0;i<strs.length;i++){
                String[] strings = strs[i].split("[G,T,M]");
                for (String string : strings) {
                    String[] s = string.split("[0,1,2,3,4,5,6,7,8,9]");
                    map.put(s[1],Integer.parseInt(s[0]));
                    if (map.containsKey("M")){
                        int m = map.get("M") * 1024 * 1024;
                        map.replace("M", m);
                    }
                    else if (map.containsKey("G")){
                        int m = map.get("G") * 1024 ;
                        map.replace("G", m);
                    }

                }

                Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()){
                    l+=iterator.next().getValue();
                }
                longs[i]=l;
                map.clear();
            }
            Arrays.sort(longs);

        }
        sc.close();

    }
}
