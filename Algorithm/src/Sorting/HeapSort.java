package Sorting;

import java.util.Scanner;


public class HeapSort {
    private int[] heap;
    private int size;
    private int maxSize;

    public HeapSort(int[] heap, int maxSize) {
        this.heap = new int[maxSize + 1];
        //binary heap starts with 1st index
        this.heap[0] = Integer.MAX_VALUE;
        for (int i = 0; i < maxSize; i++)
            this.heap[i + 1] = heap[i];
        this.size = maxSize + 1;
        this.maxSize = maxSize + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        HeapSort sort = new HeapSort(array, length);
        sort.sort();
        sort.showHeap();
    }

    //return index of left child
    int leftChild(int position) {
        return 2 * position;
    }

    //return index of right child
    int rightChild(int position) {
        return (2 * position) + 1;
    }


    private void maxHeapify(int position) {
        int largest = position;
        if (leftChild(position) < size && heap[leftChild(position)] > heap[position])
            largest = leftChild(position);
        if (rightChild(position) < size && heap[rightChild(position)] > heap[largest])
            largest = rightChild(position);
        if (largest != position) {
            int temp = heap[largest];
            heap[largest] = heap[position];
            heap[position] = temp;
            maxHeapify(largest);
        }
    }

    public void buildMaxHeap() {
        for (int i = size / 2; i >= 1; i--)
            maxHeapify(i);
    }

    public void sort() {
        buildMaxHeap();
        showHeap();
        for (int i = maxSize - 1; i >= 2; i--) {
            int temp = heap[1];
            heap[1] = heap[i];
            heap[i] = temp;
            size -= 1;
            maxHeapify(1);
        }
    }

    public void showHeap() {
        for (int i = 1; i < maxSize; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}
