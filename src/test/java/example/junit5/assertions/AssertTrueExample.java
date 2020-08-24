package example.junit5.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueExample {
    @Test
    void assertNotNull() {
        String name = "кот";
        Assertions.assertNotNull(name);
    }
    @Test
    void assertNull() {
        String name = null;
        Assertions.assertNull(name);
    }
}
