package me;

public class Book {
  // declaring attributes
  String bookName;
  int cost;
  String author;
  String genre;

  public Book() {
    super();
  }

  // parameterised constructor to set values
  public Book(String bookName, int cost, String author, String genre) {
    super();
    this.bookName = bookName;
    this.cost = cost;
    this.author = author;
    this.genre = genre;
  }

  // accessor and mutators for book attribute
  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public int getcost() {
    return cost;
  }

  public void setcost(int cost) {
    this.cost = cost;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    if (genre.equals("thriller") || genre.equals("novel") || genre.equals("manual") || genre.equals("essay"))
      this.genre = genre;
    else
      throw new IllegalArgumentException("Given Genre is not Valid.");
  }

  @Override
  public String toString() {
    return "Book [bookName=" + bookName + ", cost=" + cost + ", author=" + author + ", genre=" + genre + "]";
  }
}
