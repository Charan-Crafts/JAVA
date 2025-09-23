import java.util.ArrayList;

class Admin extends Library {

    public void addBook(String bookName, String authorName, int quantity) {

        for (Books books : bookDetails) {
            if (books.getBookName().equals(bookName)) {
                books.increaseQuantity(quantity);
                displayBooks();
                return;
            }
        }

        Books newBook = new Books(bookName, authorName, quantity);
        bookDetails.add(newBook);

        System.out.println("Book added into the Book Collections");
        displayBooks();
    }

    public void displayBooks() {
        System.out.println(
                "------------------------------------------ Library Collections -----------------------------------------");

        for (Books book : bookDetails) {
            System.out.println("Book Name : " + book.getBookName());
            System.out.println("Book ID : " + book.getBookID());
            System.out.println("Author Name : " + book.getAuthorName());
            System.out.println("Available Stock : " + book.getCurrentQuantity());
            System.out.println("-----------------------------------------------------------------------");
        }
    }

    public void createUser(String userName) {
        Users newUser = new Users(userName);
        userDetails.add(newUser);
        displayUsers();
    }

    public void displayUsers() {
        System.out.println("-------------------------User Details---------------------------");

        for (Users user : userDetails) {
            System.out.println("User Name : " + user.getUserName());
            System.out.println("User ID   : " + user.getUserId());
            System.out.println("Books     : " + user.getBooks());
            System.out.println("-------------------------------------------------------------");
        }
    }

    public void updateBookName(String bookID, String newbookName) {
        for (Books book : bookDetails) {
            if (book.getBookID().equals(bookID)) {
                String oldName = book.getBookName();
                book.updateBookName(newbookName);
                System.out.println("Book Name is updated from " + oldName + " to " + book.getBookName());
                return;
            }
        }
        System.out.println("Book not found .. ");
    }

    public void updateUserName(String userId, String newName) {
        for (Users user : userDetails) {
            if (user.getUserId().equals(userId)) {
                String oldName = user.getUserName();
                user.updateUserName(newName);
                System.out.println("UserName is updated from " + oldName + " to " + user.getUserName());
                return;
            }
        }
        System.out.println("No user exists with this ID : " + userId);
    }

    public void requestForBook(String userName, String bookName, int quantity) {
        Users requestedUser = null;

        for (Users user : userDetails) {
            if (user.getUserName().equals(userName)) {
                requestedUser = user;
                break;
            }
        }

        if (requestedUser == null) {
            System.out.println("Sorry you are not a member of the Library, please create an account ..");
            return;
        }

        for (Books book : bookDetails) {
            if (book.getBookName().equals(bookName)) {
                if (book.getCurrentQuantity() >= quantity) {
                    book.decreaseQuantity(quantity);
                    requestedUser.borrowBook(book, quantity);
                    return;
                } else {
                    System.out.println("Sorry, not enough stock available ..");
                    return;
                }
            }
        }

        System.out.println("Sorry, book not found in the library");
    }
}

class Library {
    protected ArrayList<Books> bookDetails = new ArrayList<>();
    protected ArrayList<Users> userDetails = new ArrayList<>();

    public ArrayList<Books> getBookDetails() {
        return this.bookDetails;
    }

    public ArrayList<Users> getUserDetails() {
        return this.userDetails;
    }
}

class Books {
    protected String bookID = "BOOK";
    protected static int counter = 0;
    protected String bookName;
    protected String authorName;
    protected int quantity;

    public Books() {
    }

    public Books(String bookName, String authorName, int quantity) {
        counter++;
        this.bookID += counter;
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getBookID() {
        return this.bookID;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getCurrentQuantity() {
        return this.quantity;
    }

    public int increaseQuantity(int quantity) {
        return this.quantity += quantity;
    }

    public String updateBookName(String bookName) {
        return this.bookName = bookName;
    }

    public int decreaseQuantity(int quantity) {
        return this.quantity -= quantity;
    }
}

class MyBooks {
    protected String bookName;
    protected String bookID;
    protected int quantity;

    public MyBooks(String bookName, String bookID, int quantity) {
        this.bookName = bookName;
        this.bookID = bookID;
        this.quantity = quantity;
    }

    public void increaseQuantity(int qty) {
        this.quantity += qty;
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName +
                ", Book ID: " + bookID +
                ", Quantity: " + quantity;
    }
}

class Users {
    protected String userName;
    protected static int counter = 0;
    protected String userID = "USER";
    protected ArrayList<MyBooks> myBooks;

    public Users(String userName) {
        counter++;
        this.userID += counter;
        this.userName = userName;
        this.myBooks = new ArrayList<>();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserId() {
        return this.userID;
    }

    public String updateUserName(String newName) {
        return this.userName = newName;
    }

    public ArrayList<MyBooks> getBooks() {
        return this.myBooks;
    }

    public void borrowBook(Books book, int quantity) {
        for (MyBooks mb : myBooks) {
            if (mb.bookName.equals(book.getBookName())) {
                mb.increaseQuantity(quantity);
                System.out.println(userName + " borrowed another copy of: " + book.getBookName());
                return;
            }
        }
        myBooks.add(new MyBooks(book.getBookName(), book.getBookID(), quantity));
        System.out.println(userName + " borrowed: " + book.getBookName());
    }
}

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();

        admin.addBook("Java Basics", "Charan", 5);
        admin.addBook("Python Essentials", "Sudha", 3);

        admin.createUser("Sudha");

        admin.requestForBook("Sudha", "Java Basics", 1);
        admin.requestForBook("Sudha", "Python Essentials", 1);

        admin.displayUsers();
    }
}
