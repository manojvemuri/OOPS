package me;


public class Book
{
  public String genre;

  public Book(String genre)
  {
    if(genre.equals("thriller")||genre.equals("novel")||genre.equals("manual")||genre.equals("essay"))
     this.genre = genre;
    else
     throw new IllegalArgumentException("Given Genre is not Valid.");
  }
}