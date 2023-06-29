package src.main.java.effectivejava.item06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();

        testMap.put("1","1");
        testMap.put("2","2");

        Set<String> aaa = testMap.keySet();
        Set<String> bbb = testMap.keySet();

        testMap.put("3", "3");

        aaa.remove("1");
        
//        testMap.forEach((a,b)->{
//            System.out.println("a = " + a);
//        });
        Set<String> a1 = testMap.keySet();
        Set<String> a2 = testMap.keySet();
        System.out.println(testMap.keySet() == testMap.keySet());
//        System.out.println(" = " + );

//        System.out.println(aaa == strings2);
//        System.out.println(aaa.getClass());
//        System.out.println(strings2.getClass());



    }
}
