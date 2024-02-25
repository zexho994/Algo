public class IsInterleave {

    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()){
            return false;
        }
        int[] dp = new int[s1.length()+1];
        dp[0] = 1;

        for(int i = 0; i < s3.length(); i++){
            boolean flag = false;
            for(int j = dp.length-1; j >= 0; j--){
                if(dp[j] != 0){
                    dp[j] = 0;
                    if(j < s1.length() && s3.charAt(i) == s1.charAt(j)){
                        flag = true;
                        dp[j+1] = 1;
                    }
                    if(i-j < s2.length() && s3.charAt(i) == s2.charAt(i-j)){
                        flag = true;
                        dp[j] = 1;
                    }
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }

}
