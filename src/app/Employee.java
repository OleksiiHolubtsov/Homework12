package app;

public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final int age;


    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Посада: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вік: " + age);
    }
}
