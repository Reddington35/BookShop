import java.time.LocalDate;
// Name James Reddington 15104599
// EducationBook class derived from Book

public final class EducationBook extends Book {
	// Field variables used
	private double bookCost; // cost of the book
    private int bookIsbn; // the unique identifier of the education book
    private int quantity; // number of this book required
    private double discount;  // discount value of book
    // constructor for class EducationBook
    public EducationBook(String title, String author,
            double cost, int isbn, int quantity,int year,int month,int day) {
        super(title, author,LocalDate.of(year, month,day)); // call superclass constructor
        setBookCost(cost);  // method takes in cost variable and sets the cost
        setIsbn(isbn);  // method same as above only with isbn
        setQuantity(quantity); // method same as above only with quantity
        setDiscount(cost); // method same as above only with is discount
    }

    // set EducationBook's cost
    public void setBookCost(double cost) {
        bookCost = (cost);  // sets the cost of the book and stores its value in bookCost member variable
        
    }
    
    public void setDiscount(double bookCost) {  // method for calculating discount
		discount = bookCost - ((bookCost * 12)/100);
}

    public double getDiscount() {  // method to return the value stored in member variable discount
		return discount;
    }

    // set EducationBook's isbn
    public void setIsbn(int isbn) {
        bookIsbn = (isbn > 0 ? isbn : 0);
    }

    // set EducationBook's quantity sold
    public void setQuantity(int totalSold) {
        quantity = (totalSold > 0 ? totalSold : 0);
    }

    // determine EducationBook's total cost
    public double cost() {  // same as classic objects method
    	if(bookCost < 0)
        	throw new IllegalArgumentException("No negitive numbers allowed " + bookCost);
    	
    	if(getdate().isBefore(LocalDate.of(2013,12,31))) { // this was a tiny bit tricky due to quantity 
    		bookCost = getDiscount();  // had to make sure it calculated cost and discount on on each individually first
    		bookCost = bookCost * quantity; // then applied multiplication of quantity on member variable bookCost
        return bookCost;  // returns the value stored in bookCost if true
    }
    		return bookCost * quantity; // returns the value stored in bookCost if false
    }
    
    // get String representation of EducationBook's details
    public String toString() {
        return "Education Book: " + super.toString();  // prints toString() method
    }
    
} // end class EducationBook
