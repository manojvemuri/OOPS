import java.util.*;

public class Bookstore {

  private static Bookstore instance;
  Set<Bookcase> bookcases = new HashSet();

  public void addBookcase(Bookcase holder) {
    boolean exists = false;
    for (Bookcase bookcase : bookcases)
      if (holder.getGenre().equals(bookcase.getGenre()))
        exists = true;

    if (!exists)
      bookcases.add(holder);
    else
      throw new IllegalArgumentException(" Bookcase already exists.");
  }

  public static Bookstore getInstance() {
    if (instance == null)
      return new Bookstore();
    else
      return instance;
  }
}