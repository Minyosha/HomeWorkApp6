public abstract class Animal {
    private final int MAX_RUN_DISTANCE = 0;
    private final int MAX_SWIM_DISTANCE = 0;
    private String name;
    public int runDistance;
    public int swimDistance;
    public static int count = 0;

    public Animal() {
        count++;
    }

    abstract void run(int lenght);

    abstract void swim(int lenght);


}
