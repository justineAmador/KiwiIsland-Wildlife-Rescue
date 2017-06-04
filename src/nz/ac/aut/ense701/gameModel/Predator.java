package nz.ac.aut.ense701.gameModel;

/**
 * Predator represents a predator on the island.
 * If more specific behaviour is required for particular predators, descendants 
 * for this class should be created
 * @author AS
 * @version July 2011
 */
public class Predator extends Fauna
{

    private static final String[] facts = {
                                      "The biggest threat to kiwi chicks is stoats, and to adult kiwi, dogs",
                                      "Stoats are responsible for approximately half of kiwi chick deaths on the mainland",
                                      "An average of 27 kiwi are killed by predators EVERY WEEK. At this rate, kiwi may disappear from the mainland in our lifetime",
                                      "DOC uses traps and Biodegradable 1080 poison drops to catch or kill the predators",
                                      "Rats have a major impact on New Zealand’s wildlife because they eat native animals and their eggs",
                                      "The biggest threat to kiwi chicks is stoats, and to adult kiwi, dogs"
                                     };
    
    private final int id;
    private static int nextId = 0;
    
    /**
     * Constructor for objects of class Predator
     * @param pos the position of the predator object
     * @param name the name of the predator object
     * @param description a longer description of the predator object
     */
    public Predator(Position pos, String name, String description) 
    {
        super(pos, name, description);
        id = nextId;
        nextId++;
    } 
 
    
    public String getFact(){
        return facts[id];
    }

    @Override
    public String getStringRepresentation() 
    {
        return "P";
    }    
}
