import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMainTest {

    @Test
    void main() {
//        1

    }

    @Test
    void arr() {
        TestMain tm = new TestMain();
        assertEquals(tm.arr(1, 2, 3, 4), 2);
    }
}