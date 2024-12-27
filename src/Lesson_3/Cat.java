package Lesson_3;

public class Cat extends Animal{
    String name;
    private int appetite;
    private boolean hungry;
    static int countCat = 0;

    Cat (String name){
        countCat++;
        this.name = name;

    }
    Cat(String name, int appetite) {
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name+ " can't run more than 200 m");
        } else {
            System.out.println(name + " ran " + range + " m");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Cats can't swim");
    }

    static int getCountCat(){
        return countCat;
    }
    void info() {
        String Hungry = !hungry ? "well fed" : "hungry";
        System.out.println(name + ": " + Hungry);
    }

    void eat(Dish plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }

}
