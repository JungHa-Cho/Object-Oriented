package personal.oop.practice2.intf;

/**
 * The interface Building.
 */
public interface Building extends Company {
    /**
     * Come to work boolean.
     *
     * @param worker the worker
     * @return the boolean
     */
    boolean comeToWork(Worker worker);

    /**
     * Check worker.
     */
    void checkWorker(Employer employer);
}
