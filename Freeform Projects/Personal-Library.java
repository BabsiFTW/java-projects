import java.util.HashMap;

public class Library {
  
  public Library() {}
  
    public void getFinishedBooks (HashMap<String, Boolean> Library) {
      if (Library.size() < 1) {
      System.out.println("Attention! HashMap is empty!");
    } else {
      	for(String book: Library.keySet()) {
          if (Library.get(book) == true) {
            System.out.println(book);
          }
        }
    }  
	}
  
  public static void main(String [] args) {
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down the Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("Time In", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    
  }
}
