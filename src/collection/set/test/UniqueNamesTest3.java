package collection.set.test;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        List<Integer> list = List.of(inputArr);

        Set<Integer> set = new TreeSet<>(list);


        for (Integer s : set) {
            System.out.println(s);
        }
    }

}
