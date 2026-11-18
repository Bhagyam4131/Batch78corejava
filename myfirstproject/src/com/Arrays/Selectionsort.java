package com.Arrays;

import java.util.Arrays;

public class Selectionsort {

    public static void main(String[] args) {

        int arr[] = {9, 4, 2, 7, 1, 3, 8, 6};//{1,2,3,4,6,7,8,9}

        System.out.println("Before sort : " + Arrays.toString(arr));

        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int minindex = i;//0,1,2,4

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
           temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

            System.out.println("After sort : " + Arrays.toString(arr));
        }
    }
}