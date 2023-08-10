import java.util.ArrayList;
import java.util.List;

public class Package {

    public static void main(String[] args) {
//        dp(new int[]{
//                873,585,528,507,
//                868,626,760,621,
//                617,775,532,819,
//                831,710,784,725
//        });

        dfs(new int[]{
               549,649,648,699,
               523,726,575,634,
               881,723,800,594,
               878,590,530,660
        },0,0,new ArrayList<>());
    }

    public static void dp(int[] packages){

        boolean[][] memo = new boolean[16][5001];

        for(int i = 0; i < 16; i++){
            memo[0][packages[i]] = true;
        }

        for(int i = 1; i < 16; i++){
            for(int k = 5000; k > 0; k--){
                if(memo[i-1][k]){
                    for(int j = 0; j < 16; j++){
                        if(k+packages[j]<=5000){
                            memo[i][k+packages[j]] = true;
                        }
                    }
                    break;
                }
            }
        }

        for(int i = 5000; i > 0; i--){
            if(memo[15][i]){
                System.out.println(i);
                break;
            }
        }
    }

    static int max = 0;

    public static void dfs(int[] packages,int sum,int deep, List<Integer> list){
        if(sum > 5000){
            return;
        }
        if(deep == 16){
            if(sum > max){
                max = sum;
                list.forEach(System.out::print);
                System.out.println();
            }
            return;
        }

        for(int i = 0; i < 16; i++){
            list.add(packages[i]);
            dfs(packages,sum+packages[i],deep+1,list);
            list.remove(list.size()-1);
        }
    }
}
