//Part of Leetcode 278 : First Bad Version
package Easy;

public class VersionControl {
    private int firstBad;

    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    // API method provided by the problem
    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}
