package com.aritra;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[][] = new int[3][];
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println("Enter how column size for row "+row);
//            int column = sc.nextInt();
//            arr[row] = new int[column];
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(" ");
//        }
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i = 0 ; i< n;i++ )
            list.add(sc.nextInt());
        list.add(74);
        System.out.println(list);

    }
}



