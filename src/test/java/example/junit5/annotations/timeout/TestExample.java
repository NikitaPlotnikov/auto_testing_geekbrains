package example.junit5.annotations.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TestExample {
    @Timeout(value = 2,unit = TimeUnit.SECONDS)
    @Test
    void myFirstTest() {
        System.out.println("qwer");
    }


}
