package example.junit5.assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    void myFirstTest() {
        String[] strings1 = {"123","123"};
        String[] strings2 = {"123","123"};

        Assertions.assertAll("Пользователь",
                () -> Assertions.assertEquals("Иван","Петр"),
                () -> Assertions.assertArrayEquals(strings1,strings2),
                () -> Assertions.assertEquals(1,0),
                () -> Assertions.assertEquals("Иван","Иван")
        );

    }


}
