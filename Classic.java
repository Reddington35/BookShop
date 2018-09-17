import java.time.LocalDate;

public final class Classic extends Book {
	//  Field variables used
	private double bookCost; // cost of the book
    private double discount; // discount for book
    
    // constructor for class Classic
    public Classic(String title, String author,int year,int month,int day,
            double cost) {
        super(title, author,LocalDate.of(year, month, day)); // call superclass constructor
        setBookCost(cost);  // calls this method that takes in the cost
        setDiscount(cost);  // calls this method that takes in the cost and calculates the discount
    }
   
	// Set the cost of the book
    public void setBookCost(double cost) {  //method to set the cost of the bookCost variable
        bookCost = cost; 
    }
    
    public void setDiscount(double bookCost) {  // method that calculus the discount
    		discount = bookCost - ((bookCost * 35)/100);
    }
    
    public double getDiscount() {  // method that returns the value contained within the discount member variable
    		return discount;
    }
    
    // Get the Classic book's cost
    public double cost() { //need to work from here
    	if(bookCost < 0)  // condition used to check if the value in bookCost variable is less that 0 
        	throw new IllegalArgumentException("No negitive numbers allowed " + bookCost);  // and catch the exception if it is true
    	if(getdate().isBefore(LocalDate.of(1968,12,31))) {  //condition to check if object is more than 50 years old using the LocalDate object
    		bookCost = getDiscount(); // applies the getDiscount() method if true
    		return bookCost;  // returns the value stored in member variable bookCost if true
    	}
        return bookCost;  // returns normal cost if false
    }

    public String toString() {
        return "Classic: " + super.toString();  // prints out the toStrng() method
    }
}
