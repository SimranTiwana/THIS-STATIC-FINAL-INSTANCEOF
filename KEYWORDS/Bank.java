class Bank {
    static String name = "ICICI";
    static int count = 0;
    final int accNo;
    String holder;

    Bank(String holder, int accNo) {
        this.holder = holder;   
        this.accNo = accNo;     
        count++;        
    }

    static void AccCount() {
        System.out.println("Number of accounts created: " + count);
    }

    void display() {
        System.out.println("---- Account Info ----");
        System.out.println("Bank: " + name);
        System.out.println("Holder Name: " + holder);
        System.out.println("Account No: " + accNo);
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("Simran", 6284);
        Bank b2 = new Bank("Jasmine", 77861);
        Bank b3 = new Bank("Chris", 60474);

        b1.display();
        b2.display();
        b3.display();

        Bank.AccCount();
    }
}
