class LRUCache {

    private int capacity;
    private Node mostRecent; //right
    private Node leastRecent; //left
    private Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        
        this.capacity = capacity;
        this.mostRecent = new Node(0, 0);
        this.leastRecent = new Node(0, 0);
        leastRecent.next = mostRecent;
        mostRecent.prev = leastRecent;
        this.cache = new HashMap<>();
    }

    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {

        Node prev = this.mostRecent.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.mostRecent;
        this.mostRecent.prev = node;

    }
    
    public int get(int key) {
        
        
        if(!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key); 
        remove(node);
        insert(node);
        return node.val;

    }
    
    public void put(int key, int value) {

        if(cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if(cache.size() > capacity) {
            Node lru = this.leastRecent.next;
            remove(lru);
            cache.remove(lru.key);
        }
        /*

            cases

                first
                    add to cache
                    set most/recent

                unseen
                    new node, add to front, evict if necessary

                seen
                    update val, recache
        */
    }

    public void reCache(Node curr) {

        Node prev = curr.prev;
        Node next = curr.next;

        prev.next = next;
        next.prev = prev;

        mostRecent.prev = curr;
        curr.next = mostRecent;
        mostRecent = curr;
        mostRecent.prev = null;
        
    }

    /*

        get
            check cache

                doesnt exist --> return -1

                exists --> remove == link prev to next --> move to front
            
        move to front

        mostRecent.prev = node
        node.next = mostRecent;

        mostRecent = mostRecent.prev

    */

    class Node {

        private int key;
        private int val;
        private Node prev;
        private Node next;

        public Node(int key, int val) {

            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
}
