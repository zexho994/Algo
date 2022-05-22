import java.util.ArrayList;
import java.util.List;

/**
 * @author : zexho
 * @created : 2022-05-22
**/
public class GenerateParenthesi{

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        bfs(n,0,ans,"");
        return ans;
    }

    private void bfs(int n,int count,List<String> ans,String str){
        if(n == 0 && count == 0){
            ans.add(str);
            return;
        }
        if(n > 0) {
            bfs(n-1,count+1,ans,str+"(");
        }
        if(count > 0){
            bfs(n,count-1,ans,str+")");
        }
    }

}
