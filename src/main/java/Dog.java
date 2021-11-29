public class Dog extends Animal {
    protected final int MAX_RUN_DISTANCE = 500;
    protected final int MAX_SWIM_DISTANCE = 10;
    protected String name;
    public static int count = 0;




    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }



    @Override
    void run(int runDistance) {
        if ((this.runDistance > 0) && (this.runDistance <= MAX_RUN_DISTANCE)) {
            System.out.println("Пес " + this.name + " пробежал " + this.runDistance + " метров");
        } else {
            System.out.println("Пес " + this.name + " не может пробежать " + this.runDistance + " метров, а только " + MAX_RUN_DISTANCE);
        }
    }


    @Override
    void swim(int swimDistance) {
        if ((this.swimDistance > 0) && (this.swimDistance <= MAX_SWIM_DISTANCE)) {
            System.out.println("Пес " + this.name + " проплыл " + this.swimDistance + " метров");
        } else {
            System.out.println("Пес " + this.name + " не может проплыть " + this.swimDistance + " метров");
        }
    }
}
