package dayplan.day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int len1 = lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
        assert len1 == 3;
        int len2 = lengthOfLongestSubstring.lengthOfLongestSubstring("a b c");
        assert len2 == 3;
        int len3 = lengthOfLongestSubstring.lengthOfLongestSubstring("abcdd");
        assert len3 == 4;
    }
}