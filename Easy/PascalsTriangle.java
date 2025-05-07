//Leetcode 118 : Pascal's Triangle
//Topic : Array, Dynamic Programming
package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            for (int k = 0; k <= n; k++) {
                row.add(binomialCoefficient(n, k));
            }
            triangle.add(row);
        }
        return triangle;
    }
    private int binomialCoefficient(int n, int k) {
        long result = 1; 
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return (int) result;
    }
}
