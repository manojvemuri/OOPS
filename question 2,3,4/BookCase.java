// Manoj Kumar Vemuri ID 2022213

class Bookcase {
  ArrayList<Book> bookcase = new ArrayList<>();;
  String genre;

  Bookcase(String genre) {
    this.genre = genre;
  }

  void addBook(Book book) {
    if (book.getGenre().compareTo(genre) == 0) {
      bookcase.add(book);
    } else {
      System.out.println("Book doesn't belong to a different genre");
    }
  }

  // setter for genre
  public void setGenre(String genre) {
    this.genre = genre;
  }

  // getter for genre
  public String getGenre() {
    return genre;
  }

  public void setBookcase(ArrayList<Book> bookcase) {
    this.bookcase = bookcase;
  }

  public ArrayList<Book> getBookcase() {
    return bookcase;
  }

  public String toString() {
    String output = "";

    output += genre + " : \n";
    for (Book book : bookcase) {
      output += "\t" + book.toString() + "\n";
    }
    output += "\n";
    return output;
  }
}
