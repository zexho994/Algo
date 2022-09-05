public class ConvertInteger {
    public int convertInteger(int A, int B) {
        int ans = 0;
        int num = A ^ B;
        while(num != 0){
            ans += (num&1);
            num >>>= 1;
        }
        return ans;
    }
}
