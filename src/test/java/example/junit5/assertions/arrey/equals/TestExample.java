package example.junit5.assertions.arrey.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TestExample {
    @Test
    void myFirstTest() {
       String[] strings1 = {"123","123"};
       String[] strings2 = {"123","123"};

       assertArrayEquals(strings1,strings2);
    }




}
