package Theory;
//SCENARIO 3 - 1ST
public class SamplePaper{
    int BookId = 101;
    String BookTitle = "The Art OF Sun Tzu";
    int StudentId = 245;
    void displayBookDetails(){
        System.out.println("Book ID: " + BookId);
        System.out.println("Book Title: " + BookTitle);
        System.out.println("Student ID: " + StudentId);
    }
//SCENARIO 3 - 2ND
    void checkAvailability(int bookId, String bookStatus){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Status: " + bookStatus);
    }
//SCENARIO 3 - 3RD
    String getBookStatus(){
        return "Available";
    }
    public static void main(String[] args) {
        SamplePaper sp = new SamplePaper();
        sp.displayBookDetails();
        sp.checkAvailability(987, "Available");
        System.out.println("Status: " + sp.getBookStatus());
        

//PRACTICE PAPER QUESTION 15

        
    }
}

