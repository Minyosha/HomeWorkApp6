public class Cat extends Animal {
    protected final int MAX_RUN_DISTANCE = 200;
    protected final int MAX_SWIM_DISTANCE = 0;
    protected String name;
    public static int count = 0;

    public Cat(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }


    @Override
    protected void run(int runDistance) {
        if ((this.runDistance > 0) && (this.runDistance <= MAX_RUN_DISTANCE)) {
            System.out.println("Кот " + this.name + " пробежал " + this.runDistance + " метров");
        } else {
            System.out.println("Кот " + this.name + " не может пробежать " + this.runDistance + " метров, а только " + MAX_RUN_DISTANCE);
        }
    }


    @Override
    void swim(int swimDistance) {
        System.out.println("Кот " + this.name + " не умеет плавать");
//        if ((lenght > 0) && (lenght <= MAX_SWIM_DISTANCE)) {
//            System.out.println("Кот " + this.name + "проплыл " + lenght + " метров");
//        } else {
//            System.out.println("Кот " + this.name + "не может проплыть " + lenght + " метров");
//        }
    }
}
