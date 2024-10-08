package generic.ex6;

import generic.ex6.Unit.Marine;

public class ShuttleTest {
    public static void main(String[] args) {

        Shuttle<Marine> shuttle1 = new Shuttle<Marine>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();
    }
}
