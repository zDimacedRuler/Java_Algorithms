package Test;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeMapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {6, 2, 3, 1, 5, 4};
        TreeSet<Integer> map = new TreeSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            map.add(arr[i]);
            System.out.println(map.tailSet(arr[i],false).size());
        }
    }
}
