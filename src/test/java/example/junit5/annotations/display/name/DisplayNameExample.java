package example.junit5.annotations.display.name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Набот тестов")
public class DisplayNameExample {
    @DisplayName("Тест кейс")
    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
}
