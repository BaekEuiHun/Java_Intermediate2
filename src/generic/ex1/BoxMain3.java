package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입이 결정됨.
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
        
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double double2 = doubleBox.get();
        System.out.println("double2 = " + double2);
    }
}
