package leetcode.easy;

/**
 * 1025. 除数博弈
 * @author: zexho
 * @created: 2020/07/24 08:51
 */
public class DivisorGame {
    public boolean divisorGame(int N) {
        return fun(N,false);
    }

    public boolean fun(int N,boolean b){
        for(int i = 1 ; i < N ; i++){
            if(N%i==0){
                return fun(N-i,!b);
            }
        }
        return b;
    }
}
