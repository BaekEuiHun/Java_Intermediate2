package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        Integer i = 10;
        String strA = "A";

        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());

        Member member1 = new Member("idA");
        Member member2 = new Member("idA");
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
    }
}
