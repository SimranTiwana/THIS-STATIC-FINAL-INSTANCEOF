class Vehicle {
    static double fee = 600;
    private final String reg;
    String owner;
    String type;

    Vehicle(String owner, String type, String reg) {
        this.owner = owner;
        this.type = type;
        this.reg = reg;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("----- Vehicle Details -----");
            System.out.println("Registration Number: " + this.reg);
            System.out.println("Owner: " + this.owner);
            System.out.println("Vehicle Type: " + this.type);
            System.out.println("Registration Fee: " + fee);
        }
    }

    static void updateFee(double newFee) {
        fee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Simran", "Car", "CF3478");
        Vehicle v2 = new Vehicle("jasmine", "Bike", "VA6721");
        Vehicle v3 = new Vehicle("Chris", "Car", "BC92N1");

        v1.display();
        v2.display();
        v3.display();

        Vehicle.updateFee(1000);
        System.out.println("Registration fee has been updated to Rs 1000 for all vehicles.");

        v1.display();
        v2.display();
        v3.display();
    }
}
