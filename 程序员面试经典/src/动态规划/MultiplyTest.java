package 动态规划;

import org.junit.jupiter.api.Test;

class MultiplyTest {

    @Test
    void multiply() {
        Multiply multiplyTest = new Multiply();
        int res1 = multiplyTest.multiply(10, 4);
        assert res1 == 40;

        int res2 = multiplyTest.multiply(10, 20);
        assert res2 == 200;

        int res3 = multiplyTest.multiply(11, 9);
        assert res3 == 99;

        int res4 = multiplyTest.multiply(21, 23);
        assert res4 == 483;

        int res5 = multiplyTest.multiply(1, 20);
        assert res5 == 20;
    }
}