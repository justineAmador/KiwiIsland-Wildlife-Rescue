package nz.ac.aut.ense701.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.Terrain;

/*
 * Panel for representing a single GridSquare of the island on the GUI.
 * 
 * @author AS
 * @version 1.0 - created
 */

public class GridSquarePanel extends javax.swing.JPanel 
{
    /** 
     * Creates new GridSquarePanel.
     * @param game the game to represent
     * @param row the row to represent
     * @param column the column to represent
     */
    Random random;
    
    public GridSquarePanel(Game game, int row, int column)
    {
        this.game   = game;
        this.row    = row;
        this.column = column;
        initComponents();
        random = new Random();
    }

    // Reads the terrain type of the specific Grid square and then loads + adds the 
    // appropriate image to the grid square.
    public boolean addTileImage(String terrain) throws IOException{
        boolean imageAdded = false;
        BufferedImage myPicture = null;
        BufferedImage itemPicture = null;
        BufferedImage mergedPicture = null;
        
        try{
            //First determines the base image for the terrain.
            myPicture = ImageIO.read(new File((terrain) + ".jpg"));
        }
        finally{
            //Then if there is an object on the map square(pest, Kiwi, Food, etc) it will add its
            // corresponding image to the square.
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            String variant = Integer.toString(random.nextInt(3)+1); 
            if(game.getOccupantStringRepresentation(row, column) != null )
            {
              try{
            //Reads the item image by passing the item as the name of the png file.
            itemPicture = ImageIO.read(new File((game.getOccupantStringRepresentation(row, column).toUpperCase())+ variant + ".png"));
            mergedPicture = new BufferedImage(myPicture.getWidth(), myPicture.getHeight(), BufferedImage.TYPE_INT_ARGB);
            
            Graphics g = mergedPicture.getGraphics();
            g.drawImage(myPicture, 0, 0, null);
            g.drawImage(itemPicture, 30, 25, myPicture.getWidth()/2,myPicture.getHeight()/2,  null);
            picLabel =new JLabel(new ImageIcon(mergedPicture));
            
            //JLabel itemLabel = new JLabel(new ImageIcon(itemPicture));
           //this.add(itemLabel);
            }catch(Exception e){};  
            } 
             this.add(picLabel);
            
            
            
           
            imageAdded = true;
            
            //picLabel.setText(game.getOccupantStringRepresentation(row,column));
        }
        return imageAdded;
    }
    /**
     * Updates the representation of the grid square panel.
     */
    public void update() throws IOException
    {
        // get the GridSquare object from the world
        Terrain terrain   = game.getTerrain(row, column);
        boolean squareVisible = game.isVisible(row, column);
        boolean squareExplored = game.isExplored(row, column);

        Color      color;
        switch ( terrain )
        {
            case SAND     : color = Color.YELLOW;break;
            case FOREST   : color = Color.GREEN;  break;
            case WETLAND : color = Color.BLUE; break;
            case SCRUB : color = Color.DARK_GRAY;   break;
            case WATER    : color = Color.CYAN;   break;
            default  : color = Color.LIGHT_GRAY; break;
        }
        terrain   = game.getTerrain(row, column);
       
        this.addTileImage(terrain.name());
        if ( squareExplored || squareVisible )
        {
            // Set the text of the JLabel according to the occupant
            //lblText.setText(game.getOccupantStringRepresentation(row,column));
           
            
            

            // Set the colour. 
           if ( squareVisible && !squareExplored ) 
            {
            /*    // When explored the colour is brighter
                color = new Color(Math.min(255, color.getRed()   + 128), 
                                  Math.min(255, color.getGreen() + 128), 
                                  Math.min(255, color.getBlue()  + 128));
             */  
            
            }
            lblText.setBackground(color);
            // set border colour according to 
            // whether the player is in the grid square or not
            setBorder(game.hasPlayer(row,column) ? activeBorder : normalBorder);
        }
        else
        {
            
            lblText.setText("");
            lblText.setBackground(null);
            setBorder(normalBorder);
        }
       
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.BorderLayout());

        lblText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("content");
        lblText.setOpaque(true);
        add(lblText, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
    
    private Game game;
    private int row, column;
    
    private static final Border normalBorder = new LineBorder(Color.BLACK, 1);
    private static final Border activeBorder = new LineBorder(Color.RED, 5);
}
