package APCompSci.PLTW.Children375Library;

import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();


    String authorToFind = ("L. Frank Baum");
    String bookToFind = ("Sky Island");
    double minimumRating = 0.0;
    for(Book b: childrensBooks){
        if(b.getTitle().equals(bookToFind)){
            minimumRating = b.getRating();
            System.out.println("minimum rating is " + minimumRating);
            for(Book x: childrensBooks){
                if(x.getRating() >= minimumRating){
                    System.out.println(x.getTitle());
                }
            
            }
            break;
        }
    }
  }
}
