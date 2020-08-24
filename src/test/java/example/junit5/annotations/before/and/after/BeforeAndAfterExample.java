package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.*;

public class BeforeAndAfterExample  extends BestTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAndAfterExample:beforeAll");
    }

    @BeforeEach
    void setUp1() {
        System.out.println("BeforeAndAfterExample:setUp1");
    }
    @BeforeEach
    void setUp2() {
        System.out.println("BeforeAndAfterExample:setUp2");
    }
    @Test
    void Test1() {
       System.out.println("BeforeAndAfterExample:Test1");
    }
    @Test
    void Test2() {
        System.out.println("BeforeAndAfterExample:Test2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeAndAfterExample:tearDown");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("BeforeAndAfterExample:afterAll");
    }
}
