import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public  void numPairsDivisibleBy60Test1(){
        int[] time = {30,20,150,100,40};
        int expected= 3;
        int actual = new Solution().numPairsDivisibleBy60(time);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void numPairsDivisibleBy60Test2(){
        int[] time = {60,60,60};
        int expected= 3;
        int actual = new Solution().numPairsDivisibleBy60(time);

        Assert.assertEquals(expected, actual);
    }

}
