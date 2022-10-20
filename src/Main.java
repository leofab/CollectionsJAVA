import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    // Using iterators
    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      String obj = iterator.next();
      System.out.println(obj);
    }

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
  }
}
