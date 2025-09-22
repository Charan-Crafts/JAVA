import java.util.ArrayList;

class Books {

    private String bookId = "bk";
    private static int counter = 0;
    private String bookTitle;
    private String author;
    private int quantity;

    public Books(String bookName, String authorName, int quantity) {
        counter++;
        this.bookId = this.bookId + counter;
        this.author = authorName;
        this.bookTitle = bookName;
        this.quantity = quantity;
        System.out.println("Book added to the Library..");
    }

    public void displayBookInfo() {
        System.out.println("Book ID : " + getBookId());
        System.out.println("Book Title : " + getBookName());
        System.out.println("Author Name : " + getAuthorName());
        System.out.println("Quantity : " + getQuantity());
        System.out.println("-------------------------------------------------------");

    }

    public String getBookId() {
        return this.bookId;
    }

    public String updateAuthorName(String authorName) {
        return this.author = authorName;
    }

    public String getAuthorName() {
        return this.author;
    }

    public String updateBookName(String newbookname) {
        return this.bookTitle = newbookname;
    }

    public String getBookName() {
        return this.bookTitle;
    }

    public int increaseQuantity(int quantity) {
        return this.quantity += quantity;
    }

    public int decreaseQuantity(int quantity) {
        return this.quantity -= quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

class User {

    private static int counter = 0;

    private String userId = "USER";

    private String userName;

    protected ArrayList<String>myBooks = new ArrayList<>();

    public ArrayList getMyBooks(){
        return myBooks;
    }

    public String getuserId() {
        return this.userId;
    }

    public String getuserName() {
        return this.userName;
    }

    public String updateUserName(String newName) {
        return this.userName = newName;
    }

    public User(String userName) {
        counter++;
        this.userId += counter;
        this.userName = userName;
        
    }

    public void displayUserInfo() {
        System.out.println("User ID : " + getuserId());
        System.out.println("User Name : " + getuserName());
        System.out.println("User Books : "+getMyBooks());
        System.out.println("-------------------------------------------------------");

    }

}

class BorrowedBooks{

    protected String borrowedBookName ;

    protected String borrowedBookId;

    protected int quantity;

    public BorrowedBooks(String bookName,String bookID,int quantity){
        this.borrowedBookId=bookID;
        this.borrowedBookName=bookName;
        this.quantity=quantity;
    }
}


class Library extends User{

    private static ArrayList<Books> library = new ArrayList<>();

    public void addBook(String bookName, String authorName, int quantity) {

        Books book = new Books(bookName, authorName, quantity);

        library.add(book);

        book.displayBookInfo();
    }

    

    public void addUser(String userName) {
        User newUser = new User(userName);
        newUser.displayUserInfo();
    }

    public void allocateBook(String userId,String bookName,String bookID,int quantity){

        //check wheather the book is already borrowed are not.

        for(String book : myBooks){

            if(book==bookName){
                System.out.println("Sorry book is already allocated");
                return;
            }else{
                BorrowedBooks newBook = new BorrowedBooks(bookName, bookID, quantity);
            }
        }
        
    }

}


public class Main {
    public static void main(String[] args) {

        Library admin = new Library();

        admin.addBook("DSA", "Charan", 12);

        admin.addUser("Sudha");

    }
}