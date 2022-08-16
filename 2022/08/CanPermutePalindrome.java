public class CanPermutePalindrome {

	
	public boolean canPermutePalindrome(String s) {
		if (s == null || s.length() == 0)
			return true;
		int[] chars = new int[128];
		for (char c : s.toCharArray()) {
			chars[c]++;
		}
		boolean single = s.length() % 2 == 0;
		for (int i = 0; i < 128; i++) {
			if (chars[i] % 2 != 0) {
				if (single) {
					return false;
				} else {
					single = true;
				}
			}
		}
		return true;
	}
}
