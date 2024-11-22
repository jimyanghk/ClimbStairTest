import org.postTest.ClimbStair;
import org.postTest.InvalidInputException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ClimbStairTest {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,3","4,5","5,8","6,13","7,21","8,34","9,55","10,89","11,144","12,233","13,377","46,2971215073","100,573147844013817084101"})
    public void calculateWaysTest(int input,BigInteger expect) throws InvalidInputException {
       ClimbStair climbStair=new ClimbStair();
       BigInteger ways= climbStair.calculateWays(input);
       assertEquals(expect,ways);
    }

    @ParameterizedTest
    @ValueSource(ints={0,-1,-2,-3,-4})
    public void InvalidInputExceptionTest(int input){
        ClimbStair climbStair=new ClimbStair();
        Exception exception = assertThrows(InvalidInputException.class, () -> {
            climbStair.calculateWays(input);
        });
        assertEquals("Input number should be larger than 0",exception.getMessage());
    }
}
