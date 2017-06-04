
package nz.ac.aut.ense701.gameModel;

/**
 * Kiwi represents a kiwi living on the island
 * @author AS
 * @version July 2011
 */
public class Kiwi  extends Fauna
{
    private static final String[] facts = {
                               "Female kiwis lay one of the largest eggs in relation to their body\nsize of any bird in the world",
                               "Kiwi birds are among the few species that tend to live as monogamous\ncouples, this means they mate for life",
                               "They are the only birds with nostrils at the end of their beaks, along\n with sensory pits which allow them to find food underground",
                               "It's common knowledge that kiwis are flightless, this is because before\n humans arrived in New Zealand, there were hardly any predators endangering\n the kiwi population, so most flightless birds were relatively safe\n living and nesting on the ground",
                               "Kiwis are nocturnal birds. The night brings many of the underground invertebrates\n they like to eat closer to the soil's surface, as well as offering protection\n from daylight predators",
                               "All kiwi species are threatened with extinction, but to varying degrees",
                               "Kiwi birds are actually very aggressive. They’ll attack other birds entering their\n territory and fight back against predators",
                               "These small birds are the national bird of New Zealand and this is the only place in\n the world you’ll find them, outside of zoos",
                               "The bird itself is a treasure to the Maori people, who have strong cultural, spiritual\n and historic associations with kiwi",
                               "Female kiwis lay one of the largest eggs in relation to their body\nsize of any bird in the world"    
                            };
    private boolean counted;
    private final int id;
    private static int nextId = 0;
    
    
    /**
     * Constructor for objects of class Kiwi
     * @param pos the position of the kiwi object
     * @param name the name of the kiwi object
     * @param description a longer description of the kiwi
     */
    public Kiwi(Position pos, String name, String description) 
    {
        super(pos, name, description);
        counted = false;
        id = nextId;
        nextId++;
    } 
    
    /**
     * Get the fact associated with this kiwi
     * @return 
     */
    public String getFact(){
        return facts[id];
    }
    
    /**
     * Get the id
     * @return 
     */
    public int getId(){
        return id;
    }
    
    /**
    * Count this kiwi
    */
    public void count() {
        counted = true;
    }
 
   /**
    * Has this kiwi been counted
    * @return true if counted.
    */
    public boolean counted() {
        return counted;
    }


    @Override
    public String getStringRepresentation() 
    {
        return "B";
    }     
}
