import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindWord {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>();
        for(String str : wordDict){
            wordDictSet.add(str);
        }
        return findWord(s,wordDictSet);
    }

    public boolean findWord(String s, Set<String> set){
        if(s == null || s.equals("")){
            return true;
        }
        for(int i = 1; i <= s.length(); i++){
            if(set.contains(s.substring(0,i))){
                if(findWord(s.substring(i,s.length()),set)){
                    return true;
                }
            }
        }
        return false;
    }

}