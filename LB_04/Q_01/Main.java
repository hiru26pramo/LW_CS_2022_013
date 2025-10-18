package LB_04.Q_01;

public class Main {
    private static String Author;

    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975",true );
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala","Seynamasasekaka","9789553548721" ,true  );
        Book book3 = new Book("Island of a Thousand Mirrors","Nayomi Munaweera","9781616953623", true );

        Library library = new Library();

        //add books to library
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        //display library information
        library.displayLibraryInfo();

        //list all available library items
        library.listAvailableItems();

        //checking out a library item
        library.checkoutItem("Island of a Thousand Mirrors");

        library.displayLibraryInfo();


    }
}