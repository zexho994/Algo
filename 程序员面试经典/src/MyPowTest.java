import org.junit.jupiter.api.Test;

class MyPowTest {

    @Test
    void myPow() {
        MyPow myPow = new MyPow();
        double res1 = myPow.myPow(2, 10);
        assert res1 == 1024;

        double res3 = myPow.myPow(2, -3);
        assert res3 == 1.0 / 8;

        double res2 = myPow.myPow(2, -2147483648);
        assert res2 == 0;

    }
}