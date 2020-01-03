package personal.oop.practice2.intf;

/**
 * The interface Worker.
 */
public interface Worker extends Company {
    /**
     * Leave home.
     */
    void leaveHome();

    /**
     * Work.
     */
    void work();

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();
}
