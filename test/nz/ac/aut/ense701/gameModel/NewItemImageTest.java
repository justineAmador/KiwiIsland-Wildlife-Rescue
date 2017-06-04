/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Random;
import nz.ac.aut.ense701.gui.GridSquarePanel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class NewItemImageTest {
    Game game = new Game();
    private String terrain;
    private GridSquarePanel panel;
    private Position position;
    private Island island;
    private Tool tool1;
    private Random random;
    private String variant;
    
    
    public NewItemImageTest() {
    }
    
    
    @Before
    public void setUp() {
        panel  = new GridSquarePanel(game, 1, 1);
        terrain = "WATER";
        island = new Island(5,5);
        position = new Position(island, 4,4);
        tool1 = new Tool(position, "Trap","An effective and efficient pest trap", 1, 1);
        random = new Random();
        variant = Integer.toString(random.nextInt(3)+1); 
            
       }
    
    @After
    public void tearDown() {
        panel  = null;
        terrain = null;
        island = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAddTileImage() throws IOException{
        
             assertEquals(true, panel.addTileImage(terrain));
    }
    @Test
    public void testAddRandomItemImage() throws IOException{
        Boolean read = false;  
        
        try{
            //Reads the item image by passing the item as the name of the png file.
            BufferedImage itemPicture = ImageIO.read(new File((tool1.getStringRepresentation().toUpperCase())+ variant + ".png"));
            
            if(itemPicture != null ){
                read = true;
            }
            
            }catch(IOException e){}
            assertEquals(true, read);
 
    }
    
    @Test
    public void testAddItemImage() throws IOException{
        Boolean read = false;  
        
        try{
            //Reads the item image by passing the item as the name of the png file.
            BufferedImage itemPicture = ImageIO.read(new File((tool1.getStringRepresentation().toUpperCase())+ "1" + ".png"));
            
            if(itemPicture != null ){
                read = true;
            }
            
            }catch(IOException e){}
            assertEquals(true, read); 
    }

    private void assertFalse(boolean b, boolean addTileImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertTrue(boolean b, boolean addTileImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}