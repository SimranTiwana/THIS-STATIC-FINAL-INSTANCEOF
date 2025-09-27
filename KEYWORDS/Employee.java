class Employee {
    static String organization = "PLUS";
    private static int empCount = 0;
    private final int id;
    String name;
    String role;

    Employee(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.id = id;
        empCount++;
    }

    void display() {
        if (this instanceof Employee) {
            System.out.println("Organization: " + organization);
            System.out.println("Employee ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Role: " + this.role);
        }
    }

    static void count() {
        System.out.println("Total number of employees: " + empCount);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Simran", "Manager", 1);
        Employee e2 = new Employee("Jasmine", "HR", 2);
        Employee e3 = new Employee("Chris", "Team Lead", 3);
        Employee e4 = new Employee("Jared", "Intern", 4);

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        Employee.count();
    }
}
