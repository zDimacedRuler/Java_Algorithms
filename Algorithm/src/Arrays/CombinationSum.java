package Arrays;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = sc.nextInt();
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        findComb(sum, arr, n, 0, set, temp);
        printSet(set);
    }

    private static void printSet(ArrayList<ArrayList<Integer>> set) {
        if (set.size() == 0) {
            System.out.print("Empty\n");
            return;
        }

        for (ArrayList arr : set) {
            System.out.print("(");
            for (int i = 0; i < arr.size() - 1; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.print(arr.get(arr.size() - 1) + ")");
        }
        System.out.println();
    }

    private static void findComb(int sum, int[] arr, int n, int index, ArrayList<ArrayList<Integer>> set, ArrayList<Integer> temp) {
        if (sum == 0) {
            ArrayList<Integer> temp2 = new ArrayList<>(temp);
            set.add(temp2);
            return;
        }
        for (int i = index; i < n; i++) {
            if (sum - arr[i] >= 0) {
                sum = sum - arr[i];
                temp.add(arr[i]);
                findComb(sum, arr, n, i + 1, set, temp);
                temp.remove(temp.size() - 1);
                sum = sum + arr[i];
            } else if (sum - arr[i] < 0)
                return;
        }
    }
}
