package collection.list.Test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("n개의 정수를 입력하세요");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
    }
}
