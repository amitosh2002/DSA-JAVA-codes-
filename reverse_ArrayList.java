import java.util.ArrayList;
import java.util.Collections;

public class reverse_ArrayList {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            int temp = list.get(Integer.valueOf(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> li = new ArrayList<>();

        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("OG   " + list);
        reverseList(list);
        System.out.println("reverse  " + list);

        // we can reverse list directly using inbuilt function in collections module
        System.out.println("OG   " + list);
        Collections.reverse(list);
        System.out.println("reverse  " + list);

        li.add("hello");
        li.add("jis");
        li.add("group");
        li.add("kalyani");

        System.out.println("OG   " + li);
        Collections.reverse(li);
        System.out.println("reverse  " + li);

        // Sorting ArrayList using sort method;
        System.out.println("OG before sorting   " + li);
        Collections.sort(li);
        System.out.println("sorted  " + li);

    }
}
