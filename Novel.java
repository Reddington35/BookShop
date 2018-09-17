import java.time.LocalDate;
//Name James Reddington 15104599
// Novel class derived from Book.

public final class Novel extends Book {
	// Field variables used
    private double bookCost; // member variable used to store double value
    private double discount; // member variable used to store double value
    // constructor for class Novel
    public  Novel(String title, String author, double cost,int year,int month,int day ) {
        super(title, author,LocalDate.of(year, month,day)); // call superclass constructor
        setBookCost(cost);  // method takes in member variable cost
        setDiscount(cost); // method takes in member variable cost
    }

    // set Novel's cost
    public void setBookCost(double cost) {
    	bookCost = (cost);  // method sets cost to member variable bookCost
    }
    
    public void setDiscount(double bookCost) {
		discount = bookCost - ((bookCost * 12)/100);  // method used to apply calculations to member variable discount
}

    public double getDiscount() {  // returns value stored in member variable discount
		return discount;           
    }

    // get Novel's cost
    public double cost() {
    	if(bookCost < 0)        // condition used to check if value stored in bookCost field variable is not negative
        	throw new IllegalArgumentException("No negitive numbers allowed " + bookCost); // throws an exception if true
    	
    	if(getdate().isBefore(LocalDate.of(2013,12,31))) {  // condition to check if date is more than 5 years old , if so sets discount
    		bookCost = getDiscount();
        return bookCost;  // if true returns value in bookCost  with discount applied
    }
    		return bookCost;  // returns same variable if false with standard cost applied
    }
    
    // get String representation of book details
    public String toString() {
        return "Novel: " + super.toString();
    }

} // end class Novel
