//Leetcode 278 : First Bad Version
//Topic : Binary Search, Interactive
package Easy;

public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int firstBad) {
        super(firstBad);
    }
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isBadVersion(mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
