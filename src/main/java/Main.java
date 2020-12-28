import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Demo 1 PriorityQueue ------------------------------------------
        // Creating empty priority queue
//        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
//
//        // Adding items to the pQueue using add()
//        pQueue.add(10);
//        pQueue.add(20);
//        pQueue.add(15);
//
//        while (!pQueue.isEmpty()){
//            // Printing the top element of PriorityQueue, but not remove it
//            System.out.println("Peek before poll: " + pQueue.peek());
//            // Printing the top element and removing it
//            // from the PriorityQueue container
//            System.out.println("Poll: " + pQueue.poll());
//            // Printing the top element again after poll
//            System.out.println("Peek after poll: " + pQueue.peek());
//        }
        // End Demo 1---------------------------------------------

        // Start Demo 2 Array list-------------------------------------------
//        long startTime = System.currentTimeMillis();
//        ArrayList<String> cars = new ArrayList<>();
//
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//
//        System.out.println(cars);
//        System.out.println(cars.get(3));
//        try
//        {
//            Collection collection = Collections.unmodifiableCollection(cars);
//            collection.add("My car");
//        }
//        catch (UnsupportedOperationException ex){
//            ex.printStackTrace();
//        }
//
//
//        ListIterator listIterator = cars.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("ArrayList took " + (endTime - startTime) + " milliseconds");
//        startTime = System.currentTimeMillis();
//        LinkedList<String> cars2 = new LinkedList<>();
//        cars2.add("Volvo");
//        cars2.add("BMW");
//        cars2.add("Ford");
//        cars2.add("Mazda");
//
//        System.out.println(cars2);
//        System.out.println(cars2.get(3));
//        endTime = System.currentTimeMillis();
//        System.out.println("LinkedList took " + (endTime - startTime) + " milliseconds");
        // End Demo 2---------------------------------------------
        //Demo 3 Sort---------------------------------------------
        		List<Student> list = Arrays.asList(new Student("Hallun", 33), new Student("Alex", 23), new Student("Yelk", 33));
        
        		System.out.println("Unsorted List in Java: " + list);
        		list.sort(new Comparator<Student>() {
        			@Override
        			public int compare(Student h1, Student h2) {
        				return h1.getName().compareTo(h2.getName());
        			}
        		});
        		System.out.println("Sorted List in Java: " + list);
        		List<Student> list2 = Arrays.asList( new Student("Hallun", 33), new Student("Alex", 23), new Student("Yelk", 33));
        
        		Comparator<Student> comparator = (Student h1, Student h2) -> {
    				return h1.getName().compareTo(h2.getName());
    			};
        		Collections.sort(list2, comparator);
        		System.out.println("Sorted List by Collections.sort: " + list2 );
        //demo3 ends

        // Demo4-------------------------------------------------------
        // Show NavigableMap automatically sort and descendingKeySet, floorEntry
        //		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

        // Add elements using put() method
        //		nm.put("C", 888);
        //		nm.put("Y", 999);
        //		nm.put("A", 444);
        //		nm.put("T", 555);
        //		nm.put("B", 666);
        //		nm.put("A", 555);
        //
        //		// Print the contents on the console
        //		System.out.println("Mappings of NavigableMap : "
        //				+ nm);
        //
        //		System.out.printf("Descending Set  : %s%n",
        //				nm.descendingKeySet());
        //		System.out.printf("Floor Entry  : %s%n",
        //				nm.floorEntry("L"));
        //		System.out.printf("First Entry  : %s%n",
        //				nm.firstEntry());
        //		System.out.printf("Last Key : %s%n", nm.lastKey());
        //		System.out.printf("First Key : %s%n",
        //				nm.firstKey());
        //		System.out.printf("Original Map : %s%n", nm);
        //		System.out.printf("Reverse Map : %s%n",
        //				nm.descendingMap());
        // end Demo4----------------------------------

        // Demo 5 starts-------------------------------
        // linkedlist with listIterator to show add item
        //		List<String> staff = new LinkedList<>();
        //		staff.add("zhuwei");
        //		staff.add("xuezhangbin");
        //		staff.add("taozhiwei");
        //		ListIterator<String> iter = staff.listIterator();
        //		while(iter.hasNext()) {
        //			String curr = iter.next();
        //			if(curr.contains("zhang")) {
        //				iter.add("Zhang bin");
        //			}
        //			System.out.println(curr);
        //		}
        //		System.out.println(staff);
        // end Demo5-----------------------------------

        // Start Demo 6 -------------------------------
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Volvo");
//        list.add("BMW");
//        list.add("Ford");
//        list.add("Mazda");
//        Collections.reverse(list);
//        System.out.println(list);
        // End Demo 6 ---------------------------------

        // Start Demo 7 Reverse Order----------------------------
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Volvo");
//        list.add("BMW");
//        list.add("Ford");
//        list.add("Mazda");
//        Comparator cmp = Collections.reverseOrder();
//        Collections.sort(list,cmp);
//        System.out.println(list);
        // End Demo 7 ---------------------------------
    }
}
