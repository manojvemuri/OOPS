// Manoj Kumar Vemuri ID 2022213

//BookStore class which is a singlton class
//means class which has only one instance
//this contains arraylist of bookcase
//it contains one bookcase for each genre
class Bookstore {
  private static Bookstore instance = null;
  ArrayList<Bookcase> bookstore = new ArrayList<>();

  private Bookstore() {

  }

  // it returns the instance
  public static Bookstore getInsatance() {
    if (instance == null) {
      instance = new Bookstore();
    }
    return instance;
  }

  // this will the book case to the arraylist
  void addBookCase(Bookcase bc) {
    boolean flag = false;
    for (Bookcase bookcase : bookstore) {

      // if bookcase of coming genre already present then it bookstore then
      // it merge with existing one
      if (bookcase.getGenre().compareTo(bc.getGenre()) == 0) {

        System.out.println("This genre bookcase already present...");
        System.out.println("Merging book case");
        flag = true;
        bookcase.bookcase.addAll(bc.bookcase);
        System.out.println("done...");
      }
    }

    // if new gerne comes then it simply add it
    if (flag == false) {
      bookstore.add(bc);
    }
  }

  // return the string form of this class
  public String toString() {
    String output = "";
    for (Bookcase bc : bookstore) {
      output += bc.toString();
    }

    return output;
  }
}
