package example.junit5.annotations.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExample {
    @Test
    void myFirstTest1() {
        assertEquals(2, 1 + 1);
    }
    @Test
    void myFirstTest2() {
        assertEquals(2, 1 + 1);
    }
    @Test
    void myFirstTest3() {
        assertEquals(2, 1 + 1);
    }
    @Disabled
    @Test
    void myFirstTest4() {
        assertEquals(2, 1 + 1);
    }


}
