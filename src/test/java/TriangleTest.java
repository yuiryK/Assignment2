
import org.example.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void testEquilateral() {
        assertEquals("Equilateral", Triangle.classify(3, 3, 3));
    }

    @Test
    void testIsosceles() {
        assertEquals("Isosceles", Triangle.classify(3, 3, 4));
        assertEquals("Isosceles", Triangle.classify(4, 3, 3));
        assertEquals("Isosceles", Triangle.classify(3, 4, 3));
        assertEquals("Isosceles", Triangle.classify(10, 10, 15));

    }


    @Test
    void testScalene() {
        assertEquals("Scalene", Triangle.classify(3, 4, 5));
        assertEquals("Scalene", Triangle.classify(7, 10, 12));

    }

    @Test
    void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classify(1, 1, 3));
        assertEquals("NotATriangle", Triangle.classify(1, 2, 3));
        assertEquals("NotATriangle", Triangle.classify(2, 3, 5));
        assertEquals("NotATriangle", Triangle.classify(0, 0, 0));
        assertEquals("NotATriangle", Triangle.classify(-1, 2, 3));
        assertEquals("NotATriangle", Triangle.classify(2, 2, 4));
        assertEquals("NotATriangle", Triangle.classify(-3, -3, -3));
        assertEquals("NotATriangle", Triangle.classify(0, 3, 3));
        assertEquals("NotATriangle", Triangle.classify(3, 0, 3));
        assertEquals("NotATriangle", Triangle.classify(1, 2, 4)); // `a + b < c`
        assertEquals("NotATriangle", Triangle.classify(2, 2, 4)); // `a + b == c`
        assertEquals("NotATriangle", Triangle.classify(2, 4, 1)); // `a + c < b`
        assertEquals("NotATriangle", Triangle.classify(2, 4, 2)); // `a + c == b`
        assertEquals("NotATriangle", Triangle.classify(4, 1, 2)); // `b + c < a`
        assertEquals("NotATriangle", Triangle.classify(4, 2, 2)); // `b + c == a`
        }
}
