import org.junit.jupiter.api.Test;

class MyPowTest {

    @Test
    void myPow() {
        MyPow2 myPow2 = new MyPow2();
        double res1 = myPow2.myPow(2, 10);
        assert res1 == 1024;

        double res3 = myPow2.myPow(2, -3);
        assert res3 == 1.0 / 8;

        double res2 = myPow2.myPow(2, -2147483648);
        assert res2 == 0;

    }
}