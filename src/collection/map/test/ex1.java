package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {

        String[][] productArr = {{"java", "10000"}, {"spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            String key = product[0];
            String value = product[1];

            productMap.put(key, Integer.valueOf(value));
        }
        for (String key : productMap.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + productMap.get(key));

        }
    }
}
