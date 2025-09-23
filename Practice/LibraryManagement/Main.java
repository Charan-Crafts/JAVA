import java.util.ArrayList;

class Admin extends Library{

    public void addBook(String bookName,String authorName,int quantity){

        //Check wheather the Book is exist in the library or not

        for(Books books : bookDetails){

            //If book is already present in the library increment the quantity of Book

            if(books.getBookName().equals(bookName)){
                books.increaseQuantity(quantity);
                
                return;
            }
        }

        //Create a new book Object and add that book into the bookDetails

        Books newBook = new Books(bookName,authorName,quantity);

        bookDetails.add(newBook);

        System.out.println("Book added into the Book Collections");

    }
}
class Library {

    protected ArrayList<Books> bookDetails = new ArrayList<>();

    protected ArrayList<Users> userDetails = new ArrayList<>();

    public ArrayList getBookDetails(){
        return this.bookDetails;
    }

    public ArrayList getUserDetails(){
        return this.userDetails;
    }
    
}
class Books {

    protected String bookID ="BOOK";

    protected static int counter = 0;

    protected String bookName;

    protected String authorName;

    protected int quantity;

    public Books(){

    }
    public Books(String bookName,String authorName,int quantity){
        counter++;
        this.bookID+=counter;
        this.bookName=bookName;
        this.authorName=authorName;
        this.quantity=quantity;
    }

    public String getBookID(){
        return this.bookID;
    }

    public String getAuthorName(){
        return this.authorName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public int getCurrentQuantity(){
        return this.quantity;
    }

    public int increaseQuantity(int quantity){
        return this.quantity+=quantity;
    }

}
class MyBooks extends Library{

    protected String bookName;

    protected String bookID;

    protected int quantity;

    public MyBooks(String bookName,String bookID,int quantity){

        for(Books book: bookDetails){

            if(book.bookName.equals(bookName)){
                this.bookName=book.bookName;
                this.bookID = book.bookID;
                this.quantity+=1;
                return;
            }
        }
            System.out.println("Book not found .. ");
        
    }
}
class Users{

    protected String userName ;

    protected static int counter = 0;

    protected String userID ="USER";

    protected ArrayList <MyBooks> myBooks;

    public Users(String userName){
        counter++;
        this.userID+=counter;
        this.userName = userName;
        this.myBooks = new ArrayList<MyBooks>();
    }
}
public class Main{

    public static void main(String[] args) {
        
    }
}