package de.hfu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import de.hfu.unit.*;

/**
 * Beispiele für Unit-Tests
 */
@DisplayName("Test der Klasse App")
public class  AppTest {

    /**
     * Wird einmal vor allen Tests dieser Klasse aufgerufen
     */


    /**
     * Wird niemals erfolgreich sein
     * Deshalb besser deaktiviert
     */


    /*
    @BeforeAll
    static void initAll() {
    }*/

    /**
     * Wird jeweils vor den Tests dieser Klasse aufgerufen
     */
    @BeforeEach
    void init() {
    }

    /**
     * Wird immer erfolgreich sein
     */
    @Test
    void succeedingTest() {
        assertEquals(1, 1, "ist immer gleich");
    }

    /**
     * Wird jeweils nach den Tests dieser Klasse aufgerufen
     */
    @AfterEach
    void tearDown() {
    }

    /**
     * Wird einmal nach allen Tests dieser Klasse aufgerufen
     */
    @AfterAll
    static void tearDownAll() {
    }

    @Test
    public void testeMonat() {
        assertTrue(Util.istErstesHalbjahr(6));
        assertFalse(Util.istErstesHalbjahr(7));
        assertFalse(Util.istErstesHalbjahr(9));
        assertFalse(Util.istErstesHalbjahr(10));
    }

    @Test
    public void testeExceptions() {
        assertThrows(IllegalArgumentException.class, () -> {
            Util.istErstesHalbjahr(13);
        });
        System.out.println("Exception wurde abgefangen");
    }

    @Test
    public void Lui() {
        try {
            Util.istErstesHalbjahr(0);
            fail("Luis ist schwanger");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception wurde geworfen");
        }
    }

    @Test
    public void testeQueue() {
        Queue schlange = new Queue(3);

        assertThrows(IllegalStateException.class, () -> {
            schlange.dequeue();
        });

        schlange.enqueue(4);
        assertNotNull(schlange);
        assertEquals(4, schlange.dequeue());
        assertNotNull(schlange);
    }

}