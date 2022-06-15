import java.util.*;

/**
 * @author : zexho
 * @created : 2022-06-15
**/
public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> memo = new HashMap<>(strs.length);
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> list = memo.getOrDefault(s,new ArrayList<String>());
            list.add(str);
            memo.put(s,list);
        }
        return new ArrayList<List<String>>(memo.values());
    }
}
