package generic.ex4;

public class GenericMethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.object(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(10.0);

    }
}
