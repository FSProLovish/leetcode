class MyHashSet {

    HashSet<Integer> set;

    public MyHashSet() {
        this.set = new HashSet<>();
    }
    
    public void add(int key) {
        this.set.add(key);
    }
    
    public void remove(int key) {
        this.set.remove(key);
    }
    
    public boolean contains(int key) {
        return this.set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */