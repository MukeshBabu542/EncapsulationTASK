package Encapsulation;

public class Book {
    // Private instance variables
    private String title;
    private String author;
    private int publicationYear;
    private String availabilityStatus;

    // Constructor 
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availabilityStatus = "Available"; 
    }

 
    public String getTitle() {
        return title;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

  
    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

  
    public int getPublicationYear() {
        return publicationYear;
    }

    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public String getAvailabilityStatus() {
        return availabilityStatus;
    }


    public boolean borrowBook() {
        if (availabilityStatus=="Available") {
            // if available, borrow it
            availabilityStatus = "Borrowed";
            System.out.println("The book has been borrowed.");
            return true;
        } else {
            System.out.println("The book is not available for borrowing.");
            return false; 
        }
    }

    // Method to return the book
    public void returnBook() {
        availabilityStatus = "Available";
        System.out.println("The book has been returned.");
    }

    // Method to print book details
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Availability: " + availabilityStatus);
    }

    public static void main(String[] args) {
        
        Book book = new Book("Java", "Ram", 2022);
        book.printBookDetails();

        if (book.borrowBook()) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        book.printBookDetails();

        book.returnBook();
        book.printBookDetails();
    }
}
