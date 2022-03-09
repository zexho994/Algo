import org.junit.jupiter.api.Test;

class FindNthDigitTest {

    @Test
    public void test() {
        FindNthDigit findNthDigit = new FindNthDigit();
        int num = findNthDigit.nthUglyNumber(3);
        assert num == 3;
    }

}