package example.junit5.annotations.parameterized.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6,7})
    public void checkSum(int expected){
        assertEquals(expected,2);
    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void checkSumMethodSource(int expected,int actual){
        assertEquals(expected,actual);
    }
    public static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(3,2),
                Arguments.of(1,4),
                Arguments.of(5,6)
        );


    }


}
