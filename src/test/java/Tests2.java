import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests2 {


    @Test
    void addition() {
        assertEquals(2, 1 + 1);
    }


    @Test
    void additionError() {
        assertEquals(10, 1 + 9);
    }

}
