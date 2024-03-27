
public class Department {
    Employee emp;

    public void afterbonus(Employee emp) {
        if (emp.getExp() >= 5) {
            double new_sal = emp.getSalary() + (emp.getSalary() * 0.1);
            emp.setSalary(new_sal);
            System.out.println("salary would be incresed by 10% and the new salary is " + emp.getSalary());

        } else {
            System.out.println("No salary will be increased for this employee");
        }
    }

    public static void main(String[] args) {
        Department dept = new Department();

        Employee[] e = {
                new Employee(100000, 6, "rohan"),
                new Employee(50000, 3, "mohan"),
                new Employee(60000, 5, "sohan")
        };

        for (int i = 0; i < e.length; i++) {
            dept.afterbonus(e[i]);
        }

    }

}
