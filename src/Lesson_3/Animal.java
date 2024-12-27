package Lesson_3;

public class Animal {
    static int countAnimal = 0;
    Animal(){
        countAnimal++;
    }

    void run (int range) {
        System.out.println("Animal ran " + range + " m");
    }

    void swim (int range){
        System.out.println("Animal swam " + range + " m");
    }

    public static int getCountAnimal(){
        return countAnimal;
    }

}
