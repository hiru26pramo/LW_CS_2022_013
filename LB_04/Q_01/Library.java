package LB_04.Q_01;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> BorrowableItemsList = new ArrayList<>();

    //method to add books
    public void  addLibraryItem(Book borrowableBook){
        BorrowableItemsList.add(borrowableBook);
    }

    //method to check out book from the list
    public void checkoutItem(String title){
        boolean isBookFound = false;
        for (Book book : BorrowableItemsList ){
            if(book.isAvailable() && book.getTitle().equals(title)){
                System.out.println("\nThe book you search is available.");
                System.out.println("CheckOut book : " + title);
                book.setAvailable(false);
                isBookFound =true;
            }
        }
        if(!isBookFound){
            System.out.println("\n" +"'"+ title + "'" + " Book  not found.");
        }
    }

    //method to list available books titles
    public void listAvailableItems(){
        System.out.println("\nAvailable Books : ");
        for (Book book : BorrowableItemsList ){
            if(book.isAvailable()){
                System.out.println(" \t\t " + book.getTitle());
            }
        }
    }

    //method to display information about the library
    public void displayLibraryInfo(){
        int bookCount = 0;
        for (Book book : BorrowableItemsList ){
            book.displayInfo();
            System.out.println("\n");
            if(book.isAvailable()){
              bookCount++;
            }
        }
        System.out.println("Number of available books : " + bookCount);
    }



}
