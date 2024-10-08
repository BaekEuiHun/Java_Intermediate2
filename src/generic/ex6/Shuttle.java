package generic.ex6;

import generic.ex6.Unit.BioUnit;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t) {
        unit = t;
    }

    public void showInfo() {
        System.out.println("이름 : " + unit.getName());
    }
}
