package leetcode.tencent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyAtoiTest {

    @Test
    void myAtoi() {
        MyAtoi myAtoi = new MyAtoi();
        int n1 = myAtoi.myAtoi(" -1");
        Assertions.assertEquals(n1, -1);

        int n2 = myAtoi.myAtoi(" -381");
        Assertions.assertEquals(n2, -381);

        int n3 = myAtoi.myAtoi(" 381");
        Assertions.assertEquals(n3, 381);

        int n4 = myAtoi.myAtoi(" -3813944729271234");
        Assertions.assertEquals(n4, Integer.MIN_VALUE);

        int n5 = myAtoi.myAtoi("fdf ial 3813944729271234df");
        Assertions.assertEquals(n5, 0);

        int n6 = myAtoi.myAtoi("123");
        Assertions.assertEquals(n6, 123);
    }
}