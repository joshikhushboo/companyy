public class Employee {
    String name;
    double salary;
    int exp;

    public Employee(double salary, int exp, String name) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
