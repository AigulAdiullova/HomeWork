package Lesson_3;

public class Dog extends Animal{
    String name;
    static int countDod = 0;

    Dog(String name){
        super();
        countDod++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name+ " can't run more than 500 m");
        } else {
            System.out.println(name+ " ran " + range + " m");
        }

    }
    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Dog cannot to swim more " +range+ " m");
        } else {
            System.out.println(name + " swam " + range + " m");
        }
    }

    static int getCountDod (){
        return countDod;
    }
}
