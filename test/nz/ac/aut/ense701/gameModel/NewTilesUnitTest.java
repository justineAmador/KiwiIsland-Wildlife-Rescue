/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.io.IOException;
import nz.ac.aut.ense701.gui.GridSquarePanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class NewTilesUnitTest {
    Game game = new Game();
    private String terrain;
    private String invalid;
    private GridSquarePanel panel;
    
    public NewTilesUnitTest() {
    }
    
    
    @Before
    public void setUp() {
        panel  = new GridSquarePanel(game, 1, 1);
        terrain = "WATER";
        invalid = "ASDASDAD";
    }
    
    @After
    public void tearDown() {
        panel  = null;
        terrain = null;
        invalid = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAddTileImage() throws IOException{
             assertEquals(true, panel.addTileImage("Water"));
    }
    @Test
    public void testAddInvalidTileImage() throws IOException{
        
            assertFalse(false, panel.addTileImage("asadsd"));
    }

    private void assertFalse(boolean b, boolean addTileImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertTrue(boolean b, boolean addTileImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
