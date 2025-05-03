//Leetcode 381 : Insert Delete GetRandom O(1) - Duplicates allowed
//Topic : Array, Hash Table, Math, Design, Randomized 
package Hard;
import java.util.*;
class InsertDeleteGetRandom{
    ArrayList<Integer> arr;
    HashMap<Integer, Set<Integer>> map; //index
    java.util.Random rand = new java.util.Random();

    public void RandomizedCollection() {
        arr = new ArrayList<Integer>();
        map = new HashMap<Integer, Set<Integer>>();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        if (!map.containsKey(val)) map.put(val, new LinkedHashSet<Integer>());
        map.get(val).add(arr.size());
        arr.add(val);
        return map.get(val).size() == 1;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val) || map.get(val).size() == 0) return false;
        int remove_map = map.get(val).iterator().next();
        map.get(val).remove(remove_map);
        int last = arr.get(arr.size() - 1);
        arr.set(remove_map, last);
        map.get(last).add(remove_map);
        map.get(last).remove(arr.size() - 1);

        arr.remove(arr.size() - 1);
        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
}