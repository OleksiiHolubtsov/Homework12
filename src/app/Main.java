
package app;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Олексій Голубцов", "Технік", "oleksii@gmail.com",
                "+380931231231", 29);
        employee.printEmployeeInfo();


        Car car = new Car();
        car.start();
    }
}
