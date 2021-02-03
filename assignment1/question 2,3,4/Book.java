package me;

public class Book {
  // this are the attributes for the book class
  String bookName;
  int price;
  String author;
  String genre;

  public Book() {
    super();
  }

  // parameterised constructor to set values
  public Book(String bookName, int price, String author, String genre) {
    super();
    this.bookName = bookName;
    this.price = price;
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

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
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
    return "Book [bookName=" + bookName + ", price=" + price + ", author=" + author + ", genre=" + genre + "]";
  }
}
