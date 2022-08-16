import org.junit.jupiter.api.Test;

class TrapTest {

    @Test
    void trap() {
        Trap trap = new Trap();
        int trap1 = trap.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        assert trap1 == 6;

        int trap2 = trap.trap(new int[]{3, 0, 4, 1, 0});
        assert trap2 == 3;
    }
}