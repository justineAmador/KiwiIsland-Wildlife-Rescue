package nz.ac.aut.ense701.gameModel;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/**
 * The test class FoodTest.
 *
 * @author  James Collie
 * @version April 2017
 */
public class BirdFoodTest extends junit.framework.TestCase
{
    private BirdFood seed;
    private Position position;
    private Island island;
    /**
     * Default constructor for test class FoodTest
     */
    public BirdFoodTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Override
    protected void setUp()
    {
        island = new Island(5,5);
        position = new Position(island, 4,4);
        seed = new BirdFood(position, "seed", "Crunchy Seeds", 1.0, 2.0, 1.5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Override
    protected void tearDown()
    {
        seed = null;
        island = null;
        position = null;
    }

    @Test
    public void testGetEnergy()
    {
        assertEquals(1.5, seed.getEnergy(), 0.01);
    }
    
    @Test
    public void testGetStringRepresentation() {
        assertEquals("E",seed.getStringRepresentation());
    }
    
    // Tests for methods in herited from Item
    // These should be testing in one descendant class
    @Test   
    public void testGetWeight()
    {
        assertEquals(1.0, seed.getWeight(), 0.01);
    }

    @Test
    public void testGetSize()
    {
        assertEquals(2.0, seed.getSize(), 0.01);
    }

    @Test
    public void testIsOkToCarryCanCarry(){
        assertTrue("Should be carrable.", seed.isOkToCarry());
    }
    
    @Test
    public void testIsOkToCarryCannotCarry(){
        BirdFood tooBig = new BirdFood(position, "10 tonnes ofBread", "Stale Bread", 1.0, 0.0, 1.0);
        assertFalse("Shouldn't be carrable.", tooBig.isOkToCarry());
    }        
    

}
