import java.util.*;

public class BitSetTest {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6,7, 8};
        int count = arr.length + 1;
        BitSet bitSet = new BitSet(count);
        for (int a : arr)
            bitSet.set(a - 1);
        System.out.println("Missing value:" + (bitSet.nextClearBit(arr[0]-1) + 1));

    }
}
