package personal.oop.practice3.abst;

/**
 * The type Player.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-02
 */
public abstract class Player implements Selectable, Playable {
    /**
     * The Name.
     */
    private String name;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Play string.
     *
     * @return the play return
     */
    public abstract String play();
}
