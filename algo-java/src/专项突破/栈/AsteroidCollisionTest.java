package 专项突破.栈;

import org.junit.jupiter.api.Test;

class AsteroidCollisionTest {

    @Test
    void asteroidCollision() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] res1 = asteroidCollision.asteroidCollision(new int[]{5, 10, -5});
    }
}