import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GovernmentTest {
    private Government GOVERNMENT;
    @BeforeEach
    void setUp() {
        GOVERNMENT = Government.getInstance();
    }

    @Test
    void shouldGetTheSameInstance() {
        assertEquals(GOVERNMENT, Government.getInstance());
    }

    @Test
    void shouldGetTheCommunication() {
        assertEquals(GOVERNMENT.communicate(), "Government communicate");
    }
}