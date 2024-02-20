import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FindWordTest {

    private FindWord findWordInstance;

    @Before
    public void setUp() {
        findWordInstance = new FindWord();
    }

    @Test
    public void testWordBreakWithValidInput() {
        // 准备测试数据
        String s = "a";
        List<String> wordDict = Arrays.asList("a");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreakWithInvalidInput() {
        // 准备测试数据
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreakWithMultipleValidWords() {
        // 准备测试数据
        String s = "apple";
        List<String> wordDict = Arrays.asList("apple", "ple", "app");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreakWithMultipleInvalidWords() {
        // 准备测试数据
        String s = "apple";
        List<String> wordDict = Arrays.asList("ple", "app", "le");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertFalse(result);
    }

    @Test
    public void testWordBreakWithEmptyString() {
        // 准备测试数据
        String s = "";
        List<String> wordDict = Arrays.asList("a", "b", "c");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreakWithNullInput() {
        // 准备测试数据
        String s = null;
        List<String> wordDict = Arrays.asList("a", "b", "c");

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertTrue(result);
    }

    @Test
    public void testWordBreakWithEmptyWordDict() {
        // 准备测试数据
        String s = "leetcode";
        List<String> wordDict = Arrays.asList();

        // 执行测试
        boolean result = findWordInstance.wordBreak(s, wordDict);

        // 验证结果
        Assert.assertFalse(result);
    }
}
