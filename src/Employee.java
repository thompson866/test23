public class Employee {

    private static String name;
    private static int department;
    private static int salary;
    private static int id;
    private int counterId = 1;


    public Employee(String name, int department, int salary) {
        this.id = counterId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getId() {
        return id;
    }
    @Override
    public String toString(){

        return  name + department+salary+id;
    }

}

