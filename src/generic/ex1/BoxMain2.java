package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) object;
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);
    }
}
