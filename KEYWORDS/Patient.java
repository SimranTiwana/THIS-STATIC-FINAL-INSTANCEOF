class Patient {
    static String hospital = "Neelam Hospital";
    private static int count = 0;
    private final int id;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int id) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.id = id;
        count++;
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println("----- Patient Details -----");
            System.out.println("Hospital: " + hospital);
            System.out.println("Patient ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
        }
    }

    static void total() {
        System.out.println("Total Patients Admitted: " + count);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Simran", 30, "Flu", 1);
        Patient p2 = new Patient("Jasmine", 25, "Headache", 2);
        Patient p3 = new Patient("Chris", 28, "Sprain", 3);

        p1.display();
        p2.display();
        p3.display();

        System.out.println();
        total();
    }
}
