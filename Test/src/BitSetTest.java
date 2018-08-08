import java.util.BitSet;

public class BitSetTest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 7, 8, 4};
        int count = arr.length + 1;
        BitSet bitSet = new BitSet(count);
        for (int a : arr)
            bitSet.set(a - 1);
        System.out.println("Missing value:" + (bitSet.nextClearBit(0) + 1));

    }
}
