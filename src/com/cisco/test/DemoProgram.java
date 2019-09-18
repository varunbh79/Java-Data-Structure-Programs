package com.cisco.test;


class DemoProgram {

    private int[] res = new int[3];

    public static void main (String... args) {
        int[] arr = {7, 10, 4};
        int n = 3;
        int k = 10;
        DemoProgram demoProgram = new DemoProgram ();
        int j[] = demoProgram.compute ( arr, n, k );
        for (int g = 0; g < j.length; g++)
            System.out.print ( j[g] + " " );
    }

    private int[] compute (int[] arr, int n, int k) {
        int index = 0;
        int val = 0;
        while (k > 0) {

            if (index >= n) {
                index = 0;
            }
            if (val > k) {
                res[index] = k;
            } else {
                res[index] += val + 1;
            }
            k = k - res[index];
            index++;
            val++;
        }
        return res;
    }
}
