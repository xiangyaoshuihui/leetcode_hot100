import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class medium_49 {
    public static void main(String[] args){
        System.out.println("helloworld");
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();


        for(String i:strs){
            char []cc=new char[i.length()];
            Arrays.sort(cc);
            String temp_s=new String(cc);
            if(m.containsKey(temp_s)){
                m.get(temp_s).add(i);
            }
            else{
                m.put(temp_s,new ArrayList<String>(){{add(i);}});
            }
        }

        for(Map.Entry<String,List<String>> entry : m.entrySet()){
            result.add(entry.getValue());
        };
        return result;
    }

    //官方题解
        public List<List<String>> groupAnagrams11(String[] strs) {
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
            return new ArrayList<List<String>>(map.values());
        }
    
    
}
