class TwoSumTest {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] res1 = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        assert res1[0] == 1;
        assert res1[1] == 2;
    }

}