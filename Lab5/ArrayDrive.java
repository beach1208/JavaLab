package Lab5;

import java.util.Arrays;

import static Lab5.DiverseArray.rowSums;

public class ArrayDrive {
    public static void main(String[] args) {
        int[] demo = new int[]{1,3,2,7,3};
        DiverseArray arr1 = new DiverseArray();
        System.out.println(arr1.arraySum(demo));


        int rows[][] = {
                {1,3,2,7,3},
                {10,10,4,6,2},
                {5,3,5,9,6},
                {7,6,4,2,1}
        };

        System.out.println(Arrays.toString(arr1.rowSums(rows)));

        int mat1[][] = {{1,3,2,7,3},
                {10,10,4,6,2},
                {5,3,5,9,6},
                {7,6,4,2,1}
        };

        int mat2[][] = {
                {1,1,5,3,4},
                {12,7,6,1,9},
                {8,11,10,2,5},
                {3,2,3,0,6},
        };

        System.out.println(arr1.isDiverse(mat1));
        System.out.println(arr1.isDiverse(mat2));

    }

}
