package com.kh.Assignment.Nov_24_2022.Insertion.sort;
import java.util.Arrays;

public class Insertion_Sort {
    static int [] nums;
    public void method1(){
           //static int[] nums;
        nums = new int[10];
        for (int i = 0; i <10; i++){
            nums[i]= (int)(Math.random()*10);
        }
        System.out.println("before");
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i<nums.length; i++){
            int temp=nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev]>temp){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=temp;
        }
        System.out.println("after");
        System.out.println(Arrays.toString(nums));
    }
}

