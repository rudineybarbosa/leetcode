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
     * Two pointers - moving zeros to back
     *
     * if nums [0,1,3,0,12] -> return [1,3,12,0,0]
     *          ^ ^
     * if nums [2,1,3,0,12] -> return [2,1,3,12,0]
     *          ^ ^
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


    /**
     * nums[] is sorted
     *
     * nums[1,1,2] -> result 2, nums[1,2]
     * nums[0,0,1,1,1,2,2,3,3,4] -> result 5, nums[0,1,2,3,4]
     *      ^   ^
     * nums[]
     *
     * @param nums
     * @return length of resulted array
     */
    public int removingDuplicates(int[] nums){
        //base case
        int n = nums.length;
        if(n < 2) return n;

        //define pointers
        int left = 0;
        int right = 1;
        while(right < n){
            if(nums[right] != nums[left]){
                nums[left+1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }

    /**
     * nums[] is sorted
     *
     * if nums[-4,-1,0,3,10,11] -> return [0,1,9,16,100,121]
     * if nums[-9,-8,-7,-3,2,3,11] -> return [4,9,9,49,64,81,121]
     *
     */
    public int[] squareSorted(int[] nums){
        //base case
        int n = nums.length;
        if(n < 2) return nums;


        int indexSmalestPositive = 0;
        //find the index from the number with the smallest square, it
        //  will be the first not negative number
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                indexSmalestPositive = i;
                break;
            }
        }

        //define pointers
        int left = indexSmalestPositive;
        int right = indexSmalestPositive+1;


        int[] result = new int[n];
        int index = 0;
        while(0 <= left && right <= n-1){
            if(nums[left]*nums[left] < nums[right]*nums[right]){
                result[index++] =  nums[left]*nums[left];
                left--;
            } else{
                result[index++] =  nums[right]*nums[right];
                right++;
            }
        }

        while(0 <= left){
            result[index++] = nums[left]*nums[left];
            left--;
        }
        while(right <= n-1){
            result[index++] = nums[right]*nums[right];
            right++;
        }

        return result;
    }

    /**
     * Return the max area
     * if heights[1,8,6,2,5,4,8,3,7] then return 49:
     *  height = min height between two higher height = 7
     *  base   = distance between higher height index = index for first 8 (1) and index for 7(8) = 7
     *  result = 7 * 7 = 49
     * @param heights
     * @return
     */
    public int maxArea(int[] heights){
        //define pointers
        int left = 0;
        int right = heights.length - 1;

        //define height, base and maxArea
        int height = 0;
        int base = 0;
        int maxArea = Integer.MIN_VALUE;

        while(left < right){
            if(heights[left] < 0 || heights[right] < 0){
                height = Math.abs(heights[left]) + Math.abs(heights[right]);
            } else{
                height = Math.min(heights[left], heights[right]);
            }
            base = Math.abs((left-right));
            int areaTemp = height*base;
            maxArea = Math.max(areaTemp, maxArea);
            if(heights[left] < heights[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }

    public int maxAreaSecondSolution(int[] heights){
        //define pointers
        int left = 0;
        int n = heights.length-1;

        //define two higher
        int firstHigher = Integer.MIN_VALUE;
        int indexFirstHigher = 0;
        int secondHigher = Integer.MIN_VALUE;
        int indexSecondHigher = 0;

        while(left <= n){
            if(heights[left] > firstHigher){
               firstHigher = heights[left];
               indexFirstHigher = left;
            }
            if(heights[left] != firstHigher && heights[left] > secondHigher && secondHigher < firstHigher){
                secondHigher = heights[left];
                indexSecondHigher = left;
            }
            left++;
        }
        int base = Math.abs(indexFirstHigher - indexSecondHigher);
        int height = Math.min(firstHigher, secondHigher);
        int maxArea =  base * height;

        return maxArea;
    }
}
