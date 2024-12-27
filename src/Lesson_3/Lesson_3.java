package Lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {

        Cat cat = new Cat("Peach");
        Cat cat1 = new Cat("Murzik");
        Dog dog = new Dog("Ali");
        Dog dog1 = new Dog("Leila");

        Cat[] cats = {new Cat("Watson", 50),
                new Cat("Sherlock", 5),
                new Cat("Boni", 25),
                new Cat("Clyde", 10),
                new Cat("Chaplin", 10)};

        System.out.println("\nRun");
        cat.run(150);
        cat1.run(201);
        dog.run(490);
        dog1.run(600);

        System.out.println("\nSwim");
        cat1.swim(10);
        dog.swim(9);
        dog1.swim(15);

        System.out.println("\nСounting Animals: " + Animal.getCountAnimal());
        System.out.println("Total cats: " + Cat.getCountCat());
        System.out.println("Total dogs: " + Dog.getCountDod());


        System.out.println("\nFeed Cats");
        Dish dish = new Dish(90);

        for (Cat cat3 : cats) {
            cat3.eat(dish);
            cat3.info();
        }

        System.out.println("\n");
        Shape circle = new Circle(8, "Red", "Pink");
        Shape rectangle = new Rectangle(10, 8, "Whight", "Black");
        Shape triangle = new Triangle(5, 8, 9, "Yellow", "Orange");

        System.out.println("Circle");
        circle.printCharacteristics();

        System.out.println("\nRectangle");
        rectangle.printCharacteristics();

        System.out.println("\nTriangle");
        triangle.printCharacteristics();
    }
}

