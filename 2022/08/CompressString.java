public class CompressString {

	public String compressString(String S) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length();) {
			char ch = S.charAt(i);
			sb.append(ch);
			int j = i + 1;
			while (j < S.length() && S.charAt(j) == ch) {
				j++;
			}
			sb.append(j - i);
			i = j;
		}
		return sb.toString().length() >= S.length() ? S : sb.toString();
	}

}
