import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDTest {

    @Test
    public void testHelloWorld() {
        TDD tdd = new TDD();
        assertEquals("Hello World", tdd.helloWorld());
    }
}
