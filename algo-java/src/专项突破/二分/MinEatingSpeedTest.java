package 专项突破.二分;

import org.junit.jupiter.api.Test;

class MinEatingSpeedTest {

    @Test
    void minEatingSpeed() {
        MinEatingSpeed minEatingSpeed = new MinEatingSpeed();
        int res = minEatingSpeed.minEatingSpeed(new int[]{3, 6, 7, 11}, 8);
        assert res == 4;
    }
}