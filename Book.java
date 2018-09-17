import java.time.LocalDate;

// Abstract base class Book.
// Name James Reddington 15104599

public abstract class Book {  // parent class created 
	//  Field Variable used
    private String bookTitle;  // member variable created to store String value
    private String bookAuthor; // member variable created to store String value
    private LocalDate publishDate;  // member variable created to store LocalDate objects value
    private  static int idCount;  // member variable created to store int value
    private final int idNumber;  // member variable created to store int value , made final so id wont be changed on user
    // constructor
    public Book(String title, String author,LocalDate date) {  // all other classes related to type Book object will inherit these parameters
        bookTitle = title;  // stores title
        bookAuthor = author;  // stores author
        publishDate = date;  // stores date
        idNumber = idCount++;  // so idNumber will increment every time the constructor is called
    }
    
    // get bookTitle
    public String getbookTitle() {  // method created to return value stored in bookTitle member variable
        return bookTitle;
    }
    
 // get bookAuthor
    public String getbookAuthor() {  // method created to return value stored in bookAuthor member variable
        return bookAuthor;
    }
     
    public LocalDate getdate(){  // method created to return value stored in publishDate member variable
    		return publishDate;
    }
    
    
    public int getID() {  // method created to return value stored in idNumber member variable
    		return idNumber;
    }
   
    public String toString() {  // toString() method created to output stored values
        return bookTitle + '-' + "Author: " + bookAuthor + '-' + " Date of publication:  "  + publishDate;
    }
   
    public abstract double cost();  // abstract method for cost that all child classes will implement
}
