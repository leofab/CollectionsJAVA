import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    System.out.println("--------------------------------- ARRAYLIST ---------------------------------------");
    // Using iterators
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      String obj = iterator.next();
      System.out.println(obj);
    }
    System.out.println("------------------------------------------------------------------------");

    // for each
    // You can use for each in all collections
    for(String key : list) {
      System.out.println(key);
    }

    // Collections Interface methods in four groups
    // Add elements
    // {
    // add(o:E):boolean
    // addAll(c:Collection<? extends E>):boolean
    // }

    // Remove elements
    // {
    // remove(o:Object):boolean
    // clear():void
    // removeAll(c:Collection<?>):boolean
    // retainAll(c:Collection<?>):boolean
    // }

    // Query the contents of Collection
    // {
    // contains(o:Object):boolean
    // containsAll(c:Collection<?>):boolean
    // isEmpty():boolean
    // size():int
    // }

    // Making a Collection's Contents available for further processing
    // {
    // iterator():Iterator<E>
    // toArray():Object[]
    // <T>toArray(T[]a):T[]
    // }

    Collection<String> bestApps = new ArrayList<>();
    bestApps.add("Master Coding");
    bestApps.add("Master Coding PRO");

    System.out.println(bestApps.toString());
    System.out.println("------------------------------ HASHSET ------------------------------------------");

    // Sets are used to store unordered sets of elements and does not allow to store duplicates and just one null

    Set<String> s1 = new HashSet<>();
    Set<String> s2 = new LinkedHashSet<>();
    Set<String> s3 = new TreeSet<>();

    // HashSet uses hash table for storage that places elements into specific positions based upon integers called hash
    // codes.

    s1.add("element 1");
    s1.add("element 2");
    s1.add("element 2");
    s1.add("element 3");

    // Iterator over the collection elements
    Iterator<String> iterator2 = s1.iterator();
    while(iterator2.hasNext()) {
      String obj = iterator2.next();
      System.out.println(obj);
    }
    System.out.println("----------------------------- LINKEDHASHSET -------------------------------------------");

    // LinkedHashSet is an ordered version of the HashSet that maintains a doubly-linked List across all elements.
    // When the iteration order is needed to be maintained this calss is used.
    // When iterating through a HashSet the order is unpredictable,
    // while a LinkedHashSet is lets us itarate through the elements in the order in which they were inserted.

    s2.add("A");
    s2.add("B");
    s2.add("C");
    s2.add("C");
    s2.add("D");
    s2.add("E");

    s2.remove("D");

    // Iterator over the collection elements
    Iterator<String> iterator3 = s2.iterator();
    while(iterator3.hasNext()) {
      String obj = iterator3.next();
      System.out.println(obj);
    }
    System.out.println("------------------------------ TREESET ------------------------------------------");

    // TreeSet implements the Set interface that uses a tree for storage
    // It uses binary search tree to store its elements in sorted order.
    // like HashSet, TreeSet also contains unique elements.
    // However, the access and retrieval time of TreeSet is quite fast.
    // The elements in TreeSet stored in ascending order.

    s3.add("A");
    s3.add("D");
    s3.add("C");
    s3.add("B");
    s3.add("B");

    // Iterator over the collection elements
    Iterator<String> iterator4 = s3.iterator();
    while(iterator4.hasNext()) {
      String obj = iterator4.next();
      System.out.println(obj);
    }
    System.out.println("------------------------------------------------------------------------");
  }
}
