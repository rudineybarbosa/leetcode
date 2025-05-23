import _01_twoPointers.Soluction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {

    private Soluction soluction;
    @Before
    public void setup(){
        soluction = new Soluction();
    }
    @Test
    public void testTwoSum(){
        //test 00
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = soluction.twoSum(numbers, target);

        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);

        //test 01
        numbers = new int[]{2,3,4};
        target = 6;
        result = soluction.twoSum(numbers, target);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(3, result[1]);

        //test 02
        numbers = new int[]{-1,0};
        target = -1;
        result = soluction.twoSum(numbers, target);
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(2, result[1]);

    }

    @Test
    public void testMoveZeroes(){
        //test 01
        int[] nums = new int[]{0,1,0,3,12};
        int[] expected = new int[]{1,3,12,0,0};

        int[] result = soluction.moveZeroes(nums);
        Assertions.assertArrayEquals(expected, result);

        //test 02
        nums = new int[]{2,1,0,3,12};
        expected = new int[]{2,1,3,12,0};

        result = soluction.moveZeroes(nums);
        Assertions.assertArrayEquals(expected, result);

        //test 03
        nums = new int[]{2};
        expected = new int[]{};

        result = soluction.moveZeroes(nums);
        Assertions.assertArrayEquals(expected, result);

        //test 04
        nums = new int[]{2,3,4,5};
        expected = nums;

        result = soluction.moveZeroes(nums);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testRemovingDuplicates(){
        //test 01
        int[] nums = new int[] {1,1,2};
        int expected = 2;
        int result = soluction.removingDuplicates(nums);
        Assert.assertEquals(expected,result);

        //test 02
        nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        expected = 5;
        result = soluction.removingDuplicates(nums);
        Assert.assertEquals(expected,result);

        //test 03
        nums = new int[] {0,0};
        expected = 1;
        result = soluction.removingDuplicates(nums);
        Assert.assertEquals(expected,result);

        //test 04
        nums = new int[] {0,1};
        expected = 2;
        result = soluction.removingDuplicates(nums);
        Assert.assertEquals(expected,result);

        //test 05
        nums = new int[] {0,1,2,3,4};
        expected = 5;
        result = soluction.removingDuplicates(nums);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSquareSorted(){
        //test 01
        int[] nums = new int[]{-9,-8,-7,-3,2,3,11};
        int[] expected = new int[] {4,9,9,49,64,81,121};
        int[] result = soluction.squareSorted(nums);

        Assertions.assertArrayEquals(expected,result);

        //test 02
        nums = new int[]{-4,-1,0,3,10,11};
        expected = new int[] {0,1,9,16,100,121};
        result = soluction.squareSorted(nums);

        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    public void testMaxArea(){
        int[] heigths = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{8,-1,6,2,5,4,8,3,7};
        expected = 56;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{4,3,2,1,4};
        expected = 16;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{1,2,1};
        expected = 2;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{0,15,6,9,5,10,8,3,1};
        expected = 40;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{1,-1,-2,3,1};
        expected = 8;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testMaxAreaSecondsoluction(){
        int[] heigths = new int[]{1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int result = soluction.maxAreaSecondSolution(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{8,-1,6,2,5,4,8,3,7};
        expected = 56;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{4,3,2,1,4};
        expected = 16;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{1,2,1};
        expected = 2;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);

        heigths = new int[]{0,15,6,9,5,10,8,3,1};
        expected = 40;
        result = soluction.maxArea(heigths);
        Assert.assertEquals(expected,result);
    }
}
