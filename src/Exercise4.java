class Library{
    String[] books;
    int no_OfBooks;
    String [] issuedbooks;

     Library(){
        this.books = new String[100];
        this.no_OfBooks=0;


    }
    public void addBook(String book){
         this.books[no_OfBooks]=book;
        no_OfBooks++;
        System.out.println(book +"  Your Book has been added on this number  "+no_OfBooks );
    }
    public void issueBook(String issuebook){
         this.issuedbooks =new String[100];
//         no
    }

}

public class Exercise4 {
    public static void main(String[] args) {

        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        //
        Library centrallibrary =new Library();
        centrallibrary.addBook("Grow lonely");
        centrallibrary.addBook("Grow lonely and be rich");


    }
}
