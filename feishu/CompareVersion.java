/**
 * @author Zexho
 * @date 2022/4/1 8:11 PM
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int idx1 = 0, idx2 = 0;
        while (idx1 < v1.length && idx2 < v2.length) {
            int n1 = Integer.parseInt(v1[idx1++]);
            int n2 = Integer.parseInt(v2[idx2++]);
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            }
        }
        while (idx1 < v1.length) {
            if (Integer.parseInt(v1[idx1++]) > 0) {
                return 1;
            }
        }
        while (idx2 < v2.length) {
            if (Integer.parseInt(v2[idx2++]) > 0) {
                return -1;
            }
        }
        return 0;
    }
}
