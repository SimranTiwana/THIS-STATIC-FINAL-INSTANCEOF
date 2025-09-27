class Book {
    static String name = "Vancouver Public Library";
    private final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        if (this instanceof Book) {
            System.out.println("Library: " + name);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        }
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + name);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Summer I Turned Pretty", "Jenny Han", "978-0132350884");
        Book b2 = new Book("After", "Tom Betterton", "978-0073523323");

        b1.display();
        b2.display();
        Book.displayLibraryName();
    }
}
