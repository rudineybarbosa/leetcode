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

    /**
     * if nums [0,1,3,0,12] -> return [1,3,12,0,0]
     * if nums [2,1,3,0,12] -> return [2,1,3,12,0]
     *
     */
    public int[] moveZeroes(int[] nums){
        //base case
        int n = nums.length;
        if(n < 2) return new int []{};

        //define pointers
        int left = 0;
        int right = 1;

        //move zeros to bac
        while(right < n){
            if(nums[left] != 0 ){
                left++;
                right++;
            } else if(nums[right] == 0){
                right++;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }

        return nums;
    }
}
