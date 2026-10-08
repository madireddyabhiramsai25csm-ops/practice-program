import java.util.*;

public class CollectionFrameworkDemo {

    public static void main(String[] args) {

        // =========================================
        // 1. COLLECTION / LIST
        // =========================================

        List<String> list = new ArrayList<>();

        System.out.println("===== LIST / COLLECTION =====");

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana");

        System.out.println("List: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains Mango: "
                + list.contains("Mango"));

        list.addAll(Arrays.asList("Orange", "Grapes"));

        System.out.println("After addAll: " + list);

        list.remove("Banana");

        System.out.println("After remove: " + list);

        System.out.println("Is Empty: " + list.isEmpty());


        // =========================================
        // 2. LIST METHODS
        // =========================================

        System.out.println("\n===== LIST METHODS =====");

        list.add(1, "Pineapple");

        System.out.println("After add(index): " + list);

        System.out.println("Element at index 2: "
                + list.get(2));

        list.set(2, "Watermelon");

        System.out.println("After set: " + list);

        System.out.println("First index of Banana: "
                + list.indexOf("Banana"));

        System.out.println("Last index of Banana: "
                + list.lastIndexOf("Banana"));

        System.out.println("SubList: "
                + list.subList(1, 4));

        list.sort(String::compareTo);

        System.out.println("Sorted List: " + list);


        // =========================================
        // 3. SET
        // =========================================

        System.out.println("\n===== SET =====");

        Set<Integer> set = new HashSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("Set: " + set);

        System.out.println("Contains 20: "
                + set.contains(20));

        System.out.println("Set Size: " + set.size());

        set.remove(30);

        System.out.println("After remove: " + set);


        // =========================================
        // 4. SORTED SET
        // =========================================

        System.out.println("\n===== SORTED SET =====");

        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(50);
        sortedSet.add(20);
        sortedSet.add(40);
        sortedSet.add(10);
        sortedSet.add(30);

        System.out.println("Sorted Set: " + sortedSet);

        System.out.println("First: " + sortedSet.first());

        System.out.println("Last: " + sortedSet.last());

        System.out.println("HeadSet(30): "
                + sortedSet.headSet(30));

        System.out.println("TailSet(30): "
                + sortedSet.tailSet(30));

        System.out.println("SubSet(20, 50): "
                + sortedSet.subSet(20, 50));


        // =========================================
        // 5. NAVIGABLE SET
        // =========================================

        System.out.println("\n===== NAVIGABLE SET =====");

        NavigableSet<Integer> navSet = new TreeSet<>();

        navSet.add(10);
        navSet.add(20);
        navSet.add(30);
        navSet.add(40);
        navSet.add(50);

        System.out.println("Navigable Set: " + navSet);

        System.out.println("Lower(30): "
                + navSet.lower(30));

        System.out.println("Floor(30): "
                + navSet.floor(30));

        System.out.println("Ceiling(35): "
                + navSet.ceiling(35));

        System.out.println("Higher(30): "
                + navSet.higher(30));

        System.out.println("Descending Set: "
                + navSet.descendingSet());


        // =========================================
        // 6. QUEUE
        // =========================================

        System.out.println("\n===== QUEUE =====");

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Element: " + queue.element());

        System.out.println("Poll: " + queue.poll());

        System.out.println("Queue after poll: "
                + queue);


        // =========================================
        // 7. DEQUE
        // =========================================

        System.out.println("\n===== DEQUE =====");

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println("Deque: " + deque);

        System.out.println("First: " + deque.peekFirst());

        System.out.println("Last: " + deque.peekLast());

        deque.removeFirst();

        deque.removeLast();

        System.out.println("After removing both ends: "
                + deque);


        // =========================================
        // 8. MAP
        // =========================================

        System.out.println("\n===== MAP =====");

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Priya");
        map.put(103, "Ravi");

        System.out.println("Map: " + map);

        System.out.println("Value for key 101: "
                + map.get(101));

        System.out.println("Contains key 102: "
                + map.containsKey(102));

        System.out.println("Contains value Ravi: "
                + map.containsValue("Ravi"));

        System.out.println("Keys: "
                + map.keySet());

        System.out.println("Values: "
                + map.values());

        System.out.println("Entries: "
                + map.entrySet());


        // =========================================
        // 9. SORTED MAP
        // =========================================

        System.out.println("\n===== SORTED MAP =====");

        SortedMap<Integer, String> sortedMap =
                new TreeMap<>();

        sortedMap.put(103, "Ravi");
        sortedMap.put(101, "Rahul");
        sortedMap.put(102, "Priya");
        sortedMap.put(104, "Anu");

        System.out.println("Sorted Map: "
                + sortedMap);

        System.out.println("First Key: "
                + sortedMap.firstKey());

        System.out.println("Last Key: "
                + sortedMap.lastKey());

        System.out.println("Head Map(103): "
                + sortedMap.headMap(103));

        System.out.println("Tail Map(102): "
                + sortedMap.tailMap(102));

        System.out.println("Sub Map(101,104): "
                + sortedMap.subMap(101, 104));


        // =========================================
        // 10. NAVIGABLE MAP
        // =========================================

        System.out.println("\n===== NAVIGABLE MAP =====");

        NavigableMap<Integer, String> navMap =
                new TreeMap<>();

        navMap.put(10, "A");
        navMap.put(20, "B");
        navMap.put(30, "C");
        navMap.put(40, "D");
        navMap.put(50, "E");

        System.out.println("Navigable Map: "
                + navMap);

        System.out.println("Lower Key(30): "
                + navMap.lowerKey(30));

        System.out.println("Floor Key(30): "
                + navMap.floorKey(30));

        System.out.println("Ceiling Key(35): "
                + navMap.ceilingKey(35));

        System.out.println("Higher Key(30): "
                + navMap.higherKey(30));

        System.out.println("First Entry: "
                + navMap.firstEntry());

        System.out.println("Last Entry: "
                + navMap.lastEntry());

        System.out.println("Descending Map: "
                + navMap.descendingMap());


        // =========================================
        // 11. ITERATOR
        // =========================================

        System.out.println("\n===== ITERATOR =====");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // =========================================
        // 12. LIST ITERATOR
        // =========================================

        System.out.println("\n===== LIST ITERATOR =====");

        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Ravi");

        ListIterator<String> listIterator =
                names.listIterator();

        System.out.println("Forward Traversal:");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Traversal:");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
