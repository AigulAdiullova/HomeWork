package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        Employee human = new Employee("Adiullova Aigul Renatovna", "trainee", "adiullova@mail.ru", 89999999, 100000, 30);
        System.out.println("\nЗадание 1.");
        human.printInfo();

        System.out.println("\nЗадание 2.");
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "director", "iii@mail.ru", 77777777, 800000, 45);
        persArray[1] = new Employee("Alexandrov Alexander Alexandrovich", "manager", "aaa@mail.ru", 798755555, 127000, 32);
        persArray[2] = new Employee("Tolstoy Lev Nikolaevich", "business analyst", "tolstoy@mail.ru", 799977712, 300000, 28);
        persArray[3] = new Employee("Leonardo Da Vinci", "developer", "davinci@mail.ru", 799955547, 120000, 21);
        persArray[4] = new Employee("Robinson Crusoe", "hr manager", "rc@mail.ru", 799944458, 138000, 35);
        for(int i = 0; i < persArray.length; i++) {
            persArray[i].printInfo();
        }
    }
}
