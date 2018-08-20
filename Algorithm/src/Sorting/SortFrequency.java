package Sorting;

import java.util.*;

public class SortFrequency {
    public static void main(String[] args) {
        int arr[] = {5,4,6,7,4,5,5,6,4,7,7,3,7,7,4,6};
        Map<Integer,Integer> map = new HashMap<>();
        for (int ele : arr){
            if (map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else
                map.put(ele,1);
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return (e2.getValue()).compareTo(e1.getValue());
            }
        });
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(map);
        System.out.println(temp);
    }
}
