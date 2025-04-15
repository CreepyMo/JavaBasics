package org.example.arrays;

public class DoublePower {



    public static void main(String[] args) {
        getDoublePower(new int[]{45, 34, 56, 67});
    }

    public static int[] getDoublePower(int[] powers) {
        int doubled = 0;
        for (int i = 0; i < powers.length; i++){
            doubled = powers[i] * 2;
            System.out.println(doubled);
        }
        return powers;
    }
}
