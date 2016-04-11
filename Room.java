/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    /**
     * Room's description as a line of text.
     */ 
    public String description;
    /**
     * Room at the north of that room or null.
     */
    public Room northExit;
    /**
     * Room at the north of that room or null.
     */
    public Room southExit;
    /**
     * Room at the north of that room or null.
     */
    public Room eastExit;
    /**
     * Room at the north of that room or null.
     */
    public Room westExit;
    
    /**
     * la Room qui mene a la sortie.
     */
    public String directSortie;        
    /**
     * objet dans la room ou null.
     */
    public Objet objet;
    /**
     * Adverssaire dans la room ou null.
     */
    public Adversaire adversaire;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     * @param guide the direction to target.
     */
    public void setExits(Room north, 
                        Room east, 
                        Room south, 
                        Room west, String guide) 
    {
        if (north != null)
            northExit = north;
        if (east != null)
            eastExit = east;
        if (south != null)
            southExit = south;
        if (west != null)
            westExit = west;
        
        directSortie = guide;
    }
    
    /**
     * met un Adversaire dans la Room
     * @param adv l'Adversaire a mettre
     */
    public void setAdversaire(Adversaire adv) {
        this.adversaire = adv;
    }
    
    /**
     * met un  dans la Room
     * @param obj l'objet a mettre
     */
    public void setObjet(Objet obj) {
        this.objet = obj;
    }
    
    /**
     * obtient la Room suivante
     * @param r la direction de la
     * room suivante
     * @return nextRoom la Room suivante
     */
    public Room nextRoom(String r) {
        Room nextRoom = null;
        if (r.equals("north")) {
            nextRoom = northExit;
        }
        if (r.equals("east")) {
            nextRoom = eastExit;
        }
        if (r.equals("south")) {
            nextRoom = southExit;
        }
        if (r.equals("west")) {
            nextRoom = westExit;
        }        
        return nextRoom ;      
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
