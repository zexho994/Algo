import java.util.Arrays;

public class FindTheWinner {

	public int findTheWinner(int n, int k) {
		int[] members = new int[n];
		int removeCount = 1;
		int idx = 0;
		while (removeCount < n) {
			while (members[idx % n] == 1) {
				idx++;
			}
			int count = 1;
			while (count < k) {
				if (members[++idx % n] == 0) {
					count++;
				}
			}
			members[idx % n] = 1;
			removeCount++;
		}
		for (int i = 0; i < members.length; i++) {
			if (members[i] == 0)
				return i + 1;
		}
		return 0;
	}

}
