package com.datastructures.programs;


public class CustomSort {

    private static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void sort (int[] arr, int low, int high) {

        if (low < high) {
            int partitionIndex = partition ( arr, low, high );
            sort ( arr, low, partitionIndex - 1 );
            sort ( arr, partitionIndex + 1, high );
        }
    }

    private static int[] merge (int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int c[] = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }


    private static void printArray (int[] arr) {
        System.out.println ( "Sorted Array ......." );
        for (int i : arr)
            System.out.println ( arr[i] + " " );
    }


    public static void main (String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5, 100, 90, 27, 17, 190, 256, 1890};
        int n = arr.length;
        sort ( arr, 0, n - 1 );
        printArray ( arr );
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] resultarr = merge ( a, b );
        printArray ( resultarr );
    }
}
