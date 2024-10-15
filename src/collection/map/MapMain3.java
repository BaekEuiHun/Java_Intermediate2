package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentB")) {
            studentMap.put("studentB", 100);
        }
        System.out.println(studentMap);


        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentV", 100);
        System.out.println(studentMap);
    }
}
