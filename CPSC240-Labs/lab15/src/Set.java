import java.util.ArrayList;
import java.util.List;

// a class for storing a set of strings
public class Set extends Thread {
    // items are stored in an ArrayList
    private ArrayList<String> items;

    public Set() {
        items = new ArrayList<String>();
    }

    // add an item in
    public void add(String element) {
        items.add(element);
    }


    // check if an item exists
    // TODO parallelize this process
    boolean exists(String element) {
        ThreadName searchThread1 = new ThreadName();
        searchThread1.setName("Thread 1");
        ThreadName searchThread2 = new ThreadName();
        searchThread2.setName("Thread 2");


        List<String> top = items.subList(0, 50);
        List<String> bottom = items.subList(51, 100);


        for (int i = 0; i < top.size(); i++) {

            // if this is the item
            if (top.get(i).equals(element)) {
                searchThread1.start();
                try {
                    searchThread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // we found it
                return true;
            }
        }


        for (int i = 0; i < bottom.size(); i++) {

            // if this is the item
            if (bottom.get(i).equals(element)) {
                searchThread2.start();
                try {
                    searchThread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // we found it
                return true;
            }
        }

        // didn't find it
        return false;
    }
}
