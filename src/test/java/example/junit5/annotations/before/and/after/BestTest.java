package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BestTest {
    @BeforeAll
    static void beforeAllBestTest() {
        System.out.println("BestTest:beforeAll");
    }
    @BeforeEach
    void setUp1BestTest() {
        System.out.println("BestTest:setUp1");
    }
    @AfterAll
    static void afterAllBestTest() {
        System.out.println("BestTest:afterAll");
    }
}
