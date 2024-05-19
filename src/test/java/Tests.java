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


}
