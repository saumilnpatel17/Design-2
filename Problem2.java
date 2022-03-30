Time Complexity : O(1) for all the methods: add, remove, contains
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class MyHashSet {
    int buckets;
    int bucketSize;
    boolean[][] setStorage;
    
    public MyHashSet() {
        buckets = 1000;
        bucketSize = 1000;
        setStorage = new boolean[buckets][];
    }
    
    private int getBucket(int key){
        return key % buckets;
    }
    
    private int getBucketItem(int key){
        return key / bucketSize;
    }for
    
    public void add(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        
        if(setStorage[bucket] == null){
            setStorage[bucket] = bucket == 0 ? new boolean[bucketSize + 1] : new boolean[bucketSize];
        }
        
        setStorage[bucket][bucketItem] = true;
    }
    
    public void remove(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        
        if(setStorage[bucket] != null){
            setStorage[bucket][bucketItem] = false;
        }
    }
    
    public boolean contains(int key) {
        int bucket = getBucket(key);
        int bucketItem = getBucketItem(key);
        
        if(setStorage[bucket] == null){
            return false;
        }
        
        return setStorage[bucket][bucketItem];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
