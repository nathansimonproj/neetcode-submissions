class LRUCache {

    //leastRecent --> mostRecent
    private int cap;
    private Node leastRecent;
    private Node mostRecent;
    private Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        
        this.cap = capacity;
        this.leastRecent = new Node(0, 0);
        this.mostRecent = new Node(0, 0);
        this.cache = new HashMap<>();

        leastRecent.next = mostRecent;
        mostRecent.prev = leastRecent;
    }
    
    public int get(int key) {
        
        if(!cache.containsKey(key)) {
            return -1;
        }

        Node curr = cache.get(key);
        remove(curr);
        add(curr);

        return curr.val;
    }
    
    public void put(int key, int value) {
        
        //remove, create node, add to cache, if overflow remove
        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node curr = new Node(key, value);
        add(curr);
        cache.put(key, curr);

        if(cache.size() > cap) {
            Node lru = this.leastRecent.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    private void remove(Node node) {

        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;

    }

    private void add(Node node) {

        Node prev = mostRecent.prev;
        prev.next = node;
        node.prev = prev;

        node.next = mostRecent;
        mostRecent.prev = node;

    }

    class Node {

        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
}
