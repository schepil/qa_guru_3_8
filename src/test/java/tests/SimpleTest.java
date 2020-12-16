package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Tag("simple_tests")
public class SimpleTest {

    int a = 2,
        b = 3;

    @Test
    void assertTrue() {
        assertNotEquals(a,b);
    }

    @Test
    void assertFalse() {
        assertEquals(a,b);
    }
}
