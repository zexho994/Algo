import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : zexho
 * @created : 2022-06-19
**/
public class WordBrea{
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<String>(wordDict.size());
        boolean[] memo = new boolean[s.length()+1];
        for (String word : wordDict){
            wordSet.add(word);
        }
        return doBreak(s,0,wordSet,memo);
    }

    private boolean doBreak(String s,int idx,Set<String> wordSet,boolean[] memo){
        if (idx == s.length()) return true;
        for(int i = idx+1; i <= s.length(); i++){
            if(!memo[i] & wordSet.contains(s.substring(idx,i))){
                if (doBreak(s,i,wordSet,memo)){
                    return true;
                }else{
                    memo[idx] = true;
                }
            }
        }
        return false;
    }
}
