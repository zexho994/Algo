import org.junit.jupiter.api.Test;

class ToudaoTest {

    @Test
    void solution() {
        Toudao t = new Toudao();
        int[] arr1 = new int[]{1, 3, 4, 2, 8, 1, 2}; // 3,2,1
        int ans1 = t.solution(arr1);
        assert ans1 == 6;

        int[] arr2 = new int[]{1, 6, 4, 2, 8, 1, 2, 10}; // 1,4,2,1,2
        int ans2 = t.solution(arr2);
        assert ans2 == 10;
    }
}