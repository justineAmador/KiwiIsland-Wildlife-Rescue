package nz.ac.aut.ense701.gameModel;

/**
 * This class represents food that can be found on the island
 * and supplies energy when being consumed (used) by the player.
 * 
 * @author AS
 * @version July 2011
 */
public class BirdFood extends Item
{
    private static final TrueFalseQuestion[] questions = 
    {
      new TrueFalseQuestion("Kiwis lay the smallest eggs in relation to their body size in the world", false),
      new TrueFalseQuestion("Kiwi birds will always have one life partner", true),
      new TrueFalseQuestion("Kiwi birds use the nostrils at the end of their beaks to find food underground", true),
      new TrueFalseQuestion("Kiwi birds can fly", false),
      new TrueFalseQuestion("Kiwi birds are nocturnal birds", true),
      new TrueFalseQuestion("Kiwi birds are not in the threat of extinction", false),
      new TrueFalseQuestion("Kiwi birds are gentle birds and can’t defend themselves against predators", false),
      new TrueFalseQuestion("Kiwi birds are only found in New Zealand", true),
      new TrueFalseQuestion("Kiwi birds have a strong cultural, spiritual and historic association with the Maori", true),
      new TrueFalseQuestion("Kiwi birds can fly", false),
                          
    };
    private double energy;
    private final int id;
    private static int nextId;
    
    /**
     * Construct a food object with known attributes.
     * @param pos the position of the food object
     * @param name the name of the food object
     * @param description a longer description of the food object
     * @param weight the weight of the food object
     * @param size the size of the food object
     * @param energy stamina contribution of the food object
     *               when the player uses the object
     */
    public BirdFood(Position pos, String name, String description, double weight, double size, double energy) 
    {
        super(pos, name, description,weight, size);
        this.energy = energy;
        id = nextId;
        nextId++;
    }


    public TrueFalseQuestion getQuestion(){
        return questions[id];
    }
    
    
    /**
     * Gets the energy of the food.
     * @return the energy of the food
     */
    public double getEnergy() {
        return this.energy;
    }
    
    /**
     * @return string representation of food
     */
    @Override
    public String getStringRepresentation() 
    {
        return "E";
    }
}
