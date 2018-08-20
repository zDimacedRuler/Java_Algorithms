package Logical;

import java.util.Arrays;

public class PrintWithoutLoop {
    private static int count=1;
    private static final int MAX = 10;

    PrintWithoutLoop(PrintWithoutLoop[] obj) {
        System.out.print(count + " ");
        count++;
        if (count<=MAX){
        obj[count]=new PrintWithoutLoop(obj);
        }
    }

    public static void main(String[] args) {
        PrintWithoutLoop[] obj = new PrintWithoutLoop[MAX+1];
        obj[0]=new PrintWithoutLoop(obj);
    }
}
