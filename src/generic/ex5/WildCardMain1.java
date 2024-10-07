package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이", 100));

        wildCardEx.<Dog>printGenericV1(dogBox);
        wildCardEx.printWildcardV1(dogBox);
        wildCardEx.printWildcardV2(dogBox);
        wildCardEx.<Dog>printGenericV2(dogBox);
        Animal animal = wildCardEx.printAndReturnWildcard(dogBox);
        Dog dog = wildCardEx.printAndReturnGeneric(dogBox);

    }
}
