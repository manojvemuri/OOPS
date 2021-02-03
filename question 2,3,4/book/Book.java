// Manoj Kumar Vemuri ID 2022213

public class Book {
  // declaring attributes
  String name;
  int cost;
  String author;
  String genre;

  public Book() {
    super();
  }

 
  public Book(String name, int cost, String author, String genre) {
    super();
    this.name = name;
    this.cost = cost;
    this.author = author;
    this.genre = genre;
  }
  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
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
    return "Book [name=" + name + ", cost=" + cost + ", author=" + author + ", genre=" + genre + "]";
  }
}
