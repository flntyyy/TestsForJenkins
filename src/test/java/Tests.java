import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {


    @Test
    void addition() {
        assertEquals(2, 1 + 1);
    }


    @Test
    void additionError() {
        assertEquals(14, 1 + 131);
    }

}
