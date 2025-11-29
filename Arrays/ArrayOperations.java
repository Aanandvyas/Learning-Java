package Arrays;
import java.lang.System;


public class ArrayOperations {
    public static void main(String[] args) {
        int nums[] = {23,54,63,19,5};
        double sum =0;
        int max = nums[0];
        int min = nums[0];

        //finding max,min,sum
        for (int i : nums) {
            sum += i;
            if(i>max) max = i;
            if(i<min) min = i;
        }

        System.out.println("sum: "+sum+", max: "+max+", min: "+min);

        int avg = (int)sum/nums.length;
        System.out.println("avg is: "+avg);

        //copy to new array
        int[] newNums = new int[7];
        int i=0;

        for (int val : nums) {
            newNums[i] = val;
            i++;
        }
        var name = "vedanshi";
        name = "anand";
        System.out.println(newNums[0]);

        System.out.println(name);
    }
}
