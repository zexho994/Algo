public class ReplaceSpaces {

	public static void main(String[] args) {
		String s1 = "Mr John Smith    ";
		ReplaceSpaces rs = new ReplaceSpaces();
		String a1 = rs.replaceSpaces(s1, 13);
		System.out.println(a1);

		String s2 = "                    ";
		String a2 = rs.replaceSpaces(s2, 5);
		System.out.println(a2);
	}

	// 利用StringBuilder进行构造
	public String replaceSpaces(String S, int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(S.charAt(i) != ' ' ? S.charAt(i) : "%20");
		}
		return sb.toString();
	}

	// 从尾部开始追加，进行构造
	public String replaceSpaces2(String S, int length) {
		

		return "";
	}

}