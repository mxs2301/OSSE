package de.hfu;

import org.junit.jupiter.api.*;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import de.hfu.unit.*;

/**
 * Beispiele für Unit-Tests
 */
@DisplayName("Test der Klasse App")
public class AppTest 
{

    /**
     * Wird einmal vor allen Tests dieser Klasse aufgerufen
     */
    @BeforeAll
    static void initAll() {
    }

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
     * Wird niemals erfolgreich sein
     * Deshalb besser deaktiviert
     */

    /*
    @Test
    @Disabled("kein sinnvoller Test, deshalb deaktiviert")
    void failingTest() {
        fail("dieser Test schlägt fehl");
    }*/

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
    public void testeMonat(){
        assertTrue(Util.istErstesHalbjahr(6));
        assertTrue(Util.istErstesHalbjahr(7));
        assertTrue(!Util.istErstesHalbjahr(9));
        assertFalse(Util.istErstesHalbjahr(10));
    }

    @Test
    public void testeExceptions(){
        try{
            assertThrows(IllegalArgumentException.class, () -> {Util.istErstesHalbjahr(13);});
        }catch (Exception aa){
            System.out.println("Exception wurde abgefangen");
            System.out.println(aa.getMessage());
        }
    }

    @Test
    public void testeQueue(){
        Queue schlange = new Queue(3);

        try{
            assertThrows(IllegalStateException.class, () -> {schlange.dequeue();});
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        schlange.enqueue(4);
        assertNotNull(schlange);
        assertEquals(4, schlange.dequeue());

    }

}