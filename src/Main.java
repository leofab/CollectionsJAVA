import java.util.ArrayList;
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

  }
}
