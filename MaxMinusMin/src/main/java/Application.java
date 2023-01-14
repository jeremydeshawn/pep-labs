import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(2);
        MaxMinusMin mmm = new MaxMinusMin();
         int test = mmm.difference(list);
         System.out.println(test);

    }
}
