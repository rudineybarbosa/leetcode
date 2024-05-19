package _01_twoPointers;

public class Soluction {

    /**
        numbers[] is sorted
    **/
    public int[] twoSum(int[] numbers, int target){
    //source:
        //https://www.youtube.com/watch?v=CWUnvUJ29zw&list=PL1MJrDFRFiKa6ujcwZcMB8DdNzUg29BXy

        //define pointers
        int left = 0;
        int n = numbers.length;
        int right = n-1;

        //two pointer find sum
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

}
