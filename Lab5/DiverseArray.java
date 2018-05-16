package Lab5;

/**
 * Author@Nagisa Kojima
 */
public class DiverseArray {

    /**
     *
     * @param arr
     * @return sum of one row of  array
     */
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        return sum;

    }

    /**
     *
     * @param arr2D
     * @return two rows of array
     */
    public static int[] rowSums(int[][] arr2D){
        int sum = 0;
        int [] total = new int[arr2D.length];
        for (int row = 0; row < arr2D.length; row++){
            for (int col = 0; col < arr2D[row].length; col++){
                sum += arr2D[row][col];
            }
           total[row] += sum; // row のindexの中にsumを足していく
            sum = 0;
        }
        return total;
    }


    /**
     *
     * @param arr2D
     * @return check if sum of row has same sum as other elements.
     */
    public  static  boolean isDiverse(int[] [] arr2D){
        int [] total = rowSums(arr2D);
        boolean unique = true;
        for(int i = 0; i < total.length; i ++){
            for (int j = i + 1; j < total.length; j++){
                if(total[i] == total[j]){
                    unique =  false;
                }
            }

        }
        return unique;

    }
}
