package Logical;

import java.util.Arrays;

public class PrintWithoutLoop {
    private static int count=1;
    private static final int MAX = 20;

    PrintWithoutLoop() {
        System.out.print(count + " ");
        count++;
        if (count<=MAX){
        new PrintWithoutLoop();
        }
    }

    public static void main(String[] args) {
        new PrintWithoutLoop();
    }
}
