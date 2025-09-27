class Student {
    static String university = "Chitkara University";
    private final int rollNo;
    String name;
    String grade;

    Student(String name, String grade, int rollNo) {
        this.name = name;
        this.grade = grade;
        this.rollNo = rollNo;
    }

    void display() {
        if (this instanceof Student) {
            System.out.println("----- Student Details -----");
            System.out.println("University: " + university);
            System.out.println("Roll Number: " + this.rollNo);
            System.out.println("Name: " + this.name);
            System.out.println("Grade: " + this.grade);
        }
    }

    static void total_students(int total) {
        System.out.println("Total Students Enrolled: " + total);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Simran", "A", 1);
        Student s2 = new Student("Jasmine", "O", 2);
        Student s3 = new Student("Chris", "A+", 3);
        Student s4 = new Student("Jared", "C", 4);
        Student s5 = new Student("Avani", "A+", 5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

        total_students(5);
    }
}
