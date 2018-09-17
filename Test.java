// Driver for book hierarchy
// Java core packages

import java.text.DecimalFormat;
// Java extension packages
import javax.swing.JOptionPane;

public class Test {
	
	// test book hierarchy
    
	public static void main(String args[]) {
		
        Book book;// superclass reference
        double bookTotal;
        bookTotal = 0;
        String output = "";
        
        DecimalFormat precision2 = new DecimalFormat("0.00");
       
        Book array[] = new Book[3]; // Book object array created what stores up to 3 Book objects.
		
		array[0] = new Novel("Game Of Thrones","J.R.R. Martin", 34.0, 2017, 10, 04); // Novel object of type Book added to the array
		array[1] = new Classic("Gone With The Wind", "Margaret Mitchell", 2017 ,06, 04, 30.0); // Classic object of type Book added to the array
		array[2] = new EducationBook("Mathematics","Dr. Joan Crawford",25.0, 16655443,04,2017,05,24); // EducationBook object of type Book added to the array
		for(Book books:array) {        // for loop created to to move through the objects 
			System.out.println(books);  //and prints out the values held within the parameters of the objects constructor
			try {        							// Try catch created to intercept exception on each object type if cost is a negative double.
			bookTotal = bookTotal +  books.cost();
			output += books.toString() + " costs $"
	                + precision2.format(books.cost()) + "\n" // outputs cost of object in array
					+ "id " + " " + books.getID() + "\n";  //outputs the id
			}catch(IllegalArgumentException e) {  // illegal argument exception caught so book will not output but will continue to the next book if cost is negative
				System.out.println(e);  // print out exception
			}
		}
		output+= "Total Cost is " + precision2.format(bookTotal) + "\n";    // outputs the total cost of all the Book objects

        JOptionPane.showMessageDialog(null, output,
                "Demonstrating Polymorphism",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
} // end class Test
