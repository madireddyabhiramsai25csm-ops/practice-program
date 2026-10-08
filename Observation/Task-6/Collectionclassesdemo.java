import java.util.*;

public class CollectionClassesDemo {

    public static void main(String[] args) {

        // 1. ArrayList
        System.out.println("===== ARRAYLIST =====");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add(1, "C++");

        System.out.println("List: " + list);
        System.out.println("Get index 0: " + list.get(0));

        list.set(0, "Java Programming");
        System.out.println("After set: " + list);

        System.out.println("Contains Python: " + list.contains("Python"));
        System.out.println("Size: " + list.size());
        System.out.println("Index of C: " + list.indexOf("C"));

        list.add("Java Programming");
        System.out.println("Last index of Java Programming: "
                + list.lastIndexOf("Java Programming"));

        list.remove("C++");
        System.out.println("After remove: " + list);

        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("After sorting: " + list);


        // 2. LinkedList
        System.out.println("\n===== LINKEDLIST =====");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.addFirst("C");
        linkedList.addLast("C++");

        System.out.println("LinkedList: " + linkedList);
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());
        System.out.println("Get index 1: " + linkedList.get(1));

        linkedList.offer("JavaScript");
        System.out.println("After offer: " + linkedList);

        System.out.println("Peek: " + linkedList.peek());
        System.out.println("Poll: " + linkedList.poll());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing first and last: "
                + linkedList);


        // 3. Vector
        System.out.println("\n===== VECTOR =====");

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.addElement(30);

        System.out.println("Vector: " + vector);
        System.out.println("Get index 1: " + vector.get(1));

        vector.set(1, 25);
        System.out.println("After set: " + vector);

        vector.remove(0);
        vector.removeElement(30);

        System.out.println("After remove: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Contains 25: " + vector.contains(25));


        // 4. Stack
        System.out.println("\n===== STACK =====");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Empty: " + stack.empty());


        // 5. HashSet
        System.out.println("\n===== HASHSET =====");

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 20: " + hashSet.contains(20));
        System.out.println("Size: " + hashSet.size());

        hashSet.remove(10);
        System.out.println("After remove 10: " + hashSet);
        System.out.println("Is Empty: " + hashSet.isEmpty());


        // 6. LinkedHashSet
        System.out.println("\n===== LINKEDHASHSET =====");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Contains 10: "
                + linkedHashSet.contains(10));
        System.out.println("Size: " + linkedHashSet.size());

        linkedHashSet.remove(20);
        System.out.println("After remove 20: " + linkedHashSet);


        // 7. TreeSet
        System.out.println("\n===== TREESET =====");

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("TreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("Higher than 20: " + treeSet.higher(20));
        System.out.println("Lower than 20: " + treeSet.lower(20));
        System.out.println("Ceiling of 20: " + treeSet.ceiling(20));
        System.out.println("Floor of 20: " + treeSet.floor(20));

        System.out.println("Poll First: " + treeSet.pollFirst());
        System.out.println("Poll Last: " + treeSet.pollLast());
        System.out.println("TreeSet after polling: " + treeSet);


        // 8. PriorityQueue
        System.out.println("\n===== PRIORITYQUEUE =====");

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.offer(10);
        priorityQueue.add(20);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Contains 20: " + priorityQueue.contains(20));
        System.out.println("Size: " + priorityQueue.size());
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("After poll: " + priorityQueue);


        // 9. ArrayDeque
        System.out.println("\n===== ARRAYDEQUE =====");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println("Deque: " + deque);
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("Deque after polling: " + deque);


        // 10. HashMap
        System.out.println("\n===== HASHMAP =====");

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(101, "Raj");
        hashMap.put(102, "Ravi");
        hashMap.put(103, "Sita");

        System.out.println("HashMap: " + hashMap);
        System.out.println("Get key 101: " + hashMap.get(101));
        System.out.println("Contains key 102: "
                + hashMap.containsKey(102));
        System.out.println("Contains value Raj: "
                + hashMap.containsValue("Raj"));
        System.out.println("Size: " + hashMap.size());
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries: " + hashMap.entrySet());

        System.out.println("Get key 105: "
                + hashMap.getOrDefault(105, "Not Found"));

        hashMap.remove(103);
        System.out.println("After remove: " + hashMap);


        // 11. LinkedHashMap
        System.out.println("\n===== LINKEDHASHMAP =====");

        LinkedHashMap<Integer, String> linkedHashMap =
                new LinkedHashMap<>();

        linkedHashMap.put(101, "Raj");
        linkedHashMap.put(102, "Ravi");
        linkedHashMap.put(103, "Sita");

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Get key 102: "
                + linkedHashMap.get(102));
        System.out.println("Contains key 101: "
                + linkedHashMap.containsKey(101));
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
        System.out.println("Entries: " + linkedHashMap.entrySet());

        linkedHashMap.remove(103);
        System.out.println("After remove: " + linkedHashMap);


        // 12. TreeMap
        System.out.println("\n===== TREEMAP =====");

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(103, "Sita");
        treeMap.put(101, "Raj");
        treeMap.put(102, "Ravi");
        treeMap.put(104, "Kiran");

        System.out.println("TreeMap: " + treeMap);
        System.out.println("Get key 101: " + treeMap.get(101));
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Higher Key than 102: "
                + treeMap.higherKey(102));
        System.out.println("Lower Key than 102: "
                + treeMap.lowerKey(102));
        System.out.println("Ceiling Key of 102: "
                + treeMap.ceilingKey(102));
        System.out.println("Floor Key of 102: "
                + treeMap.floorKey(102));
        System.out.println("Entries: " + treeMap.entrySet());

        treeMap.remove(104);
        System.out.println("After remove: " + treeMap);


        // 13. Hashtable
        System.out.println("\n===== HASHTABLE =====");

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(101, "Raj");
        hashtable.put(102, "Ravi");
        hashtable.put(103, "Sita");

        System.out.println("Hashtable: " + hashtable);
        System.out.println("Get key 101: " + hashtable.get(101));
        System.out.println("Contains key 102: "
                + hashtable.containsKey(102));
        System.out.println("Contains value Sita: "
                + hashtable.containsValue("Sita"));
        System.out.println("Keys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());
        System.out.println("Size: " + hashtable.size());
        System.out.println("Is Empty: " + hashtable.isEmpty());

        hashtable.remove(103);
        System.out.println("After remove: " + hashtable);
    }
}
