package 专项突破.栈;

import org.junit.jupiter.api.Test;

class LargestRectangleAreaTest {

    @Test
    void largestRectangleArea() {
        LargestRectangleArea largestRectangleArea = new LargestRectangleArea();
        int size = largestRectangleArea.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        assert size == 10;
    }

}