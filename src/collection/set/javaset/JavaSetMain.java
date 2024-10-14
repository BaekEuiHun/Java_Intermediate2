package collection.set.javaset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

    public static void main(String[] args) {
        //무작위
        Set<String> hashSet = new HashSet<>();

        //입력한 순서
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //데이터 순서
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);

    }
    private static void run(Set<String> set) {
        System.out.println(set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println(set);
    }
}
