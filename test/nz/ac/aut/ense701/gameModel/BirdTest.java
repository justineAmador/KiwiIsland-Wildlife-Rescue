package nz.ac.aut.ense701.gameModel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AS
 * @version 2011
 */
public class BirdTest {
    
    private Bird bird;
    private Position position;
    private Island island;
    
    public BirdTest() {
    }
    
    @Before
    public void setUp() {
        island = new Island(5,5);
        position = new Position(island, 4,4);
        bird = new Bird(position, "Kiwi", "So cute!");   
    }
    
    @After
    public void tearDown() {
        island = null;
        position = null;
        bird = null;
    }

    @Test
    public void testFedNotFed() {
        assertFalse("Should not be fed", bird.fed());
    }
    
    @Test
    public void testFed() {
        assertFalse("Should not be fed", bird.fed());
        bird.feed();
        assertTrue("Should  be fed", bird.fed());
    }

    /**
     * Test of getStringRepresentation method, of class Kiwi.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("B", bird.getStringRepresentation());
    }
    
}