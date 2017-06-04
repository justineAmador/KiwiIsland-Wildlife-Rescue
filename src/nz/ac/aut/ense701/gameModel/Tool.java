package nz.ac.aut.ense701.gameModel;

/**
 * This class represents a tool that can be found on the island
 * and gives the player any sort of advantage. 
 * 
 * @author AS
 * @version July 2011
 */

public class Tool extends Item 
{
    private static final TrueFalseQuestion[] questions = 
    {
      new TrueFalseQuestion("The biggest threat to kiwi chicks is stoats, and to adult kiwi, dogs", true),
      new TrueFalseQuestion("An average of 5 kiwi are killed by predators every week", false),
      new TrueFalseQuestion("Rats eat native animals and their eggs", true),
      new TrueFalseQuestion("DOC isn’t allowed to use Biodegradable 1080 poison drops to kill predators", false),
      new TrueFalseQuestion("Stoats are responsible for approximately half of kiwi chick deaths", true)                          
    };
    
    private boolean broken;
    private final int id;
    private static int nextId = 0;
    
    /**
     * Construct a tool with known attributes.
     * @param pos the position of the tool
     * @param name the name of the tool
     * @param description a longer description of the tool
     * @param weight the weight of the tool
     * @param size the size of the tool
     */
    public Tool(Position pos, String name, String description, double weight, double size) 
    {
        super(pos, name, description, weight, size);
        this.broken = false;
        id = nextId;
        nextId++;
    }
    
    public TrueFalseQuestion getQuestion(){
        return questions[id];
    }
    
    
    /**
     * Break the tool
     */
    public void setBroken()
    {
        broken = true;
    }
    
    /**
     * Fix the tool
     */
    public void fix()
    {
        broken = false;
    }
    
    /**
     * Is tool broken
     * @return true if broken
     */
    public boolean isBroken()
    {
        return this.broken;
    }
    
    /**
    * Check if this tool is a predator trap
    * @return true if trap
     */
    public boolean isTrap()
    {
      String name = this.getName();
      return name.equalsIgnoreCase("Trap");
    }
 
    /**
    * Check if this tool is a screwdriver
    * @return true if screwdriver
     */    
    public boolean isScrewdriver() {
       String name = this.getName();
      return name.equalsIgnoreCase("Screwdriver"); 
    }
    
    
    @Override
    public String getStringRepresentation() 
    {
        return "T";
    }

}
