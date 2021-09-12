package zadania;

import java.util.Arrays;

public class Zadanie21 {
    public static void main(String[] args) {

        int[] arrayNums = {0,0,1,0,3,0,5,0,6};
        int i = 0;

        System.out.println("Original Array : " + Arrays.toString(arrayNums));

        for(int j = 0, l = arrayNums.length; j < l;) {
            if (arrayNums[j] == 0) {
                j++;
            } else {
                int temp = arrayNums[i];
                arrayNums[i] = arrayNums[j];
                arrayNums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < arrayNums.length) {
            arrayNums[i++] = 0;
        }

        System.out.print("After moving 0's to the end of the array: " + Arrays.toString(arrayNums));
    }
}

