package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        //같은 키에 저장시 기존 값 변경
        studentMap.put("studentA", 100);
        System.out.println("studentMap = " + studentMap);

        //포함 여부
        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);
        
        //특정 학생 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
        
    }
}
