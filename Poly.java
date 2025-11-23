// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getDetails(){
        return "Name: "+name+", Salary: "+salary;
    }
}



// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee {
    private String department;

    // The constructor must call the superclass constructor first.
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }
}


public class Poly {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()
        Manager mang = new Manager("Bob",80000,"IT");
        Employee emp = new Employee("Alice",50000);

        System.out.println(emp.getDetails());
        System.out.println(mang.getDetails());
    }
}
