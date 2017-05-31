
package nz.ac.aut.ense701.gameModel;

/**
 * Bird represents a NZ native bird living on the island
 * @OriginalAuthor AS
 * @Modified by James Collie
 * @version April 2017
 */
public class Bird  extends Fauna
{
    private boolean fed;
    /**
     * Constructor for objects of class Bird
     * @param pos the position of the bird object
     * @param name the name of the bird object
     * @param description a longer description of the bird
     */
    public Bird(Position pos, String name, String description) 
    {
        super(pos, name, description);
        fed = false;
    } 
    
    /**
    * Feeds the kiwi
    */
    public void feed() {
        fed = true;
    }
 
   /**
    * Has this kiwi been counted
    * @return true if counted.
    */
    public boolean fed() {
        return fed;
    }


    @Override
    public String getStringRepresentation() 
    {
        return "B";
    }     
}
