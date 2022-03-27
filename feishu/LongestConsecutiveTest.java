import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveTest {

    @Test
    void longestConsecutive() {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        longestConsecutive.longestConsecutive(new int[]{100, 300, 2, 1, 5, 19, 3, 59, 4});

        int l2 = longestConsecutive.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        Assertions.assertEquals(l2, 9);
    }
}