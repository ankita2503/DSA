package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IterateArrays {
    public static void main(String [] args){
        int [] nums = {2,4,4,3,3,5,5};


        //case where we have at least 2 numbers in the array
        int retval = nums[0];
        //the repeated numbers will cancel out leaving the single one
        for(int i = 1; i < nums.length; i++){
            System.out.print(retval +"^"+ nums[i]+"=");
            retval = retval ^ nums[i];
            System.out.print(retval);
            System.out.println();
        }
        //System.out.println(retval);
    }
    }

