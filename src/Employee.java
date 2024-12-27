public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long phone;
    private long salary;
    private int age;

    public Employee(String fullName, String position, String email, long phone, long salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(fullName + ' ' + position + ' ' + email + ' ' + phone + ' ' + salary + ' ' + age);
    }

}