public class Main {
    public static void main(String[] args) {
        Cat[] singleCat = new Cat[3];
        singleCat[0] = new Cat("Барсик", 190, 4);
        singleCat[1] = new Cat("Пушок", 910, 0);
        singleCat[2] = new Cat("Котя", 90, 100);

        Dog dog0 = new Dog("Шарик", 400, 7);
        Dog dog1 = new Dog("Рекс", 700, 15);


        for (Cat catCount : singleCat) {
            catCount.run(catCount.MAX_RUN_DISTANCE);
            catCount.swim(catCount.MAX_SWIM_DISTANCE);
        }

        System.out.println();
        dog0.run(dog0.runDistance);
        dog0.swim(dog0.swimDistance);
        dog1.run(dog1.runDistance);
        dog1.swim(dog1.swimDistance);

        System.out.println();
        System.out.println("Всего животных: " + Animal.count);
        System.out.println("Всего котов: " + Cat.count);
        System.out.println("Всего собак: " + Dog.count);

    }
}
