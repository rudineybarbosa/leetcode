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
}
