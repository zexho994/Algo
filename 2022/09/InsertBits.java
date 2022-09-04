public class InsertBits {
    public int insertBits(int N, int M, int i, int j) {
        int left = (N >> j >> 1) << j << 1;
        int mid = M << i;
        int right = N & ((1 << i) - 1);
        return left | mid | right;
    }
}
