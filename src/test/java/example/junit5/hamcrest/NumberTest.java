package example.junit5.hamcrest;


import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class NumberTest {
    @Test
    void name() {


        MatcherAssert.assertThat(100, Matchers.greaterThan(99));
        MatcherAssert.assertThat(100, Matchers.greaterThanOrEqualTo(100));
        MatcherAssert.assertThat(90, Matchers.lessThanOrEqualTo(101));
        MatcherAssert.assertThat(100.00, Matchers.closeTo(100,10));
    }


}
