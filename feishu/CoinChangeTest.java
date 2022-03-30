import org.junit.jupiter.api.Test;

class CoinChangeTest {

    @Test
    void coinChange() {
        CoinChange change = new CoinChange();
        change.coinChange(new int[]{186, 419, 83, 408}, 6249);
    }
}